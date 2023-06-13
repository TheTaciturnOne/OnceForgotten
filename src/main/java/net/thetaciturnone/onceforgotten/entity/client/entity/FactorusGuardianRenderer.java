package net.thetaciturnone.onceforgotten.entity.client.entity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.entities.FactorusGuardianEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FactorusGuardianRenderer extends GeoEntityRenderer<FactorusGuardianEntity> {
    public FactorusGuardianRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FactorusGuardianModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(FactorusGuardianEntity instance) {
        return new Identifier(OnceForgotten.MOD_ID, "textures/entity/factorus_guardian.png");
    }

    @Override
    public RenderLayer getRenderType(FactorusGuardianEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(1.2f, 1.2f, 1.2f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
