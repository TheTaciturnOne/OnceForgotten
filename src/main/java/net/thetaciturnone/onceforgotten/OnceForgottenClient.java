package net.thetaciturnone.onceforgotten;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.thetaciturnone.onceforgotten.block.OFBlocks;
import net.thetaciturnone.onceforgotten.entity.OFEntities;
import net.thetaciturnone.onceforgotten.entity.client.armor.PowerArmorRenderer;
import net.thetaciturnone.onceforgotten.entity.client.entity.FactorusGuardianRenderer;
import net.thetaciturnone.onceforgotten.item.OFItems;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OnceForgottenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(OFBlocks.COPPER_GEAR, RenderLayer.getCutout());
        GeoArmorRenderer.registerArmorRenderer(new PowerArmorRenderer(), (OFItems.POWER_ARMOR));
        EntityRendererRegistry.register(OFEntities.FACTORUS_GUARDIAN, FactorusGuardianRenderer::new);
    }
}
