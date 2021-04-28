package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadHornCoralBlock {
  public static final BlockState DEAD_HORN_CORAL_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_block_0"), (short) 9518, Block.DEAD_HORN_CORAL_BLOCK);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(DEAD_HORN_CORAL_BLOCK_0);
  }

  public static void initStates() {
    Block.DEAD_HORN_CORAL_BLOCK.addBlockState(DEAD_HORN_CORAL_BLOCK_0);
  }
}