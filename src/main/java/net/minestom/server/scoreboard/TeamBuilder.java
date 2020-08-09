package net.minestom.server.scoreboard;

import net.minestom.server.chat.ChatColor;
import net.minestom.server.chat.ColoredText;
import net.minestom.server.network.packet.server.play.TeamsPacket.CollisionRule;
import net.minestom.server.network.packet.server.play.TeamsPacket.NameTagVisibility;

/**
 * A builder which represents a fluent Object to built teams
 */
public class TeamBuilder {

    /**
     * The management for the teams
     */
    private final TeamManager teamManager;
    /**
     * The team to create
     */
    private final Team team;
    /**
     * True, if it should send an update packet
     */
    private boolean updateTeam;

    /**
     * Creates an team builder
     *
     * @param name        The name of the new team
     * @param teamManager The manager for the team
     */
    public TeamBuilder(String name, TeamManager teamManager) {
        this(teamManager.exists(name) ? teamManager.getTeam(name) : new Team(name), teamManager);
    }

    /**
     * Creates an team builder
     *
     * @param team        The new team
     * @param teamManager The manager for the team
     */
    private TeamBuilder(Team team, TeamManager teamManager) {
        this.team = team;
        this.teamManager = teamManager;
        this.updateTeam = false;
    }

    /**
     * Updates the prefix of the {@link Team}
     *
     * @param prefix The new prefix
     * @return this builder, for chaining
     */
    public TeamBuilder updatePrefix(String prefix) {
        return this.updatePrefix(ColoredText.of(prefix));
    }

    /**
     * Updates the prefix of the {@link Team}
     *
     * @param prefix The new prefix
     * @return this builder, for chaining
     */
    public TeamBuilder updatePrefix(ColoredText prefix) {
        this.team.updatePrefix(prefix);
        return this;
    }

    /**
     * Updates the color of the {@link Team}
     *
     * @param color The new color
     * @return this builder, for chaining
     */
    public TeamBuilder updateTeamColor(ChatColor color) {
        this.team.updateTeamColor(color);
        return this;
    }

    /**
     * Updates the suffix of the {@link Team}
     *
     * @param suffix The new suffix
     * @return this builder, for chaining
     */
    public TeamBuilder updateSuffix(String suffix) {
        return updateSuffix(ColoredText.of(suffix));
    }

    /**
     * Updates the suffix of the {@link Team}
     *
     * @param suffix The new suffix
     * @return this builder, for chaining
     */
    public TeamBuilder updateSuffix(ColoredText suffix) {
        this.team.updateSuffix(suffix);
        return this;
    }

    /**
     * Updates the display name of the {@link Team}
     *
     * @param displayName The new display name
     * @return this builder, for chaining
     */
    public TeamBuilder updateTeamDisplayName(String displayName) {
        return this.updateTeamDisplayName(ColoredText.of(displayName));
    }

    /**
     * Updates the display name of the {@link Team}
     *
     * @param displayName The new display name
     * @return this builder, for chaining
     */
    public TeamBuilder updateTeamDisplayName(ColoredText displayName) {
        this.team.updateTeamDisplayName(displayName);
        return this;
    }

    /**
     * Updates the {@link CollisionRule} of the {@link Team}
     *
     * @param rule The new rule
     * @return this builder, for chaining
     */
    public TeamBuilder updateCollisionRule(CollisionRule rule) {
        this.team.updateCollisionRule(rule);
        return this;
    }

    /**
     * Updates the {@link NameTagVisibility} of the {@link Team}
     *
     * @param visibility The new tag visibility
     * @return this builder, for chaining
     */
    public TeamBuilder updateNameTagVisibility(NameTagVisibility visibility) {
        this.team.updateNameTagVisibility(visibility);
        return this;
    }

    /**
     * Updates the friendly flags of the {@link Team}
     *
     * @param flag The new friendly flag
     * @return this builder, for chaining
     */
    public TeamBuilder updateFriendlyFlags(byte flag) {
        this.team.updateFriendlyFlags(flag);
        return this;
    }

