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
public final class PottedBrownMushroom {
  public static final BlockState POTTED_BROWN_MUSHROOM_0 = new BlockState(NamespaceID.from("minecraft:potted_brown_mushroom_0"), (short) 6331, Block.POTTED_BROWN_MUSHROOM);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POTTED_BROWN_MUSHROOM_0);
  }

  public static void initStates() {
    Block.POTTED_BROWN_MUSHROOM.addBlockState(POTTED_BROWN_MUSHROOM_0);
  }
}