package net.minestom.server.entity.type.animal;

import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.EntityType;
import net.minestom.server.world.World;
import net.minestom.server.utils.Position;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @deprecated Use {@link net.minestom.server.entity.metadata.animal.LlamaMeta} instead.
 */
@Deprecated
public class EntityLlama extends EntityCreature {

    public EntityLlama(@NotNull Position spawnPosition) {
        super(EntityType.LLAMA, spawnPosition);
        setBoundingBox(.9D, 1.87D, .9D);
    }

    public EntityLlama(@NotNull Position spawnPosition, @Nullable World world) {
        super(EntityType.LLAMA, spawnPosition, world);
        setBoundingBox(.9D, 1.87D, .9D);
    }

}
