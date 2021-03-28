package net.minestom.server.command;

import net.kyori.adventure.audience.MessageType;
import net.kyori.adventure.identity.Identity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import net.minestom.server.permission.Permission;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Represents the console when sending a command to the server.
 */
public class ConsoleSender implements CommandSender {

    private final static Logger LOGGER = LoggerFactory.getLogger(ConsoleSender.class);

    private final Set<Permission> permissions = new CopyOnWriteArraySet<>();

    @Override
    public void sendMessage(@NotNull  Identity source, @NotNull Component message, @NotNull MessageType type) {
        // we don't use the serializer here as we just need the plain text of the message
        LOGGER.info(PlainComponentSerializer.plain().serialize(message));
    }

    @NotNull
    @Override
    public Set<Permission> getAllPermissions() {
        return permissions;
    }
}
