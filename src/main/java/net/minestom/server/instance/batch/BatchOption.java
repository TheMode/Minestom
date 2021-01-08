package net.minestom.server.instance.batch;

import org.jetbrains.annotations.NotNull;

public class BatchOption {
    private boolean fullChunk = false;
    private boolean calculateInverse = false;
    private boolean unsafeApply = false;

    public BatchOption() {
    }

    /**
     * Gets if the batch is responsible for composing the whole chunk.
     * <p>
     * Having it to true means that the batch will clear the chunk data before placing the blocks.
     *
     * @return true if the batch is responsible for all the chunk
     */
    public boolean isFullChunk() {
        return fullChunk;
    }

    public boolean shouldCalculateInverse() {
        return calculateInverse;
    }

    public boolean isUnsafeApply() {
        return this.unsafeApply;
    }

    /**
     * @param fullChunk true to make this batch composes the whole chunk
     * @return 'this' for chaining
     * @see #isFullChunk()
     */
    @NotNull
    public BatchOption setFullChunk(boolean fullChunk) {
        this.fullChunk = fullChunk;
        return this;
    }

    @NotNull
    public BatchOption setCalculateInverse(boolean calculateInverse) {
        this.calculateInverse = calculateInverse;
        return this;
    }

    @NotNull
    public BatchOption setUnsafeApply(boolean unsafeApply) {
        this.unsafeApply = unsafeApply;
        return this;
    }
}
