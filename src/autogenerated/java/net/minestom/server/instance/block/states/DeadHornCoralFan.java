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
public final class DeadHornCoralFan {
    public static final BlockState DEAD_HORN_CORAL_FAN_0 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_fan_0"), (short) 9552, Block.DEAD_HORN_CORAL_FAN, "waterlogged=true");

    public static final BlockState DEAD_HORN_CORAL_FAN_1 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_fan_1"), (short) 9553, Block.DEAD_HORN_CORAL_FAN, "waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_HORN_CORAL_FAN_0);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_HORN_CORAL_FAN_1);
    }

    public static void initStates() {
        Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_0);
        Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_1);
    }
}
