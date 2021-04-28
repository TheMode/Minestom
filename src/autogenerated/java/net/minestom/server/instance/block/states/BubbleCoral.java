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
public final class BubbleCoral {
    public static final BlockState BUBBLE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:bubble_coral_0"), (short) 9538, Block.BUBBLE_CORAL, "waterlogged=true");

    public static final BlockState BUBBLE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:bubble_coral_1"), (short) 9539, Block.BUBBLE_CORAL, "waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BUBBLE_CORAL_0);
        Registry.BLOCK_STATE_REGISTRY.register(BUBBLE_CORAL_1);
    }

    public static void initStates() {
        Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_0);
        Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_1);
    }
}
