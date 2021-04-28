package net.minestom.server.particle;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.function.BiFunction;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.particle.data.BlockParticleData;
import net.minestom.server.particle.data.DustParticleData;
import net.minestom.server.particle.data.ItemParticleData;
import net.minestom.server.particle.data.ParticleData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED
 */
public class Particle<T extends ParticleData> implements Keyed {
    public static final Particle<ParticleData> AMBIENT_ENTITY_EFFECT = new Particle<ParticleData>(NamespaceID.from("minecraft:ambient_entity_effect"), ParticleData.READER);

    public static final Particle<ParticleData> ANGRY_VILLAGER = new Particle<ParticleData>(NamespaceID.from("minecraft:angry_villager"), ParticleData.READER);

    public static final Particle<ParticleData> BARRIER = new Particle<ParticleData>(NamespaceID.from("minecraft:barrier"), ParticleData.READER);

    public static final Particle<BlockParticleData> BLOCK = new Particle<BlockParticleData>(NamespaceID.from("minecraft:block"), BlockParticleData.READER);

    public static final Particle<ParticleData> BUBBLE = new Particle<ParticleData>(NamespaceID.from("minecraft:bubble"), ParticleData.READER);

    public static final Particle<ParticleData> CLOUD = new Particle<ParticleData>(NamespaceID.from("minecraft:cloud"), ParticleData.READER);

    public static final Particle<ParticleData> CRIT = new Particle<ParticleData>(NamespaceID.from("minecraft:crit"), ParticleData.READER);

    public static final Particle<ParticleData> DAMAGE_INDICATOR = new Particle<ParticleData>(NamespaceID.from("minecraft:damage_indicator"), ParticleData.READER);

    public static final Particle<ParticleData> DRAGON_BREATH = new Particle<ParticleData>(NamespaceID.from("minecraft:dragon_breath"), ParticleData.READER);

    public static final Particle<ParticleData> DRIPPING_LAVA = new Particle<ParticleData>(NamespaceID.from("minecraft:dripping_lava"), ParticleData.READER);

    public static final Particle<ParticleData> FALLING_LAVA = new Particle<ParticleData>(NamespaceID.from("minecraft:falling_lava"), ParticleData.READER);

    public static final Particle<ParticleData> LANDING_LAVA = new Particle<ParticleData>(NamespaceID.from("minecraft:landing_lava"), ParticleData.READER);

    public static final Particle<ParticleData> DRIPPING_WATER = new Particle<ParticleData>(NamespaceID.from("minecraft:dripping_water"), ParticleData.READER);

    public static final Particle<ParticleData> FALLING_WATER = new Particle<ParticleData>(NamespaceID.from("minecraft:falling_water"), ParticleData.READER);

    public static final Particle<DustParticleData> DUST = new Particle<DustParticleData>(NamespaceID.from("minecraft:dust"), DustParticleData.READER);

    public static final Particle<ParticleData> EFFECT = new Particle<ParticleData>(NamespaceID.from("minecraft:effect"), ParticleData.READER);

    public static final Particle<ParticleData> ELDER_GUARDIAN = new Particle<ParticleData>(NamespaceID.from("minecraft:elder_guardian"), ParticleData.READER);

    public static final Particle<ParticleData> ENCHANTED_HIT = new Particle<ParticleData>(NamespaceID.from("minecraft:enchanted_hit"), ParticleData.READER);

    public static final Particle<ParticleData> ENCHANT = new Particle<ParticleData>(NamespaceID.from("minecraft:enchant"), ParticleData.READER);

    public static final Particle<ParticleData> END_ROD = new Particle<ParticleData>(NamespaceID.from("minecraft:end_rod"), ParticleData.READER);

    public static final Particle<ParticleData> ENTITY_EFFECT = new Particle<ParticleData>(NamespaceID.from("minecraft:entity_effect"), ParticleData.READER);

    public static final Particle<ParticleData> EXPLOSION_EMITTER = new Particle<ParticleData>(NamespaceID.from("minecraft:explosion_emitter"), ParticleData.READER);

    public static final Particle<ParticleData> EXPLOSION = new Particle<ParticleData>(NamespaceID.from("minecraft:explosion"), ParticleData.READER);

    public static final Particle<BlockParticleData> FALLING_DUST = new Particle<BlockParticleData>(NamespaceID.from("minecraft:falling_dust"), BlockParticleData.READER);

    public static final Particle<ParticleData> FIREWORK = new Particle<ParticleData>(NamespaceID.from("minecraft:firework"), ParticleData.READER);

    public static final Particle<ParticleData> FISHING = new Particle<ParticleData>(NamespaceID.from("minecraft:fishing"), ParticleData.READER);

    public static final Particle<ParticleData> FLAME = new Particle<ParticleData>(NamespaceID.from("minecraft:flame"), ParticleData.READER);

