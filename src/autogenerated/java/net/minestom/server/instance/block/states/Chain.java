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
public final class Chain {
    public static final BlockState CHAIN_0 = new BlockState(NamespaceID.from("minecraft:chain_0"), (short) 4729, Block.CHAIN, "axis=x","waterlogged=true");

    public static final BlockState CHAIN_1 = new BlockState(NamespaceID.from("minecraft:chain_1"), (short) 4730, Block.CHAIN, "axis=x","waterlogged=false");

    public static final BlockState CHAIN_2 = new BlockState(NamespaceID.from("minecraft:chain_2"), (short) 4731, Block.CHAIN, "axis=y","waterlogged=true");

    public static final BlockState CHAIN_3 = new BlockState(NamespaceID.from("minecraft:chain_3"), (short) 4732, Block.CHAIN, "axis=y","waterlogged=false");

    public static final BlockState CHAIN_4 = new BlockState(NamespaceID.from("minecraft:chain_4"), (short) 4733, Block.CHAIN, "axis=z","waterlogged=true");

    public static final BlockState CHAIN_5 = new BlockState(NamespaceID.from("minecraft:chain_5"), (short) 4734, Block.CHAIN, "axis=z","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_0);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_1);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_2);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_3);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_4);
        Registry.BLOCK_STATE_REGISTRY.register(CHAIN_5);
    }

    public static void initStates() {
        Block.CHAIN.addBlockState(CHAIN_0);
        Block.CHAIN.addBlockState(CHAIN_1);
        Block.CHAIN.addBlockState(CHAIN_2);
        Block.CHAIN.addBlockState(CHAIN_3);
        Block.CHAIN.addBlockState(CHAIN_4);
        Block.CHAIN.addBlockState(CHAIN_5);
    }
}
