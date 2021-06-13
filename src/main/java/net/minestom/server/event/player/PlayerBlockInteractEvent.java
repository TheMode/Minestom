package net.minestom.server.event.player;

import net.minestom.server.entity.Player;
import net.minestom.server.event.CancellableEvent;
import net.minestom.server.event.PlayerEvent;
import net.minestom.server.block.Block;
import net.minestom.server.block.BlockFace;
import net.minestom.server.utils.BlockPosition;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player interacts with a block (right-click).
 * This is also called when a block is placed.
 */
public class PlayerBlockInteractEvent extends PlayerEvent implements CancellableEvent {

    private final Player.Hand hand;
    private final Block block;
    private final BlockPosition blockPosition;
    private final BlockFace blockFace;

    /**
     * Does this interaction block the normal item use?
     * True for containers which open an inventory instead of letting blocks be placed
     */
    private boolean blocksItemUse;

    private boolean cancelled;

    public PlayerBlockInteractEvent(@NotNull Player player, @NotNull Player.Hand hand,
                                    @NotNull Block block, @NotNull BlockPosition blockPosition, @NotNull BlockFace blockFace) {
        super(player);
        this.hand = hand;
        this.block = block;
        this.blockPosition = blockPosition;
        this.blockFace = blockFace;
    }

    /**
     * Gets if the event should block the item use.
     *
     * @return true if the item use is blocked, false otherwise
     */
    public boolean isBlockingItemUse() {
        return blocksItemUse;
    }

    public void setBlockingItemUse(boolean blocks) {
        this.blocksItemUse = blocks;
    }

    public @NotNull Block getBlock() {
        return block;
    }

    /**
     * Gets the position of the interacted block.
     *
     * @return the block position
     */
    @NotNull
    public BlockPosition getBlockPosition() {
        return blockPosition;
    }

    /**
     * Gets the hand used for the interaction.
     *
     * @return the hand used
     */
    @NotNull
    public Player.Hand getHand() {
        return hand;
    }

    /**
     * Gets the block face.
     *
     * @return the block face
     */
    @NotNull
    public BlockFace getBlockFace() {
        return blockFace;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
