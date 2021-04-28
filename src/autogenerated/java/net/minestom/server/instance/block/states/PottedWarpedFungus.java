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
public final class PottedWarpedFungus {
    public static final BlockState POTTED_WARPED_FUNGUS_0 = new BlockState(NamespaceID.from("minecraft:potted_warped_fungus_0"), (short) 15843, Block.POTTED_WARPED_FUNGUS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(POTTED_WARPED_FUNGUS_0);
    }

    public static void initStates() {
        Block.POTTED_WARPED_FUNGUS.addBlockState(POTTED_WARPED_FUNGUS_0);
    }
}
