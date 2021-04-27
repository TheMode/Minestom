package net.minestom.server.listener;

import net.minestom.server.entity.Player;
import net.minestom.server.event.player.PlayerMoveEvent;
import net.minestom.server.instance.Instance;
import net.minestom.server.network.packet.client.play.*;
import net.minestom.server.utils.Position;
import net.minestom.server.utils.chunk.ChunkUtils;
import org.jetbrains.annotations.NotNull;

public class PlayerPositionListener {

    public static void playerPacketListener(ClientPlayerPacket packet, Player player) {
        player.refreshOnGround(packet.onGround);
    }

    public static void playerLookListener(ClientPlayerRotationPacket packet, Player player) {
        final Position playerPosition = player.getPosition();
        final double x = playerPosition.getX();
        final double y = playerPosition.getY();
        final double z = playerPosition.getZ();
        final float yaw = packet.yaw;
        final float pitch = packet.pitch;
        final boolean onGround = packet.onGround;
        processMovement(player, x, y, z, yaw, pitch, onGround);
    }

    public static void playerPositionListener(ClientPlayerPositionPacket packet, Player player) {
        final Position playerPosition = player.getPosition();
        final float yaw = playerPosition.getYaw();
        final float pitch = playerPosition.getPitch();
        final boolean onGround = packet.onGround;
        processMovement(player,
                packet.x, packet.y, packet.z,
                yaw, pitch, onGround);
    }

    public static void playerPositionAndLookListener(ClientPlayerPositionAndRotationPacket packet, Player player) {
        final float yaw = packet.yaw;
        final float pitch = packet.pitch;
        final boolean onGround = packet.onGround;
        processMovement(player,
                packet.x, packet.y, packet.z,
                yaw, pitch, onGround);
    }

    public static void teleportConfirmListener(ClientTeleportConfirmPacket packet, Player player) {
        final int packetTeleportId = packet.teleportId;
        player.refreshReceivedTeleportId(packetTeleportId);
    }

    private static void processMovement(@NotNull Player player, double x, double y, double z,
                                        float yaw, float pitch, boolean onGround) {
        final Instance instance = player.getInstance();

        // Prevent moving before the player spawned, probably a modified client (or high latency?)
        if (instance == null) {
            return;
        }

        // Prevent the player from moving during a teleport
        if (player.getLastSentTeleportId() != player.getLastReceivedTeleportId()) {
            return;
        }

        // Try to move in an unloaded chunk, prevent it
        if (!ChunkUtils.isLoaded(instance, x, z)) {
            player.teleport(player.getPosition());
            return;
        }

        final Position oldPosition = player.getPosition().clone();
        final Position newPosition = new Position(x, y, z, yaw, pitch);

        PlayerMoveEvent playerMoveEvent = new PlayerMoveEvent(player, newPosition);
        player.callEvent(PlayerMoveEvent.class, playerMoveEvent);

        if (playerMoveEvent.isCancelled()) {
            player.getPosition().set(oldPosition);
        } else {
            // Change the internal data
            player.refreshPosition(newPosition.getX(), newPosition.getY(), newPosition.getZ());
            player.refreshView(newPosition.getYaw(), newPosition.getPitch());
            player.refreshOnGround(onGround);
        }
    }

}
