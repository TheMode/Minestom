package net.minestom.server.instance.block;

import net.minestom.server.registry.ProtocolObject;
import net.minestom.server.registry.Registry;
import net.minestom.server.tag.Tag;
import net.minestom.server.tag.TagReadable;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiPredicate;

/**
 * Represents a block that can be placed anywhere.
 * Block objects are expected to be reusable and therefore do not
 * retain placement data (e.g. block position)
 * <p>
 * Implementations are expected to be immutable.
 */
public interface Block extends ProtocolObject, TagReadable, BlockConstants {

    /**
     * Creates a new block with the the property {@code property} sets to {@code value}.
     *
     * @param property the property name
     * @param value    the property value
     * @return a new block with its property changed
     * @throws IllegalArgumentException if the property or value are invalid
     */
    @Contract(pure = true)
    @NotNull Block withProperty(@NotNull String property, @NotNull String value);

    /**
     * Changes multiple properties at once.
     * <p>
     * Equivalent to calling {@link #withProperty(String, String)} for each map entry.
     *
     * @param properties map containing all the properties to change
     * @return a new block with its properties changed
     * @throws IllegalArgumentException if the property or value are invalid
     * @see #withProperty(String, String)
     */
    @Contract(pure = true)
    default @NotNull Block withProperties(@NotNull Map<@NotNull String, @NotNull String> properties) {
        Block block = this;
        for (var entry : properties.entrySet()) {
            block = block.withProperty(entry.getKey(), entry.getValue());
        }
        return block;
    }

    /**
     * Creates a new block with different nbt data.
     *
     * @param compound the new block nbt, null to remove
     * @return a new block with different nbt
     */
    @Contract(pure = true)
    @NotNull Block withNbt(@Nullable NBTCompound compound);

    /**
     * Creates a new block with a tag value modified.
     *
     * @param tag   the tag to modify
     * @param value the tag value, null to remove
     * @param <T>   the tag type
     * @return a new block with the modified tag
     */
    @Contract(pure = true)
    default <T> @NotNull Block withTag(@NotNull Tag<T> tag, @Nullable T value) {
        var compound = Objects.requireNonNullElseGet(nbt(), NBTCompound::new);
        tag.write(compound, value);
        return withNbt(compound);
    }

    /**
     * Creates a new block with the specified {@link BlockHandler handler}.
     *
     * @param handler the new block handler, null to remove
     * @return a new block with the specified handler
     */
    @Contract(pure = true)
    @NotNull Block withHandler(@Nullable BlockHandler handler);

    /**
     * Returns an unmodifiable view to the block nbt.
     *
     * @return the block nbt, null if not present
     */
    @Contract(pure = true)
    @Nullable NBTCompound nbt();

    /**
     * Returns the block handler.
     *
     * @return the block handler, null if not present
     */
    @Contract(pure = true)
    @Nullable BlockHandler handler();

    /**
     * Returns the block properties.
     *
     * @return the block properties map
     */
    @Unmodifiable
    @Contract(pure = true)
    @NotNull Map<String, String> properties();

    /**
     * Returns a property value from {@link #properties()}.
     *
     * @param property the property name
     * @return the property value, null if not present (due to an invalid property name)
     */
    @Contract(pure = true)
    default String getProperty(@NotNull String property) {
        return properties().get(property);
    }

    /**
     * Returns the block registry.
     * <p>
     * Registry data is directly linked to {@link #stateId()}.
     *
     * @return the block registry
     */
    @Contract(pure = true)
    @NotNull Registry.BlockEntry registry();

    @Override
    default @NotNull NamespaceID namespace() {
        return registry().namespace();
    }

    @Override
    default int id() {
        return registry().id();
    }

    default short stateId() {
        return (short) registry().stateId();
    }

    default boolean isAir() {
        return registry().isAir();
    }

    default boolean isSolid() {
        return registry().isSolid();
    }

    default boolean isLiquid() {
        return registry().isLiquid();
    }

    default boolean compare(@NotNull Block block, @NotNull Comparator comparator) {
        return comparator.test(this, block);
    }

    default boolean compare(@NotNull Block block) {
        return compare(block, Comparator.ID);
    }

    static @Nullable Block fromNamespaceId(@NotNull String namespaceID) {
        return BlockLoader.get(namespaceID);
    }

    static @Nullable Block fromNamespaceId(@NotNull NamespaceID namespaceID) {
        return fromNamespaceId(namespaceID.asString());
    }

    static @Nullable Block fromStateId(short stateId) {
        return BlockLoader.getState(stateId);
    }

    static @Nullable Block fromBlockId(int blockId) {
        return BlockLoader.getId(blockId);
    }

    @FunctionalInterface
    interface Comparator extends BiPredicate<Block, Block> {
        Comparator IDENTITY = (b1, b2) -> b1 == b2;

        Comparator ID = (b1, b2) -> b1.id() == b2.id();

        Comparator STATE = (b1, b2) -> b1.stateId() == b2.stateId();
    }
}