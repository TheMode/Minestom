package net.minestom.server.instance;

import net.minestom.server.instance.palette.Palette;
import net.minestom.server.utils.clone.PublicCloneable;
import org.jetbrains.annotations.NotNull;

public class Section implements PublicCloneable<Section> {

    private final Palette palette;

    private byte[] skyLight = new byte[0];
    private byte[] blockLight = new byte[0];

    private Section(Palette palette) {
        this.palette = palette;
    }

    public Section() {
        this(new Palette(8, 2));
    }

    public short getBlockAt(int x, int y, int z) {
        x = toChunkCoordinate(x);
        z = toChunkCoordinate(z);
        return palette.getBlockAt(x, y, z);
    }

    public void setBlockAt(int x, int y, int z, short blockId) {
        x = toChunkCoordinate(x);
        z = toChunkCoordinate(z);
        palette.setBlockAt(x, y, z, blockId);
    }

    public byte[] getSkyLight() {
        return skyLight;
    }

    public void setSkyLight(byte[] skyLight) {
        this.skyLight = skyLight;
    }

    public byte[] getBlockLight() {
        return blockLight;
    }

    public void setBlockLight(byte[] blockLight) {
        this.blockLight = blockLight;
    }

    public void clean() {
        palette.clean();
    }

    public void clear() {
        palette.clear();
    }

    public Palette getPalette() {
        return palette;
    }

    @Override
    public @NotNull Section clone() {
        return new Section(palette.clone());
    }

    /**
     * Converts a world coordinate to a chunk one.
     *
     * @param xz the world coordinate
     * @return the chunk coordinate of {@code xz}
     */
    private static int toChunkCoordinate(int xz) {
        xz %= 16;
        if (xz < 0) {
            xz += Chunk.CHUNK_SECTION_SIZE;
        }
        return xz;
    }
}
