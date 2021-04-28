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
public final class PlayerWallHead {
    public static final BlockState PLAYER_WALL_HEAD_0 = new BlockState(NamespaceID.from("minecraft:player_wall_head_0"), (short) 6570, Block.PLAYER_WALL_HEAD, "facing=north");

    public static final BlockState PLAYER_WALL_HEAD_1 = new BlockState(NamespaceID.from("minecraft:player_wall_head_1"), (short) 6571, Block.PLAYER_WALL_HEAD, "facing=south");

    public static final BlockState PLAYER_WALL_HEAD_2 = new BlockState(NamespaceID.from("minecraft:player_wall_head_2"), (short) 6572, Block.PLAYER_WALL_HEAD, "facing=west");

    public static final BlockState PLAYER_WALL_HEAD_3 = new BlockState(NamespaceID.from("minecraft:player_wall_head_3"), (short) 6573, Block.PLAYER_WALL_HEAD, "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PLAYER_WALL_HEAD_0);
        Registry.BLOCK_STATE_REGISTRY.register(PLAYER_WALL_HEAD_1);
        Registry.BLOCK_STATE_REGISTRY.register(PLAYER_WALL_HEAD_2);
        Registry.BLOCK_STATE_REGISTRY.register(PLAYER_WALL_HEAD_3);
    }

    public static void initStates() {
        Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_0);
        Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_1);
        Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_2);
        Block.PLAYER_WALL_HEAD.addBlockState(PLAYER_WALL_HEAD_3);
    }
}
