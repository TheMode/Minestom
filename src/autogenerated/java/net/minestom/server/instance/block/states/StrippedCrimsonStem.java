package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;


/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class StrippedCrimsonStem {
    public static final BlockState STRIPPED_CRIMSON_STEM_0 = new BlockState(NamespaceID.from("minecraft:stripped_crimson_stem_0"), (short) 14986, Block.STRIPPED_CRIMSON_STEM, "axis=x");

    public static final BlockState STRIPPED_CRIMSON_STEM_1 = new BlockState(NamespaceID.from("minecraft:stripped_crimson_stem_1"), (short) 14987, Block.STRIPPED_CRIMSON_STEM, "axis=y");

    public static final BlockState STRIPPED_CRIMSON_STEM_2 = new BlockState(NamespaceID.from("minecraft:stripped_crimson_stem_2"), (short) 14988, Block.STRIPPED_CRIMSON_STEM, "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_CRIMSON_STEM_0);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_CRIMSON_STEM_1);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_CRIMSON_STEM_2);
    }

    public static void initStates() {
        Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_0);
        Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_1);
        Block.STRIPPED_CRIMSON_STEM.addBlockState(STRIPPED_CRIMSON_STEM_2);
    }
}
