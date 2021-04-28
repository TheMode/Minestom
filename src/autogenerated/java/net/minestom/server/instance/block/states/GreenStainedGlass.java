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
public final class GreenStainedGlass {
  public static final BlockState GREEN_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:green_stained_glass_0"), (short) 4108, Block.GREEN_STAINED_GLASS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(GREEN_STAINED_GLASS_0);
  }

  public static void initStates() {
    Block.GREEN_STAINED_GLASS.addBlockState(GREEN_STAINED_GLASS_0);
  }
}