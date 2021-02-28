package net.minestom.server.tab;

import net.minestom.server.MinecraftServer;
import net.minestom.server.chat.JsonMessage;
import net.minestom.server.entity.Player;
import net.minestom.server.network.packet.server.play.PlayerInfoPacket;
import net.minestom.server.network.packet.server.play.PlayerListHeaderAndFooterPacket;
import net.minestom.server.utils.PacketUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class TabList {

    private List<Player> players = new CopyOnWriteArrayList<>();
    private Set<Player> viewers = new CopyOnWriteArraySet<>();
    private JsonMessage header;
    private JsonMessage footer;

    private long lastUpdate = System.currentTimeMillis();

    TabList() {
    }

    /**
     * Gets all the players that are displayed on the TabList
     *
     * @return A copied List of players that are displayed on the TabList, or empty List if none
     */
    @NotNull
    public List<Player> getPlayers() {
        return new CopyOnWriteArrayList<>(this.players);
    }


    /**
     * The TabList header
     *
     * @return the content of the header
     */
    public JsonMessage getHeader() {
        return this.header;
    }

    /**
     * Sets the header content of the TabList
     *
     * @param header the new header content
     */
    public void setHeader(@Nullable JsonMessage header) {
        this.header = header;
    }

    /**
     * The TabList footer
     * This will not update the tab list immediately so you must call {TabList#update}
     *
     * @return the content of the footer
     */
    @Nullable
    public JsonMessage getFooter() {
        return this.footer;
    }

    /**
     * Sets the footer content of the TabList.
     * This will not update the tab list immediately so you must call {TabList#update}
     *
     * @param footer the new footer content
     */
    public void setFooter(@Nullable JsonMessage footer) {
        PlayerListHeaderAndFooterPacket playerListHeaderAndFooterPacket = new PlayerListHeaderAndFooterPacket();
        playerListHeaderAndFooterPacket.footer = footer;
        playerListHeaderAndFooterPacket.header = header;

        //prolly do seprate like loop through all the players in the connectionhandler and update it on set intervals..

        this.footer = footer;
        MinecraftServer.getConnectionManager().getOnlinePlayers().forEach(player -> {
            // Something like this somewhere...
        });
    }

    /**
     * Adds a player to be displayed on this TabList
     *
     * @param player the player to be added
     */
    public void addPlayer(Player player) {
        PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(PlayerInfoPacket.Action.ADD_PLAYER);

        PlayerInfoPacket.AddPlayer addPlayer =
                new PlayerInfoPacket.AddPlayer(player.getUuid(), player.getUsername(), player.getGameMode(), player.getLatency());
        addPlayer.displayName = player.getDisplayName();

        // Skin support
        if (player.getSkin() != null) {
            final String textures = player.getSkin().getTextures();
            final String signature = player.getSkin().getSignature();

            PlayerInfoPacket.AddPlayer.Property prop =
                    new PlayerInfoPacket.AddPlayer.Property("textures", textures, signature);
            addPlayer.properties.add(prop);
        }

        playerInfoPacket.playerInfos.add(addPlayer);

        PacketUtils.sendGroupedPacket(this.viewers, playerInfoPacket);

        this.players.add(player);
    }

    /**
     * Removes a player from being displayed on this TabList
     *
     * @param player the player to be removed
     */
    public void removePlayer(Player player) {
        PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(PlayerInfoPacket.Action.REMOVE_PLAYER);

        PlayerInfoPacket.RemovePlayer removePlayer =
                new PlayerInfoPacket.RemovePlayer(player.getUuid());

        playerInfoPacket.playerInfos.add(removePlayer);

        PacketUtils.sendGroupedPacket(this.viewers, playerInfoPacket);
        this.players.remove(player);
    }

    /**
     * Updates a player's latency for all viewers of the tablist
     *
     * @param player The player to update latency for
     */
    public void updateLatency(Player player) {
        PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(PlayerInfoPacket.Action.UPDATE_LATENCY);
        playerInfoPacket.playerInfos.add(new PlayerInfoPacket.UpdateLatency(player.getUuid(), player.getLatency()));

        PacketUtils.sendGroupedPacket(this.viewers, playerInfoPacket);
    }

    /**
     * Updates a player's gamemode for all viewers of the tablist
     *
     * @param player The player to update the gamemode info for
     */
    public void updateGamemode(Player player) {
        PlayerInfoPacket playerInfoPacket = new PlayerInfoPacket(PlayerInfoPacket.Action.UPDATE_GAMEMODE);
        playerInfoPacket.playerInfos.add(new PlayerInfoPacket.UpdateGamemode(player.getUuid(), player.getGameMode()));

        PacketUtils.sendGroupedPacket(this.viewers, playerInfoPacket);

    }

    /**
     * Gets the last time the tablist was updated (ping & header & footer)
     *
     * @return a long of the unix millis then the update method was last called
     */
    public long getLastUpdate() {
        return lastUpdate;
    }

    public void update() {
        this.lastUpdate = System.currentTimeMillis();
    }


}
