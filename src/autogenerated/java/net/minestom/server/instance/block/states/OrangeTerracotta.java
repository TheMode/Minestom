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
public final class OrangeTerracotta {
    public static final BlockState ORANGE_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:orange_terracotta_0"), (short) 6852, Block.ORANGE_TERRACOTTA);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ORANGE_TERRACOTTA_0);
    }

    public static void initStates() {
        Block.ORANGE_TERRACOTTA.addBlockState(ORANGE_TERRACOTTA_0);
    }
}
