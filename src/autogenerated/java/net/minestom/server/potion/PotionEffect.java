package net.minestom.server.potion;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * AUTOGENERATED by PotionEffectGenerator
 */
public class PotionEffect implements Keyed {
    public static final PotionEffect MOVEMENT_SPEED = new PotionEffect(NamespaceID.from("minecraft:speed"), 8171462, false);

    public static final PotionEffect MOVEMENT_SLOWDOWN = new PotionEffect(NamespaceID.from("minecraft:slowness"), 5926017, false);

    public static final PotionEffect DIG_SPEED = new PotionEffect(NamespaceID.from("minecraft:haste"), 14270531, false);

    public static final PotionEffect DIG_SLOWDOWN = new PotionEffect(NamespaceID.from("minecraft:mining_fatigue"), 4866583, false);

    public static final PotionEffect DAMAGE_BOOST = new PotionEffect(NamespaceID.from("minecraft:strength"), 9643043, false);

    public static final PotionEffect HEAL = new PotionEffect(NamespaceID.from("minecraft:instant_health"), 16262179, true);

    public static final PotionEffect HARM = new PotionEffect(NamespaceID.from("minecraft:instant_damage"), 4393481, true);

    public static final PotionEffect JUMP = new PotionEffect(NamespaceID.from("minecraft:jump_boost"), 2293580, false);

    public static final PotionEffect CONFUSION = new PotionEffect(NamespaceID.from("minecraft:nausea"), 5578058, false);

    public static final PotionEffect REGENERATION = new PotionEffect(NamespaceID.from("minecraft:regeneration"), 13458603, false);

    public static final PotionEffect DAMAGE_RESISTANCE = new PotionEffect(NamespaceID.from("minecraft:resistance"), 10044730, false);

    public static final PotionEffect FIRE_RESISTANCE = new PotionEffect(NamespaceID.from("minecraft:fire_resistance"), 14981690, false);

    public static final PotionEffect WATER_BREATHING = new PotionEffect(NamespaceID.from("minecraft:water_breathing"), 3035801, false);

    public static final PotionEffect INVISIBILITY = new PotionEffect(NamespaceID.from("minecraft:invisibility"), 8356754, false);

    public static final PotionEffect BLINDNESS = new PotionEffect(NamespaceID.from("minecraft:blindness"), 2039587, false);

    public static final PotionEffect NIGHT_VISION = new PotionEffect(NamespaceID.from("minecraft:night_vision"), 2039713, false);

    public static final PotionEffect HUNGER = new PotionEffect(NamespaceID.from("minecraft:hunger"), 5797459, false);

    public static final PotionEffect WEAKNESS = new PotionEffect(NamespaceID.from("minecraft:weakness"), 4738376, false);

    public static final PotionEffect POISON = new PotionEffect(NamespaceID.from("minecraft:poison"), 5149489, false);

    public static final PotionEffect WITHER = new PotionEffect(NamespaceID.from("minecraft:wither"), 3484199, false);

    public static final PotionEffect HEALTH_BOOST = new PotionEffect(NamespaceID.from("minecraft:health_boost"), 16284963, false);

    public static final PotionEffect ABSORPTION = new PotionEffect(NamespaceID.from("minecraft:absorption"), 2445989, false);

    public static final PotionEffect SATURATION = new PotionEffect(NamespaceID.from("minecraft:saturation"), 16262179, true);

    public static final PotionEffect GLOWING = new PotionEffect(NamespaceID.from("minecraft:glowing"), 9740385, false);

    public static final PotionEffect LEVITATION = new PotionEffect(NamespaceID.from("minecraft:levitation"), 13565951, false);

    public static final PotionEffect LUCK = new PotionEffect(NamespaceID.from("minecraft:luck"), 3381504, false);

    public static final PotionEffect UNLUCK = new PotionEffect(NamespaceID.from("minecraft:unluck"), 12624973, false);

    public static final PotionEffect SLOW_FALLING = new PotionEffect(NamespaceID.from("minecraft:slow_falling"), 16773073, false);

    public static final PotionEffect CONDUIT_POWER = new PotionEffect(NamespaceID.from("minecraft:conduit_power"), 1950417, false);

