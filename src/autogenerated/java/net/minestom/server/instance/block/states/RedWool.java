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
public final class RedWool {
    public static final BlockState RED_WOOL_0 = new BlockState(NamespaceID.from("minecraft:red_wool_0"), (short) 1398, Block.RED_WOOL);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(RED_WOOL_0);
    }

    public static void initStates() {
        Block.RED_WOOL.addBlockState(RED_WOOL_0);
    }
}
