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
public final class BrewingStand {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    @Deprecated(
            since = "forever",
            forRemoval = false
    )
    public static void initStates() {
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5137, "has_bottle_0=true", "has_bottle_1=true", "has_bottle_2=true"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5138, "has_bottle_0=true", "has_bottle_1=true", "has_bottle_2=false"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5139, "has_bottle_0=true", "has_bottle_1=false", "has_bottle_2=true"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5140, "has_bottle_0=true", "has_bottle_1=false", "has_bottle_2=false"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5141, "has_bottle_0=false", "has_bottle_1=true", "has_bottle_2=true"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5142, "has_bottle_0=false", "has_bottle_1=true", "has_bottle_2=false"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5143, "has_bottle_0=false", "has_bottle_1=false", "has_bottle_2=true"));
        Block.BREWING_STAND.addBlockAlternative(new BlockAlternative((short) 5144, "has_bottle_0=false", "has_bottle_1=false", "has_bottle_2=false"));
    }
}