    public static final PotionEffect DOLPHINS_GRACE = new PotionEffect(NamespaceID.from("minecraft:dolphins_grace"), 8954814, false);

    public static final PotionEffect BAD_OMEN = new PotionEffect(NamespaceID.from("minecraft:bad_omen"), 745784, false);

    public static final PotionEffect HERO_OF_THE_VILLAGE = new PotionEffect(NamespaceID.from("minecraft:hero_of_the_village"), 4521796, false);

    static {
        Registry.POTION_EFFECT_REGISTRY.register(MOVEMENT_SPEED);
        Registry.POTION_EFFECT_REGISTRY.register(MOVEMENT_SLOWDOWN);
        Registry.POTION_EFFECT_REGISTRY.register(DIG_SPEED);
        Registry.POTION_EFFECT_REGISTRY.register(DIG_SLOWDOWN);
        Registry.POTION_EFFECT_REGISTRY.register(DAMAGE_BOOST);
        Registry.POTION_EFFECT_REGISTRY.register(HEAL);
        Registry.POTION_EFFECT_REGISTRY.register(HARM);
        Registry.POTION_EFFECT_REGISTRY.register(JUMP);
        Registry.POTION_EFFECT_REGISTRY.register(CONFUSION);
        Registry.POTION_EFFECT_REGISTRY.register(REGENERATION);
        Registry.POTION_EFFECT_REGISTRY.register(DAMAGE_RESISTANCE);
        Registry.POTION_EFFECT_REGISTRY.register(FIRE_RESISTANCE);
        Registry.POTION_EFFECT_REGISTRY.register(WATER_BREATHING);
        Registry.POTION_EFFECT_REGISTRY.register(INVISIBILITY);
        Registry.POTION_EFFECT_REGISTRY.register(BLINDNESS);
        Registry.POTION_EFFECT_REGISTRY.register(NIGHT_VISION);
        Registry.POTION_EFFECT_REGISTRY.register(HUNGER);
        Registry.POTION_EFFECT_REGISTRY.register(WEAKNESS);
        Registry.POTION_EFFECT_REGISTRY.register(POISON);
        Registry.POTION_EFFECT_REGISTRY.register(WITHER);
        Registry.POTION_EFFECT_REGISTRY.register(HEALTH_BOOST);
        Registry.POTION_EFFECT_REGISTRY.register(ABSORPTION);
        Registry.POTION_EFFECT_REGISTRY.register(SATURATION);
        Registry.POTION_EFFECT_REGISTRY.register(GLOWING);
        Registry.POTION_EFFECT_REGISTRY.register(LEVITATION);
        Registry.POTION_EFFECT_REGISTRY.register(LUCK);
        Registry.POTION_EFFECT_REGISTRY.register(UNLUCK);
        Registry.POTION_EFFECT_REGISTRY.register(SLOW_FALLING);
        Registry.POTION_EFFECT_REGISTRY.register(CONDUIT_POWER);
        Registry.POTION_EFFECT_REGISTRY.register(DOLPHINS_GRACE);
        Registry.POTION_EFFECT_REGISTRY.register(BAD_OMEN);
        Registry.POTION_EFFECT_REGISTRY.register(HERO_OF_THE_VILLAGE);
    }

    @NotNull
    private final NamespaceID id;

    private final int color;

    private final boolean instantaneous;

    protected PotionEffect(@NotNull NamespaceID id, int color, boolean instantaneous) {
        this.id = id;
        this.color = color;
        this.instantaneous = instantaneous;
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

    public int getColor() {
        return this.color;
    }

    public boolean isInstantaneous() {
        return this.instantaneous;
    }

    public int getNumericalId() {
        return Registry.POTION_EFFECT_REGISTRY.getId(this);
    }

    @Nullable
    public static PotionEffect fromId(int id) {
        return Registry.POTION_EFFECT_REGISTRY.get((short) id);
    }

    @NotNull
    public static PotionEffect fromId(Key id) {
        return Registry.POTION_EFFECT_REGISTRY.get(id);
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }

    @NotNull
    public static List<PotionEffect> values() {
        return Registry.POTION_EFFECT_REGISTRY.values();
    }
}
