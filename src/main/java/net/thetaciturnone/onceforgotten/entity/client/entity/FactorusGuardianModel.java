package net.thetaciturnone.onceforgotten.entity.client.entity;

import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.entities.FactorusGuardianEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FactorusGuardianModel extends AnimatedGeoModel<FactorusGuardianEntity> {
@Override
public Identifier getModelResource(FactorusGuardianEntity object) {
        return new Identifier(OnceForgotten.MOD_ID, "geo/factorus_guardian.geo.json");
        }

@Override
public Identifier getTextureResource(FactorusGuardianEntity object) {
        return new Identifier(OnceForgotten.MOD_ID, "textures/entity/factorus_guardian.png");
        }

@Override
public Identifier getAnimationResource(FactorusGuardianEntity animatable) {
        return new Identifier(OnceForgotten.MOD_ID, "animations/factorus_guardian.animation.json");
        }
}
