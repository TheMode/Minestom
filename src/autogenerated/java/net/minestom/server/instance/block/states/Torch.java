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
public final class Torch {
    public static final BlockState TORCH_0 = new BlockState(NamespaceID.from("minecraft:torch_0"), (short) 1435, Block.TORCH);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(TORCH_0);
    }

    public static void initStates() {
        Block.TORCH.addBlockState(TORCH_0);
    }
}