    /**
     * Updates the friendly flags for allow friendly fire
     *
     * @return this builder, for chaining
     */
    public TeamBuilder updateAllowFriendlyFire() {
        return this.updateFriendlyFlags((byte) 0x01);
    }

    /**
     * Updates the friendly flags to sees invisible players of own team
     *
     * @return this builder, for chaining
     */
    public TeamBuilder updateSeeInvisiblePlayers() {
        return this.updateFriendlyFlags((byte) 0x01);
    }

    /**
     * Change the prefix of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param prefix The new prefix
     * @return this builder, for chaining
     */
    public TeamBuilder prefix(String prefix) {
        return this.prefix(ColoredText.of(prefix));
    }

    /**
     * Change the prefix of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param prefix The new prefix
     * @return this builder, for chaining
     */
    public TeamBuilder prefix(ColoredText prefix) {
        this.team.setPrefix(prefix);
        return this;
    }

    /**
     * Change the suffix of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param suffix The new suffix
     * @return this builder, for chaining
     */
    public TeamBuilder suffix(String suffix) {
        this.team.setSuffix(ColoredText.of(suffix));
        return this;
    }

    /**
     * Change the suffix of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param suffix The new suffix
     * @return this builder, for chaining
     */
    public TeamBuilder suffix(ColoredText suffix) {
        this.team.setSuffix(suffix);
        return this;
    }

    /**
     * Change the color of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param color The new team color
     * @return this builder, for chaining
     */
    public TeamBuilder teamColor(ChatColor color) {
        this.team.setTeamColor(color);
        return this;
    }

    /**
     * Change the display name of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param displayName The new display name
     * @return this builder, for chaining
     */
    public TeamBuilder teamDisplayName(String displayName) {
        return this.teamDisplayName(ColoredText.of(displayName));
    }

    /**
     * Change the display name of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param displayName The new display name
     * @return this builder, for chaining
     */
    public TeamBuilder teamDisplayName(ColoredText displayName) {
        this.team.setTeamDisplayName(displayName);
        return this;
    }

    /**
     * Change the {@link CollisionRule} of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param rule The new rule
     * @return this builder, for chaining
     */
    public TeamBuilder collisionRule(CollisionRule rule) {
        this.team.setCollisionRule(rule);
        return this;
    }

    /**
     * Change the {@link NameTagVisibility} of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param visibility The new tag visibility
     * @return this builder, for chaining
     */
    public TeamBuilder nameTagVisibility(NameTagVisibility visibility) {
        this.team.setNameTagVisibility(visibility);
        return this;
    }

    /**
     * Change the friendly flags of the {@link Team} without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @param flag The new flag
     * @return this builder, for chaining
     */
    public TeamBuilder friendlyFlags(byte flag) {
        this.team.setFriendlyFlags(flag);
        return this;
    }

    /**
     * Change the friendly flags for allow friendly fire without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @return this builder, for chaining
     */
    public TeamBuilder allowFriendlyFire() {
        return this.friendlyFlags((byte) 0x01);
    }

    /**
     * Change the friendly flags to sees invisible players of own team without an update packet
     * <br><br>
     * <b>Warning: </b> If you do not call {@link #updateTeamPacket()}, this is only changed of the <b>server side</b>
     *
     * @return this builder, for chaining
     */
    public TeamBuilder seeInvisiblePlayers() {
        return this.friendlyFlags((byte) 0x01);
    }

    /**
     * Allows to send an update packet when the team is built
     *
     * @return this builder, for chaining
     */
    public TeamBuilder updateTeamPacket() {
        this.updateTeam = true;
        return this;
    }

    /**
     * Built a team
     *
     * @return the built team
     */
    public Team build() {
        if (!this.teamManager.exists(this.team)) this.teamManager.registerNewTeam(this.team);
        if (this.updateTeam) {
            this.team.sendUpdatePacket();
            this.updateTeam = false;
        }
        return this.team;
    }

}
