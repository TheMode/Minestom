package net.minestom.server.instance.block;

import java.lang.Override;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.instance.block.states.Air;
import net.minestom.server.raw_data.RawBlockStateData;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED
 */
public class BlockState implements Keyed {
  public static final BlockState AIR_0 = Air.AIR_0;

  @NotNull
  private final NamespaceID namespaceId;

  private final short id;

  @NotNull
  private final Block block;

  @NotNull
  private final RawBlockStateData blockStateData = new RawBlockStateData();

  public BlockState(@NotNull NamespaceID namespaceId, short id, @NotNull Block block) {
    this.namespaceId = namespaceId;
    this.id = id;
    this.block = block;
  }

  @NotNull
  public NamespaceID getNamespaceId() {
    return this.namespaceId;
  }

  @Override
  @NotNull
  public Key key() {
    return this.namespaceId;
  }

  public short getId() {
    return this.id;
  }

  @NotNull
  public Block getBlock() {
    return this.block;
  }

  @NotNull
  public static BlockState fromId(short id) {
    return Registries.getBlockState(id);
  }

  @NotNull
  public static BlockState fromId(Key id) {
    return Registries.getBlockState(id);
  }

  @NotNull
  public final RawBlockStateData getBlockStateData() {
    return this.blockStateData;
  }

  public boolean isSolid() {
    return this.blockStateData.solid;
  }

  public boolean isLiquid() {
    return this.blockStateData.liquid;
  }

  @NotNull
  public static List<BlockState> values() {
    return Registries.getBlockStates();
  }
}
