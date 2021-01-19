package net.minestom.server.command.builder;

import net.minestom.server.command.builder.arguments.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Class used to retrieve argument data in a {@link CommandExecutor}.
 * <p>
 * All id are the one specified in the {@link net.minestom.server.command.builder.arguments.Argument} constructor.
 * <p>
 * All methods are @{@link NotNull} in the sense that you should not have to verify their validity since if the syntax
 * is called, it means that all of its arguments are correct. Be aware that trying to retrieve an argument not present
 * in the syntax will result in a {@link NullPointerException}.
 */
public final class Arguments {

    private Map<String, Object> args = new HashMap<>();

    @NotNull
    public <T> T get(@NotNull Argument<T> argument) {
        return (T) getObject(argument.getId());
    }

    @NotNull
    public Object getObject(@NotNull String id) {
        return args.computeIfAbsent(id, s -> {
            throw new NullPointerException(
                    "The argument with the id '" + id + "' has no value assigned, be sure to check your arguments id, your syntax, and that you do not change the argument id dynamically.");
        });
    }

    protected void setArg(@NotNull String id, Object value) {
        this.args.put(id, value);
    }

    protected void copy(Arguments arguments) {
        this.args = arguments.args;
    }

    protected void clear() {
        this.args.clear();
    }

    protected void retrieveDefaultValues(@Nullable Map<String, Object> defaultValuesMap) {
        if (defaultValuesMap == null)
            return;

        for (Map.Entry<String, Object> entry : defaultValuesMap.entrySet()) {
            final String key = entry.getKey();
            if (!args.containsKey(key))
                this.args.put(key, entry.getValue());
        }

    }
}