    public static final Particle<ParticleData> SOUL_FIRE_FLAME = new Particle<ParticleData>(NamespaceID.from("minecraft:soul_fire_flame"), ParticleData.READER);

    public static final Particle<ParticleData> SOUL = new Particle<ParticleData>(NamespaceID.from("minecraft:soul"), ParticleData.READER);

    public static final Particle<ParticleData> FLASH = new Particle<ParticleData>(NamespaceID.from("minecraft:flash"), ParticleData.READER);

    public static final Particle<ParticleData> HAPPY_VILLAGER = new Particle<ParticleData>(NamespaceID.from("minecraft:happy_villager"), ParticleData.READER);

    public static final Particle<ParticleData> COMPOSTER = new Particle<ParticleData>(NamespaceID.from("minecraft:composter"), ParticleData.READER);

    public static final Particle<ParticleData> HEART = new Particle<ParticleData>(NamespaceID.from("minecraft:heart"), ParticleData.READER);

    public static final Particle<ParticleData> INSTANT_EFFECT = new Particle<ParticleData>(NamespaceID.from("minecraft:instant_effect"), ParticleData.READER);

    public static final Particle<ItemParticleData> ITEM = new Particle<ItemParticleData>(NamespaceID.from("minecraft:item"), ItemParticleData.READER);

    public static final Particle<ParticleData> ITEM_SLIME = new Particle<ParticleData>(NamespaceID.from("minecraft:item_slime"), ParticleData.READER);

    public static final Particle<ParticleData> ITEM_SNOWBALL = new Particle<ParticleData>(NamespaceID.from("minecraft:item_snowball"), ParticleData.READER);

    public static final Particle<ParticleData> LARGE_SMOKE = new Particle<ParticleData>(NamespaceID.from("minecraft:large_smoke"), ParticleData.READER);

    public static final Particle<ParticleData> LAVA = new Particle<ParticleData>(NamespaceID.from("minecraft:lava"), ParticleData.READER);

    public static final Particle<ParticleData> MYCELIUM = new Particle<ParticleData>(NamespaceID.from("minecraft:mycelium"), ParticleData.READER);

    public static final Particle<ParticleData> NOTE = new Particle<ParticleData>(NamespaceID.from("minecraft:note"), ParticleData.READER);

    public static final Particle<ParticleData> POOF = new Particle<ParticleData>(NamespaceID.from("minecraft:poof"), ParticleData.READER);

    public static final Particle<ParticleData> PORTAL = new Particle<ParticleData>(NamespaceID.from("minecraft:portal"), ParticleData.READER);

    public static final Particle<ParticleData> RAIN = new Particle<ParticleData>(NamespaceID.from("minecraft:rain"), ParticleData.READER);

    public static final Particle<ParticleData> SMOKE = new Particle<ParticleData>(NamespaceID.from("minecraft:smoke"), ParticleData.READER);

    public static final Particle<ParticleData> SNEEZE = new Particle<ParticleData>(NamespaceID.from("minecraft:sneeze"), ParticleData.READER);

    public static final Particle<ParticleData> SPIT = new Particle<ParticleData>(NamespaceID.from("minecraft:spit"), ParticleData.READER);

    public static final Particle<ParticleData> SQUID_INK = new Particle<ParticleData>(NamespaceID.from("minecraft:squid_ink"), ParticleData.READER);

    public static final Particle<ParticleData> SWEEP_ATTACK = new Particle<ParticleData>(NamespaceID.from("minecraft:sweep_attack"), ParticleData.READER);

    public static final Particle<ParticleData> TOTEM_OF_UNDYING = new Particle<ParticleData>(NamespaceID.from("minecraft:totem_of_undying"), ParticleData.READER);

    public static final Particle<ParticleData> UNDERWATER = new Particle<ParticleData>(NamespaceID.from("minecraft:underwater"), ParticleData.READER);

    public static final Particle<ParticleData> SPLASH = new Particle<ParticleData>(NamespaceID.from("minecraft:splash"), ParticleData.READER);

    public static final Particle<ParticleData> WITCH = new Particle<ParticleData>(NamespaceID.from("minecraft:witch"), ParticleData.READER);

    public static final Particle<ParticleData> BUBBLE_POP = new Particle<ParticleData>(NamespaceID.from("minecraft:bubble_pop"), ParticleData.READER);

    public static final Particle<ParticleData> CURRENT_DOWN = new Particle<ParticleData>(NamespaceID.from("minecraft:current_down"), ParticleData.READER);

    public static final Particle<ParticleData> BUBBLE_COLUMN_UP = new Particle<ParticleData>(NamespaceID.from("minecraft:bubble_column_up"), ParticleData.READER);

    public static final Particle<ParticleData> NAUTILUS = new Particle<ParticleData>(NamespaceID.from("minecraft:nautilus"), ParticleData.READER);

