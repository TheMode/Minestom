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
public final class BrickSlab {
    public static final BlockState BRICK_SLAB_0 = new BlockState(NamespaceID.from("minecraft:brick_slab_0"), (short) 8376, Block.BRICK_SLAB, "type=top","waterlogged=true");

    public static final BlockState BRICK_SLAB_1 = new BlockState(NamespaceID.from("minecraft:brick_slab_1"), (short) 8377, Block.BRICK_SLAB, "type=top","waterlogged=false");

    public static final BlockState BRICK_SLAB_2 = new BlockState(NamespaceID.from("minecraft:brick_slab_2"), (short) 8378, Block.BRICK_SLAB, "type=bottom","waterlogged=true");

    public static final BlockState BRICK_SLAB_3 = new BlockState(NamespaceID.from("minecraft:brick_slab_3"), (short) 8379, Block.BRICK_SLAB, "type=bottom","waterlogged=false");

    public static final BlockState BRICK_SLAB_4 = new BlockState(NamespaceID.from("minecraft:brick_slab_4"), (short) 8380, Block.BRICK_SLAB, "type=double","waterlogged=true");

    public static final BlockState BRICK_SLAB_5 = new BlockState(NamespaceID.from("minecraft:brick_slab_5"), (short) 8381, Block.BRICK_SLAB, "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(BRICK_SLAB_5);
    }

    public static void initStates() {
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_0);
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_1);
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_2);
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_3);
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_4);
        Block.BRICK_SLAB.addBlockState(BRICK_SLAB_5);
    }
}
