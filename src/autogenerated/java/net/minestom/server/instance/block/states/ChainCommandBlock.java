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
public final class ChainCommandBlock {
    public static final BlockState CHAIN_COMMAND_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:chain_command_block_0"), (short) 9241, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=north");

    public static final BlockState CHAIN_COMMAND_BLOCK_1 = new BlockState(NamespaceID.from("minecraft:chain_command_block_1"), (short) 9242, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=east");

    public static final BlockState CHAIN_COMMAND_BLOCK_2 = new BlockState(NamespaceID.from("minecraft:chain_command_block_2"), (short) 9243, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=south");

    public static final BlockState CHAIN_COMMAND_BLOCK_3 = new BlockState(NamespaceID.from("minecraft:chain_command_block_3"), (short) 9244, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=west");

    public static final BlockState CHAIN_COMMAND_BLOCK_4 = new BlockState(NamespaceID.from("minecraft:chain_command_block_4"), (short) 9245, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=up");

    public static final BlockState CHAIN_COMMAND_BLOCK_5 = new BlockState(NamespaceID.from("minecraft:chain_command_block_5"), (short) 9246, Block.CHAIN_COMMAND_BLOCK, "conditional=true","facing=down");

    public static final BlockState CHAIN_COMMAND_BLOCK_6 = new BlockState(NamespaceID.from("minecraft:chain_command_block_6"), (short) 9247, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=north");

    public static final BlockState CHAIN_COMMAND_BLOCK_7 = new BlockState(NamespaceID.from("minecraft:chain_command_block_7"), (short) 9248, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=east");

    public static final BlockState CHAIN_COMMAND_BLOCK_8 = new BlockState(NamespaceID.from("minecraft:chain_command_block_8"), (short) 9249, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=south");

    public static final BlockState CHAIN_COMMAND_BLOCK_9 = new BlockState(NamespaceID.from("minecraft:chain_command_block_9"), (short) 9250, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=west");

    public static final BlockState CHAIN_COMMAND_BLOCK_10 = new BlockState(NamespaceID.from("minecraft:chain_command_block_10"), (short) 9251, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=up");

    public static final BlockState CHAIN_COMMAND_BLOCK_11 = new BlockState(NamespaceID.from("minecraft:chain_command_block_11"), (short) 9252, Block.CHAIN_COMMAND_BLOCK, "conditional=false","facing=down");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_0);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_1);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_2);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_3);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_4);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_5);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_6);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_7);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_8);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_9);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_10);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_COMMAND_BLOCK_11);
    }

    public static void initStates() {
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_0);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_1);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_2);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_3);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_4);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_5);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_6);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_7);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_8);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_9);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_10);
        Block.CHAIN_COMMAND_BLOCK.addBlockState(CHAIN_COMMAND_BLOCK_11);
    }
}
