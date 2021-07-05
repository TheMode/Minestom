package net.minestom.server.utils.coordinate;

import net.minestom.server.utils.MathUtils;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a 3D point.
 * <p>
 * Can either be a {@link Pos} or {@link Vec}.
 * Interface will become {@code sealed} in the future.
 */
@ApiStatus.NonExtendable
public interface Point {

    /**
     * Gets the X coordinate.
     *
     * @return the X coordinate
     */
    @Contract(pure = true)
    double x();

    /**
     * Gets the Y coordinate.
     *
     * @return the Y coordinate
     */
    @Contract(pure = true)
    double y();

    /**
     * Gets the Z coordinate.
     *
     * @return the Z coordinate
     */
    @Contract(pure = true)
    double z();

    /**
     * Gets the distance between this point and another. The value of this
     * method is not cached and uses a costly square-root function, so do not
     * repeatedly call this method to get the vector's magnitude. NaN will be
     * returned if the inner result of the sqrt() function overflows, which
     * will be caused if the distance is too long.
     *
     * @param point the other point
     * @return the distance
     */
    @Contract(pure = true)
    default double distance(@NotNull Point point) {
        return Math.sqrt(MathUtils.square(x() - point.x()) +
                MathUtils.square(y() - point.y()) +
                MathUtils.square(z() - point.z()));
    }

    /**
     * Gets the squared distance between this point and another.
     *
     * @param point the other point
     * @return the squared distance
     */
    @Contract(pure = true)
    default double distanceSquared(@NotNull Point point) {
        return MathUtils.square(x() - point.x()) +
                MathUtils.square(y() - point.y()) +
                MathUtils.square(z() - point.z());
    }

    /**
     * Converts all coordinates to integers.
     *
     * @return a new point representing a block position
     */
    @Contract(pure = true)
    default @NotNull Point asBlockPosition() {
        final int castedY = (int) y();
        return new Vec((int) Math.floor(x()),
                (y() == castedY) ? castedY : castedY + 1,
                (int) Math.floor(z()));
    }

    /**
     * @deprecated present for backward compatibility
     */
    @Deprecated
    @Contract(pure = true)
    default @NotNull Point clone() {
        return this;
    }
}