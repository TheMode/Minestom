package demo.commands;

import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.command.builder.arguments.minecraft.registry.ArgumentParticle;
import net.minestom.server.command.builder.condition.Conditions;
import net.minestom.server.entity.Player;
import net.minestom.server.particle.shapes.ShapeOptions;
import net.minestom.server.utils.ParticleUtils;
import org.jetbrains.annotations.NotNull;

public class ParticleCommand extends Command {

    private final ArgumentParticle particle;

    public ParticleCommand() {
        super("particle");
        setCondition(Conditions::playerOnly);

        particle = ArgumentType.Particle("particle");
        addSyntax(this::execute, particle);
    }

    private void execute(@NotNull CommandSender sender, @NotNull CommandContext context) {
        Player player = sender.asPlayer();

        //TODO particle data
        //noinspection ConstantConditions
        ParticleUtils.drawParticle(player.getInstance(), player.getPosition().clone().add(0, 2, 0),
                ShapeOptions.builder(context.get(particle)).build());
    }
}
