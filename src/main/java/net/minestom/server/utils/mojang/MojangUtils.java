package net.minestom.server.utils.mojang;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minestom.server.MinecraftServer;
import net.minestom.server.utils.url.URLUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Utils class using mojang API.
 */
public final class MojangUtils {

    private static final Cache<String, JsonObject> UUID_CACHE = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.SECONDS)
            .softValues()
            .build();

    private static final Cache<String, JsonObject> USERNAME_CACHE = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.SECONDS)
            .softValues()
            .build();

    @Nullable
    public static JsonObject fromUuid(@NotNull String uuid) {

        // Check cache
        {
            final JsonObject jsonObject = UUID_CACHE.getIfPresent(uuid);
            if (jsonObject != null) {
                return jsonObject;
            }
        }

        // Retrieve from the rate-limited Mojang API
        final String url = "https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false";
        return retrieve(url, uuid, UUID_CACHE);
    }

    @Nullable
    public static JsonObject fromUsername(@NotNull String username) {

        // Check cache
        {
            final JsonObject jsonObject = USERNAME_CACHE.getIfPresent(username);
            if (jsonObject != null) {
                return jsonObject;
            }
        }

        // Retrieve from the rate-limited Mojang API
        final String url = "https://api.mojang.com/users/profiles/minecraft/" + username;
        return retrieve(url, username, USERNAME_CACHE);
    }

    @Nullable
    public static UUID grabUUID(@NotNull String username) {
        JsonObject jsonObject = fromUsername(username);

        if (jsonObject == null) return null;

        // Grab the UUID. It does not have hyphens, so it has to be parsed specially
        String unHyphenedUUID = jsonObject.get("id").getAsString();

        // UUID is split into 2 logs -- this parses both of those in the UUID format
        return new UUID(
                Long.parseUnsignedLong(unHyphenedUUID.substring(0, 16), 16),
                Long.parseUnsignedLong(unHyphenedUUID.substring(16), 16)
        );
    }

    @Nullable
    private static JsonObject retrieve(@NotNull String url, @NotNull String key,
                                       @NotNull Cache<String, JsonObject> cache) {
        try {
            final String response = URLUtils.getText(url);
            final JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
            cache.put(key, jsonObject);
            return jsonObject;
        } catch (IOException e) {
            MinecraftServer.getExceptionManager().handleException(e);
            return null;
        }
    }

}