    public static final Particle<ParticleData> DOLPHIN = new Particle<ParticleData>(NamespaceID.from("minecraft:dolphin"), ParticleData.READER);

    public static final Particle<ParticleData> CAMPFIRE_COSY_SMOKE = new Particle<ParticleData>(NamespaceID.from("minecraft:campfire_cosy_smoke"), ParticleData.READER);

    public static final Particle<ParticleData> CAMPFIRE_SIGNAL_SMOKE = new Particle<ParticleData>(NamespaceID.from("minecraft:campfire_signal_smoke"), ParticleData.READER);

    public static final Particle<ParticleData> DRIPPING_HONEY = new Particle<ParticleData>(NamespaceID.from("minecraft:dripping_honey"), ParticleData.READER);

    public static final Particle<ParticleData> FALLING_HONEY = new Particle<ParticleData>(NamespaceID.from("minecraft:falling_honey"), ParticleData.READER);

    public static final Particle<ParticleData> LANDING_HONEY = new Particle<ParticleData>(NamespaceID.from("minecraft:landing_honey"), ParticleData.READER);

    public static final Particle<ParticleData> FALLING_NECTAR = new Particle<ParticleData>(NamespaceID.from("minecraft:falling_nectar"), ParticleData.READER);

    public static final Particle<ParticleData> ASH = new Particle<ParticleData>(NamespaceID.from("minecraft:ash"), ParticleData.READER);

    public static final Particle<ParticleData> CRIMSON_SPORE = new Particle<ParticleData>(NamespaceID.from("minecraft:crimson_spore"), ParticleData.READER);

    public static final Particle<ParticleData> WARPED_SPORE = new Particle<ParticleData>(NamespaceID.from("minecraft:warped_spore"), ParticleData.READER);

    public static final Particle<ParticleData> DRIPPING_OBSIDIAN_TEAR = new Particle<ParticleData>(NamespaceID.from("minecraft:dripping_obsidian_tear"), ParticleData.READER);

    public static final Particle<ParticleData> FALLING_OBSIDIAN_TEAR = new Particle<ParticleData>(NamespaceID.from("minecraft:falling_obsidian_tear"), ParticleData.READER);

    public static final Particle<ParticleData> LANDING_OBSIDIAN_TEAR = new Particle<ParticleData>(NamespaceID.from("minecraft:landing_obsidian_tear"), ParticleData.READER);

    public static final Particle<ParticleData> REVERSE_PORTAL = new Particle<ParticleData>(NamespaceID.from("minecraft:reverse_portal"), ParticleData.READER);

    public static final Particle<ParticleData> WHITE_ASH = new Particle<ParticleData>(NamespaceID.from("minecraft:white_ash"), ParticleData.READER);

