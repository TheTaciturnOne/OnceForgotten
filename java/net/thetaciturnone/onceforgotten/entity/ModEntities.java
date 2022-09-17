package net.thetaciturnone.onceforgotten.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<FallenFootsoldierEntity> FALLEN_FOOTSOLDIER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(OnceForgotten.MOD_ID, "fallen_footsoldier"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FallenFootsoldierEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 3)).build());

    public static <T extends Entity> EntityType<T> registerEntity(String name, EntityType<T> entry) {
        return Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier(OnceForgotten.MOD_ID, name),
                entry
        );
    }

    public static void registerModEntities() {
    }
}
