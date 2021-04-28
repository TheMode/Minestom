package net.minestom.server.instance.block;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTOGENERATED by BlockEntityGenerator
 */
public class BlockEntity implements Keyed {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final BlockEntity FURNACE = new BlockEntity(NamespaceID.from("minecraft:furnace"));

    public static final BlockEntity CHEST = new BlockEntity(NamespaceID.from("minecraft:chest"));

    public static final BlockEntity TRAPPED_CHEST = new BlockEntity(NamespaceID.from("minecraft:trapped_chest"));

    public static final BlockEntity ENDER_CHEST = new BlockEntity(NamespaceID.from("minecraft:ender_chest"));

    public static final BlockEntity JUKEBOX = new BlockEntity(NamespaceID.from("minecraft:jukebox"));

    public static final BlockEntity DISPENSER = new BlockEntity(NamespaceID.from("minecraft:dispenser"));

    public static final BlockEntity DROPPER = new BlockEntity(NamespaceID.from("minecraft:dropper"));

    public static final BlockEntity SIGN = new BlockEntity(NamespaceID.from("minecraft:sign"));

    public static final BlockEntity MOB_SPAWNER = new BlockEntity(NamespaceID.from("minecraft:mob_spawner"));

    public static final BlockEntity PISTON = new BlockEntity(NamespaceID.from("minecraft:piston"));

    public static final BlockEntity BREWING_STAND = new BlockEntity(NamespaceID.from("minecraft:brewing_stand"));

    public static final BlockEntity ENCHANTING_TABLE = new BlockEntity(NamespaceID.from("minecraft:enchanting_table"));

    public static final BlockEntity END_PORTAL = new BlockEntity(NamespaceID.from("minecraft:end_portal"));

    public static final BlockEntity BEACON = new BlockEntity(NamespaceID.from("minecraft:beacon"));

    public static final BlockEntity SKULL = new BlockEntity(NamespaceID.from("minecraft:skull"));

    public static final BlockEntity DAYLIGHT_DETECTOR = new BlockEntity(NamespaceID.from("minecraft:daylight_detector"));

    public static final BlockEntity HOPPER = new BlockEntity(NamespaceID.from("minecraft:hopper"));

    public static final BlockEntity COMPARATOR = new BlockEntity(NamespaceID.from("minecraft:comparator"));

    public static final BlockEntity BANNER = new BlockEntity(NamespaceID.from("minecraft:banner"));

    public static final BlockEntity STRUCTURE_BLOCK = new BlockEntity(NamespaceID.from("minecraft:structure_block"));

    public static final BlockEntity END_GATEWAY = new BlockEntity(NamespaceID.from("minecraft:end_gateway"));

    public static final BlockEntity COMMAND_BLOCK = new BlockEntity(NamespaceID.from("minecraft:command_block"));

    public static final BlockEntity SHULKER_BOX = new BlockEntity(NamespaceID.from("minecraft:shulker_box"));

    public static final BlockEntity BED = new BlockEntity(NamespaceID.from("minecraft:bed"));

    public static final BlockEntity CONDUIT = new BlockEntity(NamespaceID.from("minecraft:conduit"));

    public static final BlockEntity BARREL = new BlockEntity(NamespaceID.from("minecraft:barrel"));

    public static final BlockEntity SMOKER = new BlockEntity(NamespaceID.from("minecraft:smoker"));

    public static final BlockEntity BLAST_FURNACE = new BlockEntity(NamespaceID.from("minecraft:blast_furnace"));

    public static final BlockEntity LECTERN = new BlockEntity(NamespaceID.from("minecraft:lectern"));

    public static final BlockEntity BELL = new BlockEntity(NamespaceID.from("minecraft:bell"));

    public static final BlockEntity JIGSAW = new BlockEntity(NamespaceID.from("minecraft:jigsaw"));

    public static final BlockEntity CAMPFIRE = new BlockEntity(NamespaceID.from("minecraft:campfire"));

    public static final BlockEntity BEEHIVE = new BlockEntity(NamespaceID.from("minecraft:beehive"));

