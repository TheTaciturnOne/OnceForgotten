import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thetaciturnone.onceforgotten.client.render.item.UruLongswordRenderer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.networking.api.client.ClientPlayNetworking;
import org.quiltmc.qsl.resource.loader.api.ResourceLoader;

public final class OnceForgottenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        RenderHandler.init();
            for ((Item item:UruLongswordItem) {
            Identifier scytheId = Registry.ITEM.getId(item);
            ScytheItemRenderer scytheItemRenderer = new UruLongswordItemRenderer(urulongswordId);
            ResourceLoader.get(ResourceType.CLIENT_RESOURCES).registerReloader(UruLongswordRenderer);
            BuiltinItemRendererRegistry.INSTANCE.register(item, UruLongswordRenderer);
            ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> {
                out.accept(new ModelIdentifier(urulongswordId + "_gui", "inventory"));
                out.accept(new ModelIdentifier(urulongswordId + "_handheld", "inventory"));
            });
        }
)