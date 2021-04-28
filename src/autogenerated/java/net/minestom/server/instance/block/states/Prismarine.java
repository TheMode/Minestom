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
public final class Prismarine {
    public static final BlockState PRISMARINE_0 = new BlockState(NamespaceID.from("minecraft:prismarine_0"), (short) 7605, Block.PRISMARINE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PRISMARINE_0);
    }

    public static void initStates() {
        Block.PRISMARINE.addBlockState(PRISMARINE_0);
    }
}
