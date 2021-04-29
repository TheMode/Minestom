package net.minestom.server.network.packet.server.play;

import net.minestom.server.network.packet.server.NetworkHint;
import net.minestom.server.network.packet.server.ServerPacket;
import net.minestom.server.network.packet.server.ServerPacketIdentifier;
import net.minestom.server.utils.binary.BinaryReader;
import net.minestom.server.utils.binary.BinaryWriter;
import org.jetbrains.annotations.NotNull;

public class EntityRotationPacket implements ServerPacket {

    public int entityId;
    public float yaw, pitch;
    public boolean onGround;

    public EntityRotationPacket() {}

    @Override
    public void write(@NotNull BinaryWriter writer) {
        writer.writeVarInt(entityId);
        writer.writeByte((byte) (yaw * 256 / 360));
        writer.writeByte((byte) (pitch * 256 / 360));
        writer.writeBoolean(onGround);
    }

    @Override
    public void read(@NotNull BinaryReader reader) {
        entityId = reader.readVarInt();
        yaw = reader.readByte() * 360f / 256f;
        pitch = reader.readByte() * 360f / 256f;
        onGround = reader.readBoolean();
    }

    @Override
    public int getId() {
        return ServerPacketIdentifier.ENTITY_ROTATION;
    }

    @Override
    public @NotNull NetworkHint getNetworkHint() {
        return NetworkHint.Unordered(10);
    }

    @NotNull
    public static EntityRotationPacket getPacket(int entityId,
                                                 float yaw, float pitch,
                                                 boolean onGround) {
        EntityRotationPacket entityRotationPacket = new EntityRotationPacket();
        entityRotationPacket.entityId = entityId;
        entityRotationPacket.yaw = yaw;
        entityRotationPacket.pitch = pitch;
        entityRotationPacket.onGround = onGround;

        return entityRotationPacket;
    }
}
