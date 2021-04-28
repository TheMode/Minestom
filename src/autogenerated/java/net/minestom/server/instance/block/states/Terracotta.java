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
public final class Terracotta {
    public static final BlockState TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:terracotta_0"), (short) 7886, Block.TERRACOTTA);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(TERRACOTTA_0);
    }

    public static void initStates() {
        Block.TERRACOTTA.addBlockState(TERRACOTTA_0);
    }
}
