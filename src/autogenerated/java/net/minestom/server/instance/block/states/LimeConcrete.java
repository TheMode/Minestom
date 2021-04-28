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
public final class LimeConcrete {
  public static final BlockState LIME_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:lime_concrete_0"), (short) 9447, Block.LIME_CONCRETE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(LIME_CONCRETE_0);
  }

  public static void initStates() {
    Block.LIME_CONCRETE.addBlockState(LIME_CONCRETE_0);
  }
}