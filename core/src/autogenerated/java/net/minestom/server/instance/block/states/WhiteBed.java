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
public final class WhiteBed {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    @Deprecated(
            since = "forever",
            forRemoval = false
    )
    public static void initStates() {
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1049, "facing=north", "occupied=true", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1050, "facing=north", "occupied=true", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1051, "facing=north", "occupied=false", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1052, "facing=north", "occupied=false", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1053, "facing=south", "occupied=true", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1054, "facing=south", "occupied=true", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1055, "facing=south", "occupied=false", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1056, "facing=south", "occupied=false", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1057, "facing=west", "occupied=true", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1058, "facing=west", "occupied=true", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1059, "facing=west", "occupied=false", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1060, "facing=west", "occupied=false", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1061, "facing=east", "occupied=true", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1062, "facing=east", "occupied=true", "part=foot"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1063, "facing=east", "occupied=false", "part=head"));
        Block.WHITE_BED.addBlockAlternative(new BlockAlternative((short) 1064, "facing=east", "occupied=false", "part=foot"));
    }
}
