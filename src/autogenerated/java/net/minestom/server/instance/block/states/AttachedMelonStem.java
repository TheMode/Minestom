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
public final class AttachedMelonStem {
    public static final BlockState ATTACHED_MELON_STEM_0 = new BlockState(NamespaceID.from("minecraft:attached_melon_stem_0"), (short) 4772, Block.ATTACHED_MELON_STEM, "facing=north");

    public static final BlockState ATTACHED_MELON_STEM_1 = new BlockState(NamespaceID.from("minecraft:attached_melon_stem_1"), (short) 4773, Block.ATTACHED_MELON_STEM, "facing=south");

    public static final BlockState ATTACHED_MELON_STEM_2 = new BlockState(NamespaceID.from("minecraft:attached_melon_stem_2"), (short) 4774, Block.ATTACHED_MELON_STEM, "facing=west");

    public static final BlockState ATTACHED_MELON_STEM_3 = new BlockState(NamespaceID.from("minecraft:attached_melon_stem_3"), (short) 4775, Block.ATTACHED_MELON_STEM, "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_MELON_STEM_0);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_MELON_STEM_1);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_MELON_STEM_2);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_MELON_STEM_3);
    }

    public static void initStates() {
        Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_0);
        Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_1);
        Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_2);
        Block.ATTACHED_MELON_STEM.addBlockState(ATTACHED_MELON_STEM_3);
    }
}
