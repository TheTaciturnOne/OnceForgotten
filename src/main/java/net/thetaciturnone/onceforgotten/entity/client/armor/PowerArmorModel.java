package net.thetaciturnone.onceforgotten.entity.client.armor;

import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.item.PowerArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PowerArmorModel extends AnimatedGeoModel<PowerArmorItem> {
    @Override
    public Identifier getModelResource(PowerArmorItem object) {
        return new Identifier(OnceForgotten.MOD_ID, "geo/power_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(PowerArmorItem object) {
        return new Identifier(OnceForgotten.MOD_ID, "textures/models/armor/power_armor_model_texture.png");
    }

    @Override
    public Identifier getAnimationResource(PowerArmorItem animatable) {
        return new Identifier(OnceForgotten.MOD_ID, "animations/power_armor.animation.json");
    }
}
