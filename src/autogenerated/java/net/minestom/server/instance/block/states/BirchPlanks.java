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
public final class BirchPlanks {
  public static final BlockState BIRCH_PLANKS_0 = new BlockState(NamespaceID.from("minecraft:birch_planks_0"), (short) 17, Block.BIRCH_PLANKS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(BIRCH_PLANKS_0);
  }

  public static void initStates() {
    Block.BIRCH_PLANKS.addBlockState(BIRCH_PLANKS_0);
  }
}