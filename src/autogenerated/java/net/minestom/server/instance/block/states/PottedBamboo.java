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
public final class PottedBamboo {
  public static final BlockState POTTED_BAMBOO_0 = new BlockState(NamespaceID.from("minecraft:potted_bamboo_0"), (short) 9668, Block.POTTED_BAMBOO);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POTTED_BAMBOO_0);
  }

  public static void initStates() {
    Block.POTTED_BAMBOO.addBlockState(POTTED_BAMBOO_0);
  }
}