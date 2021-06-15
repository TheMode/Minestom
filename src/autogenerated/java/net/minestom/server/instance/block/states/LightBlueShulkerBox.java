package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class LightBlueShulkerBox {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    @Deprecated(
            since = "forever",
            forRemoval = false
    )
    public static void initStates() {
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9546, "facing=north"));
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9547, "facing=east"));
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9548, "facing=south"));
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9549, "facing=west"));
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9550, "facing=up"));
        Block.LIGHT_BLUE_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9551, "facing=down"));
    }
}
