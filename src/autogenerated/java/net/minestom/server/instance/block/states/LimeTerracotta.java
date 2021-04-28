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
public final class LimeTerracotta {
    public static final BlockState LIME_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:lime_terracotta_0"), (short) 6856, Block.LIME_TERRACOTTA);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LIME_TERRACOTTA_0);
    }

    public static void initStates() {
        Block.LIME_TERRACOTTA.addBlockState(LIME_TERRACOTTA_0);
    }
}
