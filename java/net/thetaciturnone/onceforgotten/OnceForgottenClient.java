package net.thetaciturnone.onceforgotten;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.thetaciturnone.onceforgotten.entity.ModEntities;
import net.thetaciturnone.onceforgotten.entity.client.FallenFootsoldierRenderer;

public class OnceForgottenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.FALLEN_FOOTSOLDIER, FallenFootsoldierRenderer::new);

    }
}
