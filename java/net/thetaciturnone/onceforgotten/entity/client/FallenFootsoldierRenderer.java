package net.thetaciturnone.onceforgotten.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FallenFootsoldierRenderer extends GeoEntityRenderer<FallenFootsoldierEntity> {
    public FallenFootsoldierRenderer(EntityRendererFactory.Context cxt) {
        super (cxt, new FallenFootsoldierModel());
    }

    public Identifier getTextureLocation(FallenFootsoldierEntity instance) {
        return new Identifier(OnceForgotten.MOD_ID, "textures/entity/fallen_footsoldier/fallen_footsoldier.png");
    }
}