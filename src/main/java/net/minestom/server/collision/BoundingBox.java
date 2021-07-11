package net.minestom.server.collision;

import net.minestom.server.coordinate.Point;
import net.minestom.server.coordinate.Vec;
import net.minestom.server.entity.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * See https://wiki.vg/Entity_metadata#Mobs_2
 */
public class BoundingBox {

    private Point point;
    private final double x, y, z;
    private double minX;
    private double maxX;
    private double maxY;
    private double minZ;
    private double maxZ;
    private Vec[] bottomFace;
    private Vec[] topFace;
    private Vec[] leftFace;
    private Vec[] rightFace;
    private Vec[] frontFace;
    private Vec[] backFace;

    /**
     * Creates a {@link BoundingBox} linked to an {@link Entity} and with a specific size.
     *
     * @param point  the entity"s location
     * @param x      the width size
     * @param y      the height size
     * @param z      the depth size
     */
    public BoundingBox(@NotNull Point point, double x, double y, double z) {
        this.point = point;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void update(Point point) {
        this.point = point;
        minX = point.x() - (this.x / 2);
        maxX = point.x() + (x / 2);
        maxY = point.y() + y;
        minZ = point.z() - (z / 2);
        maxZ = point.z() + (z / 2);
        bottomFace = new Vec[]{
                new Vec(getMinX(), getMinY(), getMinZ()),
                new Vec(getMaxX(), getMinY(), getMinZ()),
                new Vec(getMaxX(), getMinY(), getMaxZ()),
                new Vec(getMinX(), getMinY(), getMaxZ()),
        };
        topFace = new Vec[]{
                new Vec(getMinX(), getMaxY(), getMinZ()),
                new Vec(getMaxX(), getMaxY(), getMinZ()),
                new Vec(getMaxX(), getMaxY(), getMaxZ()),
                new Vec(getMinX(), getMaxY(), getMaxZ()),
        };
        leftFace = new Vec[]{
                new Vec(getMinX(), getMinY(), getMinZ()),
                new Vec(getMinX(), getMaxY(), getMinZ()),
                new Vec(getMinX(), getMaxY(), getMaxZ()),
                new Vec(getMinX(), getMinY(), getMaxZ()),
        };
        rightFace = new Vec[]{
                new Vec(getMaxX(), getMinY(), getMinZ()),
                new Vec(getMaxX(), getMaxY(), getMinZ()),
                new Vec(getMaxX(), getMaxY(), getMaxZ()),
                new Vec(getMaxX(), getMinY(), getMaxZ()),
        };
        frontFace = new Vec[]{
                new Vec(getMinX(), getMinY(), getMinZ()),
                new Vec(getMaxX(), getMinY(), getMinZ()),
                new Vec(getMaxX(), getMaxY(), getMinZ()),
                new Vec(getMinX(), getMaxY(), getMinZ()),
        };
        backFace = new Vec[]{
                new Vec(getMinX(), getMinY(), getMaxZ()),
                new Vec(getMaxX(), getMinY(), getMaxZ()),
                new Vec(getMaxX(), getMaxY(), getMaxZ()),
                new Vec(getMinX(), getMaxY(), getMaxZ()),
        };
    }

    /**
     * Used to know if two {@link BoundingBox} intersect with each other.
     *
     * @param boundingBox the {@link BoundingBox} to check
     * @return true if the two {@link BoundingBox} intersect with each other, false otherwise
     */
    public boolean intersect(@NotNull BoundingBox boundingBox) {
        return (getMinX() <= boundingBox.getMaxX() && getMaxX() >= boundingBox.getMinX()) &&
                (getMinY() <= boundingBox.getMaxY() && getMaxY() >= boundingBox.getMinY()) &&
                (getMinZ() <= boundingBox.getMaxZ() && getMaxZ() >= boundingBox.getMinZ());
    }

    /**
     * Used to know if this {@link BoundingBox} intersects with the bounding box of an entity.
     *
     * @param entity the entity to check the bounding box
     * @return true if this bounding box intersects with the entity, false otherwise
     */
    public boolean intersect(@NotNull Entity entity) {
        return intersect(entity.getBoundingBox());
    }

    /**
     * Used to know if the bounding box intersects at a block position.
     *
     * @param blockX the block X
     * @param blockY the block Y
     * @param blockZ the block Z
     * @return true if the bounding box intersects with the position, false otherwise
     */
    public boolean intersectWithBlock(int blockX, int blockY, int blockZ) {
        final double offsetX = 1;
        final double maxX = (double) blockX + offsetX;

        final boolean checkX = getMinX() < maxX && getMaxX() > (double) blockX;
        if (!checkX)
            return false;

        final double maxY = (double) blockY + 0.99999;

        final boolean checkY = getMinY() < maxY && getMaxY() > (double) blockY;
        if (!checkY)
            return false;

        final double offsetZ = 1;
        final double maxZ = (double) blockZ + offsetZ;

        // Z check
        return getMinZ() < maxZ && getMaxZ() > (double) blockZ;
    }

    /**
     * Used to know if the bounding box intersects at a point.
     *
     * @param blockPosition the position to check
     * @return true if the bounding box intersects with the position, false otherwise
     */
    public boolean intersectWithBlock(@NotNull Point blockPosition) {
        return intersectWithBlock(blockPosition.blockX(), blockPosition.blockY(), blockPosition.blockZ());
    }

    public boolean intersect(double x, double y, double z) {
        return (x >= getMinX() && x <= getMaxX()) &&
                (y >= getMinY() && y <= getMaxY()) &&
                (z >= getMinZ() && z <= getMaxZ());
    }

    public boolean intersect(@NotNull Point point) {
        return intersect(point.x(), point.y(), point.z());
    }

    /**
     * Creates a new {@link BoundingBox} linked to the same {@link Entity} with expanded size.
     *
     * @param x the X offset
     * @param y the Y offset
     * @param z the Z offset
     * @return a new {@link BoundingBox} expanded
     */
    @NotNull
    public BoundingBox expand(double x, double y, double z) {
        return new BoundingBox(point, this.x + x, this.y + y, this.z + z);
    }

    /**
     * Creates a new {@link BoundingBox} linked to the same {@link Entity} with contracted size.
     *
     * @param x the X offset
     * @param y the Y offset
     * @param z the Z offset
     * @return a new bounding box contracted
     */
    @NotNull
    public BoundingBox contract(double x, double y, double z) {
        return new BoundingBox(point, this.x - x, this.y - y, this.z - z);
    }

    /**
     * Gets the width of the {@link BoundingBox}.
     *
     * @return the width
     */
    public double getWidth() {
        return x;
    }

    /**
     * Gets the height of the {@link BoundingBox}.
     *
     * @return the height
     */
    public double getHeight() {
        return y;
    }

    /**
     * Gets the depth of the {@link BoundingBox}.
     *
     * @return the depth
     */
    public double getDepth() {
        return z;
    }

    /**
     * Gets the min X based on {@link #getWidth()} and the {@link Entity} position.
     *
     * @return the min X
     */
    public double getMinX() {
        return minX;
    }

    /**
     * Gets the max X based on {@link #getWidth()} and the {@link Entity} position.
     *
     * @return the max X
     */
    public double getMaxX() {
        return maxX;
    }

    /**
     * Gets the min Y based on the {@link Entity} position.
     *
     * @return the min Y
     */
    public double getMinY() {
        return point.y();
    }

    /**
     * Gets the max Y based on {@link #getHeight()} and the {@link Entity} position.
     *
     * @return the max Y
     */
    public double getMaxY() {
        return maxY;
    }

    /**
     * Gets the min Z based on {@link #getDepth()} and the {@link Entity} position.
     *
     * @return the min Z
     */
    public double getMinZ() {
        return minZ;
    }

    /**
     * Gets the max Z based on {@link #getDepth()} and the {@link Entity} position.
     *
     * @return the max Z
     */
    public double getMaxZ() {
        return maxZ;
    }

    /**
     * Gets an array of {@link Vec} representing the points at the bottom of the {@link BoundingBox}.
     *
     * @return the points at the bottom of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getBottomFace() {
        return bottomFace;
    }

    /**
     * Gets an array of {@link Vec} representing the points at the top of the {@link BoundingBox}.
     *
     * @return the points at the top of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getTopFace() {
        return topFace;
    }

    /**
     * Gets an array of {@link Vec} representing the points on the left face of the {@link BoundingBox}.
     *
     * @return the points on the left face of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getLeftFace() {
        return leftFace;
    }

    /**
     * Gets an array of {@link Vec} representing the points on the right face of the {@link BoundingBox}.
     *
     * @return the points on the right face of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getRightFace() {
        return rightFace;
    }

    /**
     * Gets an array of {@link Vec} representing the points at the front of the {@link BoundingBox}.
     *
     * @return the points at the front of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getFrontFace() {
        return frontFace;
    }

    /**
     * Gets an array of {@link Vec} representing the points at the back of the {@link BoundingBox}.
     *
     * @return the points at the back of the {@link BoundingBox}
     */
    @NotNull
    public Vec[] getBackFace() {
        return backFace;
    }

    @Override
    public String toString() {
        String result = "BoundingBox";
        result += "\n";
        result += "[" + getMinX() + " : " + getMaxX() + "]";
        result += "\n";
        result += "[" + getMinY() + " : " + getMaxY() + "]";
        result += "\n";
        result += "[" + getMinZ() + " : " + getMaxZ() + "]";
        return result;
    }
}
