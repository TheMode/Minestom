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
public final class LightGrayCarpet {
    public static final BlockState LIGHT_GRAY_CARPET_0 = new BlockState(NamespaceID.from("minecraft:light_gray_carpet_0"), (short) 7878, Block.LIGHT_GRAY_CARPET);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LIGHT_GRAY_CARPET_0);
    }

    public static void initStates() {
        Block.LIGHT_GRAY_CARPET.addBlockState(LIGHT_GRAY_CARPET_0);
    }
}
