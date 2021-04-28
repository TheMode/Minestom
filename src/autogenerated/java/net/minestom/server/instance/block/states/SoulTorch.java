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
public final class SoulTorch {
    public static final BlockState SOUL_TORCH_0 = new BlockState(NamespaceID.from("minecraft:soul_torch_0"), (short) 4008, Block.SOUL_TORCH);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SOUL_TORCH_0);
    }

    public static void initStates() {
        Block.SOUL_TORCH.addBlockState(SOUL_TORCH_0);
    }
}
