package net.thetaciturnone.onceforgotten.entity;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.entities.FactorusGuardianEntity;

public class OFEntities {
    public static final EntityType<FactorusGuardianEntity> FACTORUS_GUARDIAN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(OnceForgotten.MOD_ID, "factorus_guardian"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FactorusGuardianEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 2.5f)).build());
}
