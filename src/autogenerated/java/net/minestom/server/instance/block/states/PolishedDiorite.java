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
public final class PolishedDiorite {
    public static final BlockState POLISHED_DIORITE_0 = new BlockState(NamespaceID.from("minecraft:polished_diorite_0"), (short) 5, Block.POLISHED_DIORITE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_0);
    }

    public static void initStates() {
        Block.POLISHED_DIORITE.addBlockState(POLISHED_DIORITE_0);
    }
}
