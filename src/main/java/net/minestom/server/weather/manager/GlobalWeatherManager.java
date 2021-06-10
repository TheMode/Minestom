package net.minestom.server.weather.manager;

import net.minestom.server.MinecraftServer;
import net.minestom.server.instance.Instance;
import net.minestom.server.network.netty.packet.FramedPacket;
import net.minestom.server.weather.Weather;
import net.minestom.server.weather.Weather.Type;
import net.minestom.server.weather.WeatherContainer;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Objects;

/**
 * The global weather manager.
 */
public class GlobalWeatherManager extends WeatherManager implements WeatherContainer {
    private Type defaultWeatherType;

    /**
     * Creates the global weather manager.
     */
    public GlobalWeatherManager() {
        super(Weather.clear());
        this.defaultWeatherType = Type.CLEAR;
    }

    /**
     * Gets the default weather type.
     *
     * @return the default weather type
     */
    public @NotNull Type getDefaultWeatherType() {
        return this.defaultWeatherType;
    }

    /**
     * Sets the default weather type.
     *
     * @param type the new default
     */
    public void setDefaultWeatherType(@NotNull Type type) {
        this.defaultWeatherType = Objects.requireNonNull(type, "type");
    }

    /**
     * Returns {@code this}.
     *
     * @return {@code this}
     */
    @Override
    public @NotNull WeatherManager getWeatherManager() {
        return this;
    }

    @Override
    public void resetWeather() {
        this.setWeather(Weather.infinite(this.defaultWeatherType));
    }

    @Override
    public boolean hasWeather() {
        return true;
    }

    @Override
    protected void sendWeatherPackets(@NotNull Collection<FramedPacket> packets) {
        if (!packets.isEmpty()) {
            for (Instance instance : MinecraftServer.getInstanceManager().getInstances()) {
                if (!instance.hasWeather()) {
                    instance.getWeatherManager().sendWeatherPackets(packets);
                }
            }
        }
    }
}
