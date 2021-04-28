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
public final class RedTulip {
  public static final BlockState RED_TULIP_0 = new BlockState(NamespaceID.from("minecraft:red_tulip_0"), (short) 1417, Block.RED_TULIP);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(RED_TULIP_0);
  }

  public static void initStates() {
    Block.RED_TULIP.addBlockState(RED_TULIP_0);
  }
}