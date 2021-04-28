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
public final class PackedIce {
    public static final BlockState PACKED_ICE_0 = new BlockState(NamespaceID.from("minecraft:packed_ice_0"), (short) 7888, Block.PACKED_ICE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PACKED_ICE_0);
    }

    public static void initStates() {
        Block.PACKED_ICE.addBlockState(PACKED_ICE_0);
    }
}