    static {
        Registry.PARTICLE_REGISTRY.register(AMBIENT_ENTITY_EFFECT);
        Registry.PARTICLE_REGISTRY.register(ANGRY_VILLAGER);
        Registry.PARTICLE_REGISTRY.register(BARRIER);
        Registry.PARTICLE_REGISTRY.register(BLOCK);
        Registry.PARTICLE_REGISTRY.register(BUBBLE);
        Registry.PARTICLE_REGISTRY.register(CLOUD);
        Registry.PARTICLE_REGISTRY.register(CRIT);
        Registry.PARTICLE_REGISTRY.register(DAMAGE_INDICATOR);
        Registry.PARTICLE_REGISTRY.register(DRAGON_BREATH);
        Registry.PARTICLE_REGISTRY.register(DRIPPING_LAVA);
        Registry.PARTICLE_REGISTRY.register(FALLING_LAVA);
        Registry.PARTICLE_REGISTRY.register(LANDING_LAVA);
        Registry.PARTICLE_REGISTRY.register(DRIPPING_WATER);
        Registry.PARTICLE_REGISTRY.register(FALLING_WATER);
        Registry.PARTICLE_REGISTRY.register(DUST);
        Registry.PARTICLE_REGISTRY.register(EFFECT);
        Registry.PARTICLE_REGISTRY.register(ELDER_GUARDIAN);
        Registry.PARTICLE_REGISTRY.register(ENCHANTED_HIT);
        Registry.PARTICLE_REGISTRY.register(ENCHANT);
        Registry.PARTICLE_REGISTRY.register(END_ROD);
        Registry.PARTICLE_REGISTRY.register(ENTITY_EFFECT);
        Registry.PARTICLE_REGISTRY.register(EXPLOSION_EMITTER);
        Registry.PARTICLE_REGISTRY.register(EXPLOSION);
        Registry.PARTICLE_REGISTRY.register(FALLING_DUST);
        Registry.PARTICLE_REGISTRY.register(FIREWORK);
        Registry.PARTICLE_REGISTRY.register(FISHING);
        Registry.PARTICLE_REGISTRY.register(FLAME);
        Registry.PARTICLE_REGISTRY.register(SOUL_FIRE_FLAME);
        Registry.PARTICLE_REGISTRY.register(SOUL);
        Registry.PARTICLE_REGISTRY.register(FLASH);
        Registry.PARTICLE_REGISTRY.register(HAPPY_VILLAGER);
        Registry.PARTICLE_REGISTRY.register(COMPOSTER);
        Registry.PARTICLE_REGISTRY.register(HEART);
        Registry.PARTICLE_REGISTRY.register(INSTANT_EFFECT);
        Registry.PARTICLE_REGISTRY.register(ITEM);
        Registry.PARTICLE_REGISTRY.register(ITEM_SLIME);
        Registry.PARTICLE_REGISTRY.register(ITEM_SNOWBALL);
        Registry.PARTICLE_REGISTRY.register(LARGE_SMOKE);
        Registry.PARTICLE_REGISTRY.register(LAVA);
        Registry.PARTICLE_REGISTRY.register(MYCELIUM);
        Registry.PARTICLE_REGISTRY.register(NOTE);
        Registry.PARTICLE_REGISTRY.register(POOF);
        Registry.PARTICLE_REGISTRY.register(PORTAL);
        Registry.PARTICLE_REGISTRY.register(RAIN);
        Registry.PARTICLE_REGISTRY.register(SMOKE);
        Registry.PARTICLE_REGISTRY.register(SNEEZE);
        Registry.PARTICLE_REGISTRY.register(SPIT);
        Registry.PARTICLE_REGISTRY.register(SQUID_INK);
        Registry.PARTICLE_REGISTRY.register(SWEEP_ATTACK);
        Registry.PARTICLE_REGISTRY.register(TOTEM_OF_UNDYING);
        Registry.PARTICLE_REGISTRY.register(UNDERWATER);
        Registry.PARTICLE_REGISTRY.register(SPLASH);
        Registry.PARTICLE_REGISTRY.register(WITCH);
        Registry.PARTICLE_REGISTRY.register(BUBBLE_POP);
        Registry.PARTICLE_REGISTRY.register(CURRENT_DOWN);
        Registry.PARTICLE_REGISTRY.register(BUBBLE_COLUMN_UP);
        Registry.PARTICLE_REGISTRY.register(NAUTILUS);
        Registry.PARTICLE_REGISTRY.register(DOLPHIN);
        Registry.PARTICLE_REGISTRY.register(CAMPFIRE_COSY_SMOKE);
        Registry.PARTICLE_REGISTRY.register(CAMPFIRE_SIGNAL_SMOKE);
        Registry.PARTICLE_REGISTRY.register(DRIPPING_HONEY);
        Registry.PARTICLE_REGISTRY.register(FALLING_HONEY);
        Registry.PARTICLE_REGISTRY.register(LANDING_HONEY);
        Registry.PARTICLE_REGISTRY.register(FALLING_NECTAR);
        Registry.PARTICLE_REGISTRY.register(ASH);
        Registry.PARTICLE_REGISTRY.register(CRIMSON_SPORE);
        Registry.PARTICLE_REGISTRY.register(WARPED_SPORE);
        Registry.PARTICLE_REGISTRY.register(DRIPPING_OBSIDIAN_TEAR);
        Registry.PARTICLE_REGISTRY.register(FALLING_OBSIDIAN_TEAR);
        Registry.PARTICLE_REGISTRY.register(LANDING_OBSIDIAN_TEAR);
        Registry.PARTICLE_REGISTRY.register(REVERSE_PORTAL);
        Registry.PARTICLE_REGISTRY.register(WHITE_ASH);
    }

    @NotNull
    private final NamespaceID id;

    @NotNull
    private final BiFunction<Particle<T>, @Nullable String, T> dataReader;

    protected Particle(@NotNull NamespaceID id,
                       @NotNull BiFunction<Particle<T>, @Nullable String, T> dataReader) {
        this.id = id;
        this.dataReader = dataReader;
    }

    @Override
    @NotNull
    public Key key() {
        return this.id;
    }

    @NotNull
    public NamespaceID getId() {
        return this.id;
    }

    @Nullable
    public T readData(@Nullable String data) {
        return this.dataReader.apply(this, data);
    }

    public int getNumericalId() {
        return Registry.PARTICLE_REGISTRY.getId(this);
    }

    @Nullable
    public static Particle<?> fromId(int id) {
        return Registry.PARTICLE_REGISTRY.get((short) id);
    }

    @NotNull
    public static Particle<?> fromId(Key id) {
        return Registry.PARTICLE_REGISTRY.get(id);
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }

    @NotNull
    public static List<Particle<?>> values() {
        return Registry.PARTICLE_REGISTRY.values();
    }
}
