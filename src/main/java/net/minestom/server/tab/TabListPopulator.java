package net.minestom.server.tab;

import net.minestom.server.entity.Player;

/**
 * Controls the loading of a player's {@link TabList} on join.
 * Without any other configuration, the {@link net.minestom.server.tab.populators.DefaultTabPopulator} is used.
 */
public interface TabListPopulator {

    /**
     * Called when a player joins the server and requests a TabList.
     * This should be used to set the TabList of a player on join.
     * Not setting the TabList for a player on join will likely cause issues.
     *
     * @param player the player the TabList will be set for
     */
    void onJoin(Player player);

    /**
     * Called when a player leaves the server.
     * Not removing the player from their respective TabList will likely cause issues
     *
     * @param player the player the TabList will be set for
     */
    void onLeave(Player player);
}