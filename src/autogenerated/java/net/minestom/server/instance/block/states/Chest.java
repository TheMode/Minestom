package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;


/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class Chest {
    public static final BlockState CHEST_0 = new BlockState(NamespaceID.from("minecraft:chest_0"), (short) 2034, Block.CHEST, "facing=north","type=SINGLE","waterlogged=true");

    public static final BlockState CHEST_1 = new BlockState(NamespaceID.from("minecraft:chest_1"), (short) 2035, Block.CHEST, "facing=north","type=SINGLE","waterlogged=false");

    public static final BlockState CHEST_2 = new BlockState(NamespaceID.from("minecraft:chest_2"), (short) 2036, Block.CHEST, "facing=north","type=LEFT","waterlogged=true");

    public static final BlockState CHEST_3 = new BlockState(NamespaceID.from("minecraft:chest_3"), (short) 2037, Block.CHEST, "facing=north","type=LEFT","waterlogged=false");

    public static final BlockState CHEST_4 = new BlockState(NamespaceID.from("minecraft:chest_4"), (short) 2038, Block.CHEST, "facing=north","type=RIGHT","waterlogged=true");

    public static final BlockState CHEST_5 = new BlockState(NamespaceID.from("minecraft:chest_5"), (short) 2039, Block.CHEST, "facing=north","type=RIGHT","waterlogged=false");

    public static final BlockState CHEST_6 = new BlockState(NamespaceID.from("minecraft:chest_6"), (short) 2040, Block.CHEST, "facing=south","type=SINGLE","waterlogged=true");

    public static final BlockState CHEST_7 = new BlockState(NamespaceID.from("minecraft:chest_7"), (short) 2041, Block.CHEST, "facing=south","type=SINGLE","waterlogged=false");

    public static final BlockState CHEST_8 = new BlockState(NamespaceID.from("minecraft:chest_8"), (short) 2042, Block.CHEST, "facing=south","type=LEFT","waterlogged=true");

    public static final BlockState CHEST_9 = new BlockState(NamespaceID.from("minecraft:chest_9"), (short) 2043, Block.CHEST, "facing=south","type=LEFT","waterlogged=false");

    public static final BlockState CHEST_10 = new BlockState(NamespaceID.from("minecraft:chest_10"), (short) 2044, Block.CHEST, "facing=south","type=RIGHT","waterlogged=true");

    public static final BlockState CHEST_11 = new BlockState(NamespaceID.from("minecraft:chest_11"), (short) 2045, Block.CHEST, "facing=south","type=RIGHT","waterlogged=false");

    public static final BlockState CHEST_12 = new BlockState(NamespaceID.from("minecraft:chest_12"), (short) 2046, Block.CHEST, "facing=west","type=SINGLE","waterlogged=true");

    public static final BlockState CHEST_13 = new BlockState(NamespaceID.from("minecraft:chest_13"), (short) 2047, Block.CHEST, "facing=west","type=SINGLE","waterlogged=false");

    public static final BlockState CHEST_14 = new BlockState(NamespaceID.from("minecraft:chest_14"), (short) 2048, Block.CHEST, "facing=west","type=LEFT","waterlogged=true");

    public static final BlockState CHEST_15 = new BlockState(NamespaceID.from("minecraft:chest_15"), (short) 2049, Block.CHEST, "facing=west","type=LEFT","waterlogged=false");

    public static final BlockState CHEST_16 = new BlockState(NamespaceID.from("minecraft:chest_16"), (short) 2050, Block.CHEST, "facing=west","type=RIGHT","waterlogged=true");

    public static final BlockState CHEST_17 = new BlockState(NamespaceID.from("minecraft:chest_17"), (short) 2051, Block.CHEST, "facing=west","type=RIGHT","waterlogged=false");

    public static final BlockState CHEST_18 = new BlockState(NamespaceID.from("minecraft:chest_18"), (short) 2052, Block.CHEST, "facing=east","type=SINGLE","waterlogged=true");

    public static final BlockState CHEST_19 = new BlockState(NamespaceID.from("minecraft:chest_19"), (short) 2053, Block.CHEST, "facing=east","type=SINGLE","waterlogged=false");

    public static final BlockState CHEST_20 = new BlockState(NamespaceID.from("minecraft:chest_20"), (short) 2054, Block.CHEST, "facing=east","type=LEFT","waterlogged=true");

    public static final BlockState CHEST_21 = new BlockState(NamespaceID.from("minecraft:chest_21"), (short) 2055, Block.CHEST, "facing=east","type=LEFT","waterlogged=false");

    public static final BlockState CHEST_22 = new BlockState(NamespaceID.from("minecraft:chest_22"), (short) 2056, Block.CHEST, "facing=east","type=RIGHT","waterlogged=true");

    public static final BlockState CHEST_23 = new BlockState(NamespaceID.from("minecraft:chest_23"), (short) 2057, Block.CHEST, "facing=east","type=RIGHT","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_0);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_1);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_2);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_3);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_4);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_5);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_6);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_7);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_8);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_9);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_10);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_11);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_12);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_13);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_14);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_15);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_16);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_17);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_18);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_19);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_20);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_21);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_22);
        Registry.BLOCK_STATE_REGISTRY.register(CHEST_23);
    }

    public static void initStates() {
        Block.CHEST.addBlockState(CHEST_0);
        Block.CHEST.addBlockState(CHEST_1);
        Block.CHEST.addBlockState(CHEST_2);
        Block.CHEST.addBlockState(CHEST_3);
        Block.CHEST.addBlockState(CHEST_4);
        Block.CHEST.addBlockState(CHEST_5);
        Block.CHEST.addBlockState(CHEST_6);
        Block.CHEST.addBlockState(CHEST_7);
        Block.CHEST.addBlockState(CHEST_8);
        Block.CHEST.addBlockState(CHEST_9);
        Block.CHEST.addBlockState(CHEST_10);
        Block.CHEST.addBlockState(CHEST_11);
        Block.CHEST.addBlockState(CHEST_12);
        Block.CHEST.addBlockState(CHEST_13);
        Block.CHEST.addBlockState(CHEST_14);
        Block.CHEST.addBlockState(CHEST_15);
        Block.CHEST.addBlockState(CHEST_16);
        Block.CHEST.addBlockState(CHEST_17);
        Block.CHEST.addBlockState(CHEST_18);
        Block.CHEST.addBlockState(CHEST_19);
        Block.CHEST.addBlockState(CHEST_20);
        Block.CHEST.addBlockState(CHEST_21);
        Block.CHEST.addBlockState(CHEST_22);
        Block.CHEST.addBlockState(CHEST_23);
    }
}
