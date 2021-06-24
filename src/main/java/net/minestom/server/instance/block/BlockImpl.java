package net.minestom.server.instance.block;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import net.minestom.server.registry.Registry;
import net.minestom.server.tag.Tag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class BlockImpl implements Block {

    private static final Cache<NBTCompound, NBTCompound> NBT_CACHE = Caffeine.newBuilder()
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .weakValues()
            .build();

    private final Registry.BlockEntry registry;
    private final Map<String, String> properties;
    private final NBTCompound nbt;
    private final BlockHandler handler;

    BlockImpl(@NotNull Registry.BlockEntry registry,
              @NotNull Map<String, String> properties,
              @Nullable NBTCompound nbt,
              @Nullable BlockHandler handler) {
        this.registry = registry;
        this.properties = Collections.unmodifiableMap(properties);
        this.nbt = nbt;
        this.handler = handler;
    }

    BlockImpl(@NotNull Registry.BlockEntry registry,
              @NotNull Map<String, String> properties) {
        this(registry, properties, null, null);
    }

    @Override
    public @NotNull Block withProperty(@NotNull String property, @NotNull String value) {
        var properties = new HashMap<>(this.properties);
        properties.put(property, value);
        Block block = BlockLoader.getProperties(name(), properties);
        if (block == null)
            throw new IllegalArgumentException("Invalid property: " + property + ":" + value);
        if (nbt != null || handler != null)
            return new BlockImpl(block.registry(), block.properties(), nbt, handler);
        return block;
    }

    @Override
    public @NotNull Block withNbt(@Nullable NBTCompound compound) {
        final var clonedNbt = compound != null ? compound.deepClone() : null;
        final var cachedNbt = NBT_CACHE.get(clonedNbt, c -> clonedNbt);
        return new BlockImpl(registry, properties, cachedNbt, handler);
    }

    @Override
    public @NotNull Block withHandler(@Nullable BlockHandler handler) {
        return new BlockImpl(registry, properties, nbt, handler);
    }

    @Override
    public @Nullable NBTCompound nbt() {
        // TODO return immutable compound without clone
        return nbt != null ? nbt.deepClone() : null;
    }

    @Override
    public @Nullable BlockHandler handler() {
        return handler;
    }

    @Override
    public @NotNull Map<String, String> properties() {
        return properties;
    }

    @Override
    public @NotNull Registry.BlockEntry registry() {
        return registry;
    }

    @Override
    public <T> @Nullable T getTag(@NotNull Tag<T> tag) {
        if (nbt == null)
            return null;
        return tag.read(nbt);
    }
}