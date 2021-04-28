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
public final class BambooSapling {
  public static final BlockState BAMBOO_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:bamboo_sapling_0"), (short) 9655, Block.BAMBOO_SAPLING);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(BAMBOO_SAPLING_0);
  }

  public static void initStates() {
    Block.BAMBOO_SAPLING.addBlockState(BAMBOO_SAPLING_0);
  }
}