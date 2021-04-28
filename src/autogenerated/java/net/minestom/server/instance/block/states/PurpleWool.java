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
public final class PurpleWool {
    public static final BlockState PURPLE_WOOL_0 = new BlockState(NamespaceID.from("minecraft:purple_wool_0"), (short) 1394, Block.PURPLE_WOOL);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PURPLE_WOOL_0);
    }

    public static void initStates() {
        Block.PURPLE_WOOL.addBlockState(PURPLE_WOOL_0);
    }
}
