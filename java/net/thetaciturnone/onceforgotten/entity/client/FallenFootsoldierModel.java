package net.thetaciturnone.onceforgotten.entity.client;

import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class FallenFootsoldierModel extends AnimatedGeoModel<FallenFootsoldierEntity> {
    @Override
    public Identifier getModelResource(FallenFootsoldierEntity object) {
        return new Identifier(OnceForgotten.MOD_ID, "geo/fallen_footsoldier.geo.json");
    }

    @Override
    public Identifier getTextureResource(FallenFootsoldierEntity object) {
        return new Identifier(OnceForgotten.MOD_ID, "textures/entity/fallen_footsoldier/fallen_footsoldier.png");
    }

    @Override
    public Identifier getAnimationResource(FallenFootsoldierEntity animatable) {
        return new Identifier(OnceForgotten.MOD_ID, "animations/fallen_footsoldier.animation.json");
    }

    @Override
    public void setLivingAnimations(FallenFootsoldierEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
