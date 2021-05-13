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
public final class StoneButton {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    @Deprecated(
            since = "forever",
            forRemoval = false
    )
    public static void initStates() {
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3897, "face=floor", "facing=north", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3898, "face=floor", "facing=north", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3899, "face=floor", "facing=south", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3900, "face=floor", "facing=south", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3901, "face=floor", "facing=west", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3902, "face=floor", "facing=west", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3903, "face=floor", "facing=east", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3904, "face=floor", "facing=east", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3905, "face=wall", "facing=north", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3906, "face=wall", "facing=north", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3907, "face=wall", "facing=south", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3908, "face=wall", "facing=south", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3909, "face=wall", "facing=west", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3910, "face=wall", "facing=west", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3911, "face=wall", "facing=east", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3912, "face=wall", "facing=east", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3913, "face=ceiling", "facing=north", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3914, "face=ceiling", "facing=north", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3915, "face=ceiling", "facing=south", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3916, "face=ceiling", "facing=south", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3917, "face=ceiling", "facing=west", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3918, "face=ceiling", "facing=west", "powered=false"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3919, "face=ceiling", "facing=east", "powered=true"));
        Block.STONE_BUTTON.addBlockAlternative(new BlockAlternative((short) 3920, "face=ceiling", "facing=east", "powered=false"));
    }
}
