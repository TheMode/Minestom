package demo.commands;

import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.minestom.server.command.builder.arguments.ArgumentEnum;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.command.builder.arguments.minecraft.registry.ArgumentEntityType;
import net.minestom.server.command.builder.arguments.relative.ArgumentRelativeVec3;
import net.minestom.server.command.builder.condition.Conditions;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class SummonCommand extends Command {

    private final ArgumentEntityType entity;
    private final ArgumentRelativeVec3 pos;
    private final ArgumentEnum<EntityClass> entity_class;

    public SummonCommand() {
        super("summon");
        setCondition(Conditions::playerOnly);

        entity = ArgumentType.EntityType("entity type");
        pos = ArgumentType.RelativeVec3("pos");
        entity_class = ArgumentType.Enum("entity class", EntityClass.class);
        addSyntax(this::execute, entity, pos, entity_class);
    }

    private void execute(@NotNull CommandSender commandSender, @NotNull CommandContext commandContext) {
        final EntityClass entityClass = commandContext.get(entity_class);
        final Entity entity = entityClass.instantiate(commandContext.get(this.entity));
        //noinspection ConstantConditions - One couldn't possibly execute a command without being in an instance
        entity.setInstance(commandSender.asPlayer().getInstance(), commandContext.get(pos).from(commandSender.asPlayer()).toPosition());
    }

    enum EntityClass {
        base(Entity::new),
        living(LivingEntity::new),
        creature(EntityCreature::new);
        private final EntityFactory<?> factory;

        EntityClass(EntityFactory<?> factory) {
            this.factory = factory;
        }

        public Entity instantiate(EntityType type) {
            return factory.newInstance(type);
        }
    }

    interface EntityFactory<T extends Entity> {
        T newInstance(EntityType type);
    }
}
