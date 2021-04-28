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
public final class MagmaBlock {
    public static final BlockState MAGMA_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:magma_block_0"), (short) 9257, Block.MAGMA_BLOCK);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(MAGMA_BLOCK_0);
    }

    public static void initStates() {
        Block.MAGMA_BLOCK.addBlockState(MAGMA_BLOCK_0);
    }
}