    static {
        FURNACE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:furnace"));
        CHEST.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:chest"));
        TRAPPED_CHEST.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:trapped_chest"));
        ENDER_CHEST.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:ender_chest"));
        JUKEBOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:jukebox"));
        DISPENSER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dispenser"));
        DROPPER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dropper"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:oak_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:spruce_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:birch_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:acacia_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:jungle_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dark_oak_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:oak_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:spruce_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:birch_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:acacia_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:jungle_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dark_oak_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:crimson_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:crimson_wall_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:warped_sign"));
        SIGN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:warped_wall_sign"));
        MOB_SPAWNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:spawner"));
        PISTON.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:moving_piston"));
        BREWING_STAND.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:brewing_stand"));
        ENCHANTING_TABLE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:enchanting_table"));
        END_PORTAL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:end_portal"));
        BEACON.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:beacon"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:skeleton_skull"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:skeleton_wall_skull"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:creeper_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:creeper_wall_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dragon_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:dragon_wall_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:zombie_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:zombie_wall_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:wither_skeleton_skull"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:wither_skeleton_wall_skull"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:player_head"));
        SKULL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:player_wall_head"));
        DAYLIGHT_DETECTOR.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:daylight_detector"));
        HOPPER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:hopper"));
        COMPARATOR.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:comparator"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:white_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:orange_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:magenta_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:yellow_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:lime_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:pink_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:gray_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:cyan_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:purple_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:blue_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:brown_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:green_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:red_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:black_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:white_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:orange_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:magenta_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:yellow_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:lime_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:pink_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:gray_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:cyan_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:purple_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:blue_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:brown_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:green_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:red_wall_banner"));
        BANNER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:black_wall_banner"));
        STRUCTURE_BLOCK.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:structure_block"));
        END_GATEWAY.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:end_gateway"));
        COMMAND_BLOCK.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:command_block"));
        COMMAND_BLOCK.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:chain_command_block"));
        COMMAND_BLOCK.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:repeating_command_block"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:black_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:blue_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:brown_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:cyan_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:gray_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:green_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:lime_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:magenta_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:orange_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:pink_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:purple_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:red_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:white_shulker_box"));
        SHULKER_BOX.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:yellow_shulker_box"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:red_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:black_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:blue_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:brown_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:cyan_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:gray_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:green_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:lime_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:magenta_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:orange_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:pink_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:purple_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:white_bed"));
        BED.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:yellow_bed"));
        CONDUIT.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:conduit"));
        BARREL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:barrel"));
        SMOKER.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:smoker"));
        BLAST_FURNACE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:blast_furnace"));
        LECTERN.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:lectern"));
        BELL.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:bell"));
        JIGSAW.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:jigsaw"));
        CAMPFIRE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:campfire"));
        CAMPFIRE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:soul_campfire"));
        BEEHIVE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:bee_nest"));
        BEEHIVE.addBlock(Registry.BLOCK_REGISTRY.get("minecraft:beehive"));
    }
    static {
        Registry.BLOCK_ENTITY_REGISTRY.register(FURNACE);
        Registry.BLOCK_ENTITY_REGISTRY.register(CHEST);
        Registry.BLOCK_ENTITY_REGISTRY.register(TRAPPED_CHEST);
        Registry.BLOCK_ENTITY_REGISTRY.register(ENDER_CHEST);
        Registry.BLOCK_ENTITY_REGISTRY.register(JUKEBOX);
        Registry.BLOCK_ENTITY_REGISTRY.register(DISPENSER);
        Registry.BLOCK_ENTITY_REGISTRY.register(DROPPER);
        Registry.BLOCK_ENTITY_REGISTRY.register(SIGN);
        Registry.BLOCK_ENTITY_REGISTRY.register(MOB_SPAWNER);
        Registry.BLOCK_ENTITY_REGISTRY.register(PISTON);
        Registry.BLOCK_ENTITY_REGISTRY.register(BREWING_STAND);
        Registry.BLOCK_ENTITY_REGISTRY.register(ENCHANTING_TABLE);
        Registry.BLOCK_ENTITY_REGISTRY.register(END_PORTAL);
        Registry.BLOCK_ENTITY_REGISTRY.register(BEACON);
        Registry.BLOCK_ENTITY_REGISTRY.register(SKULL);
        Registry.BLOCK_ENTITY_REGISTRY.register(DAYLIGHT_DETECTOR);
        Registry.BLOCK_ENTITY_REGISTRY.register(HOPPER);
        Registry.BLOCK_ENTITY_REGISTRY.register(COMPARATOR);
        Registry.BLOCK_ENTITY_REGISTRY.register(BANNER);
        Registry.BLOCK_ENTITY_REGISTRY.register(STRUCTURE_BLOCK);
        Registry.BLOCK_ENTITY_REGISTRY.register(END_GATEWAY);
        Registry.BLOCK_ENTITY_REGISTRY.register(COMMAND_BLOCK);
        Registry.BLOCK_ENTITY_REGISTRY.register(SHULKER_BOX);
        Registry.BLOCK_ENTITY_REGISTRY.register(BED);
        Registry.BLOCK_ENTITY_REGISTRY.register(CONDUIT);
        Registry.BLOCK_ENTITY_REGISTRY.register(BARREL);
        Registry.BLOCK_ENTITY_REGISTRY.register(SMOKER);
        Registry.BLOCK_ENTITY_REGISTRY.register(BLAST_FURNACE);
        Registry.BLOCK_ENTITY_REGISTRY.register(LECTERN);
        Registry.BLOCK_ENTITY_REGISTRY.register(BELL);
        Registry.BLOCK_ENTITY_REGISTRY.register(JIGSAW);
        Registry.BLOCK_ENTITY_REGISTRY.register(CAMPFIRE);
        Registry.BLOCK_ENTITY_REGISTRY.register(BEEHIVE);
    }
    static {
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:furnace"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:chest"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:trapped_chest"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:ender_chest"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:jukebox"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dispenser"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dropper"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:oak_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:spruce_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:birch_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:acacia_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:jungle_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dark_oak_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:oak_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:spruce_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:birch_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:acacia_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:jungle_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dark_oak_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:crimson_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:crimson_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:warped_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:warped_wall_sign"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:spawner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:moving_piston"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:brewing_stand"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:enchanting_table"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:end_portal"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:beacon"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:skeleton_skull"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:skeleton_wall_skull"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:creeper_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:creeper_wall_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dragon_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:dragon_wall_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:zombie_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:zombie_wall_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:wither_skeleton_skull"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:wither_skeleton_wall_skull"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:player_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:player_wall_head"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:daylight_detector"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:hopper"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:comparator"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:white_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:orange_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:magenta_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:yellow_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:lime_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:pink_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:gray_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:cyan_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:purple_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:blue_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:brown_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:green_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:red_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:black_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:white_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:orange_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:magenta_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:yellow_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:lime_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:pink_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:gray_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:cyan_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:purple_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:blue_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:brown_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:green_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:red_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:black_wall_banner"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:structure_block"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:end_gateway"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:command_block"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:chain_command_block"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:repeating_command_block"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:black_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:blue_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:brown_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:cyan_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:gray_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:green_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:lime_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:magenta_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:orange_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:pink_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:purple_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:red_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:white_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:yellow_shulker_box"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:red_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:black_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:blue_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:brown_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:cyan_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:gray_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:green_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_blue_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:light_gray_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:lime_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:magenta_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:orange_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:pink_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:purple_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:white_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:yellow_bed"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:conduit"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:barrel"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:smoker"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:blast_furnace"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:lectern"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:bell"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:jigsaw"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:campfire"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:soul_campfire"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:bee_nest"));
        BLOCKS.add(Registry.BLOCK_REGISTRY.get("minecraft:beehive"));
    }

    @NotNull
    private final NamespaceID id;

    @NotNull
    private final List<Block> blocks = new ArrayList<>();

    protected BlockEntity(@NotNull NamespaceID id) {
        this.id = id;
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

    private void addBlock(@NotNull Block block) {
        this.blocks.add(block);
    }

    @NotNull
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }

    @NotNull
    public static List<BlockEntity> values() {
        return Registry.BLOCK_ENTITY_REGISTRY.values();
    }
}
