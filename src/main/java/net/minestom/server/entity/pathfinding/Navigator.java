package net.minestom.server.entity.pathfinding;

import com.extollit.gaming.ai.path.HydrazinePathFinder;
import com.extollit.gaming.ai.path.model.IPath;
import net.minestom.server.collision.CollisionUtils;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.LivingEntity;
import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.Instance;
import net.minestom.server.instance.WorldBorder;
import net.minestom.server.utils.Position;
import net.minestom.server.utils.Vector;
import net.minestom.server.utils.chunk.ChunkUtils;
import net.minestom.server.utils.position.PositionUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO all pathfinding requests could be processed in another thread

/**
 * Necessary object for all {@link NavigableEntity}.
 */
public class Navigator {

    private final PFPathingEntity pathingEntity;
    private HydrazinePathFinder pathFinder;
    private IPath path;
    private Position pathPosition;

    private final Entity entity;

    public Navigator(@NotNull Entity entity) {
        this.entity = entity;
        this.pathingEntity = new PFPathingEntity(this);
    }

    /**
     * Used to move the entity toward {@code direction} in the X and Z axis
     * Gravity is still applied but the entity will not attempt to jump
     * Also update the yaw/pitch of the entity to look along 'direction'
     *
     * @param direction the targeted position
     * @param speed     define how far the entity will move
     */
    public void moveTowards(@NotNull Position direction, double speed) {

        final Position position = entity.getPosition();

        final double currentX = position.getX();
        final double currentY = position.getY();
        final double currentZ = position.getZ();

        final double targetX = direction.getX();
        final double targetY = direction.getY();
        final double targetZ = direction.getZ();

        final double deltaX = targetX - currentX;
        final double deltaY = targetY - currentY;
        final double deltaZ = targetZ - currentZ;

        // the purpose of these few lines is to slow down entities when they reach their destination
        final double distSquared = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
        if (speed > distSquared) {
            speed = distSquared;
        }

        final double radians = Math.atan2(deltaZ, deltaX);
        final double speedX = Math.cos(radians) * speed;
        final double speedY = deltaY * speed;
        final double speedZ = Math.sin(radians) * speed;

        // Update 'position' view
        PositionUtils.lookAlong(position, deltaX, direction.getY(), deltaZ);

        Position newPosition = new Position();
        Vector newVelocityOut = new Vector();

        // Prevent ghosting
        CollisionUtils.handlePhysics(entity,
                new Vector(speedX, speedY, speedZ),
                newPosition, newVelocityOut);

        // Will move the entity during Entity#tick
        position.copyCoordinates(newPosition);
    }

    public void jump(float height) {
        // FIXME magic value
        final Vector velocity = new Vector(0, height * 2.5f, 0);
        this.entity.setVelocity(velocity);
    }

    /**
     * Retrieves the path to {@code position} and ask the entity to follow the path.
     * <p>
     * Can be set to null to reset the pathfinder.
     * <p>
     * The position is cloned, if you want the entity to continually follow this position object
     * you need to call this when you want the path to update.
     *
     * @param position   the position to find the path to, null to reset the pathfinder
     * @param bestEffort whether to use the best-effort algorithm to the destination,
     *                   if false then this method is more likely to return immediately
     * @return true if a path has been found
     */
    public synchronized boolean setPathTo(@Nullable Position position, boolean bestEffort) {
        if (position != null && pathPosition != null && position.isSimilar(pathPosition)) {
            // Tried to set path to the same target position
            return false;
        }

        final Instance instance = entity.getInstance();

        if (pathFinder == null) {
            // Unexpected error
            return false;
        }

        pathFinder.reset();
        if (position == null) {
            return false;
        }

        // Can't path with a null instance.
        if (instance == null) {
            return false;
        }

        // Can't path outside of the world border
        final WorldBorder worldBorder = instance.getWorldBorder();
        if (!worldBorder.isInside(position)) {
            return false;
        }

        // Can't path in an unloaded chunk
        final Chunk chunk = instance.getChunkAt(position);
        if (!ChunkUtils.isLoaded(chunk)) {
            return false;
        }

        final Position targetPosition = position.clone();

        final IPath path = pathFinder.initiatePathTo(
                targetPosition.getX(),
                targetPosition.getY(),
                targetPosition.getZ(),
                bestEffort);
        this.path = path;

        final boolean success = path != null;
        this.pathPosition = success ? targetPosition : null;

        return success;
    }

    /**
     * @see #setPathTo(Position, boolean) with {@code bestEffort} sets to {@code true}.
     */
    public boolean setPathTo(@Nullable Position position) {
        return setPathTo(position, true);
    }

    public synchronized void tick(float speed) {
        // No pathfinding tick for dead entities
        if (entity instanceof LivingEntity && ((LivingEntity) entity).isDead())
            return;

        if (pathPosition != null) {
            IPath path = pathFinder.updatePathFor(pathingEntity);
            this.path = path;

            if (path != null) {
                final Position targetPosition = pathingEntity.getTargetPosition();
                if (targetPosition != null) {
                    moveTowards(targetPosition, speed);
                }
            } else {
                if (pathPosition != null) {
                    this.pathPosition = null;
                    pathFinder.reset();
                }
            }
        }
    }

    /**
     * Gets the pathing entity.
     * <p>
     * Used by the pathfinder.
     *
     * @return the pathing entity
     */
    @NotNull
    public PFPathingEntity getPathingEntity() {
        return pathingEntity;
    }

    /**
     * Gets the assigned pathfinder.
     * <p>
     * Can be null if the navigable element hasn't been assigned to an {@link Instance} yet.
     *
     * @return the current pathfinder, null if none
     */
    @Nullable
    public HydrazinePathFinder getPathFinder() {
        return pathFinder;
    }

    public void setPathFinder(@Nullable HydrazinePathFinder pathFinder) {
        this.pathFinder = pathFinder;
    }

    /**
     * Gets the target pathfinder position.
     *
     * @return the target pathfinder position, null if there is no one
     */
    @Nullable
    public Position getPathPosition() {
        return pathPosition;
    }

    /**
     * Changes the position this element is trying to reach.
     *
     * @param pathPosition the new current path position
     * @deprecated Please use {@link #setPathTo(Position)}
     */
    @Deprecated(forRemoval = true)
    public void setPathPosition(@Nullable Position pathPosition) {
        this.pathPosition = pathPosition;
    }

    @Nullable
    public IPath getPath() {
        return path;
    }

    public void setPath(@Nullable IPath path) {
        this.path = path;
    }

    @NotNull
    public Entity getEntity() {
        return entity;
    }
}
