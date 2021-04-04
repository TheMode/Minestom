package net.minestom.server.item;

import it.unimi.dsi.fastutil.Pair;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the stacking rule of an {@link ItemStack}.
 * This can be used to mimic the vanilla one (using the displayed item quantity)
 * or a complete new one which can be stored in lore, name, etc...
 */
public abstract class StackingRule {

    private final int maxSize;

    public StackingRule(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Used to know if two {@link ItemStack} can be stacked together.
     *
     * @param item1 the first {@link ItemStack}
     * @param item2 the second {@link ItemStack}
     * @return true if both {@link ItemStack} can be stacked together
     * (without taking their amount in consideration)
     */
    public abstract boolean canBeStacked(@NotNull ItemStack item1, @NotNull ItemStack item2);

    /**
     * Used to know if an {@link ItemStack} can have the size {@code newAmount} applied.
     *
     * @param item      the {@link ItemStack} to check
     * @param newAmount the desired new amount
     * @return true if {@code item} can have its stack size set to newAmount
     */
    public abstract boolean canApply(@NotNull ItemStack item, int newAmount);

    /**
     * Changes the size of the {@link ItemStack} to {@code newAmount}.
     * At this point we know that the item can have this stack size applied.
     *
     * @param item      the {@link ItemStack} to applies the size to
     * @param newAmount the new item size
     * @return a new {@link ItemStack item} with the specified amount
     */
    @Contract("_, _ -> new")
    public abstract @NotNull ItemStack apply(@NotNull ItemStack item, int newAmount);

    @Contract("_, _ -> new")
    public abstract @NotNull ItemStack merge(@NotNull ItemStack first, @NotNull ItemStack second);

    @Contract("_, _ -> new")
    public abstract @NotNull Pair<@NotNull ItemStack, @NotNull ItemStack> split(@NotNull ItemStack item, int firstAmount);

    /**
     * Used to determine the current stack size of an {@link ItemStack}.
     * It is possible to have it stored in its {@link net.minestom.server.data.Data} object, lore, etc...
     *
     * @param itemStack the {@link ItemStack} to check the size
     * @return the correct size of {@link ItemStack}
     */
    public abstract int getAmount(@NotNull ItemStack itemStack);

    /**
     * Gets the max size of a stack.
     *
     * @return the max size of a stack
     */
    public int getMaxSize() {
        return maxSize;
    }
}
