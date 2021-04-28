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
public final class BlackWool {
  public static final BlockState BLACK_WOOL_0 = new BlockState(NamespaceID.from("minecraft:black_wool_0"), (short) 1399, Block.BLACK_WOOL);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(BLACK_WOOL_0);
  }

  public static void initStates() {
    Block.BLACK_WOOL.addBlockState(BLACK_WOOL_0);
  }
}