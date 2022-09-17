package net.thetaciturnone.onceforgotten.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.entity.ModEntities;
import net.thetaciturnone.onceforgotten.item.custom.ModAxeItem;
import net.thetaciturnone.onceforgotten.item.custom.ModPickaxeItem;
import net.thetaciturnone.onceforgotten.item.custom.UruLongswordItem;
import net.thetaciturnone.onceforgotten.item.custom.UruWarhammerItem;

public class ModItems {

    public static final Item RAW_URU = registerItem("raw_uru",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item URU_INGOT = registerItem("uru_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ARMOR_SHARD = registerItem("armor_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item URU_WARAXE = registerItem("uru_waraxe",
            new ModAxeItem(ModToolMaterials.URU, 6, -3.0F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_LONGSWORD = registerItem("uru_longsword",
            new UruLongswordItem(ModToolMaterials.URU, 4, -2.99F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_WARHAMMER = registerItem("uru_warhammer",
            new UruWarhammerItem(ModToolMaterials.URU, 5, -3.05F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_WARSPADE = registerItem("uru_warspade",
            new ShovelItem(ModToolMaterials.URU, 3, -3,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));

    public static final Item FALLEN_FOOTSOLDIER_SPAWN_EGG = registerItem("fallen_footsoldier_spawn_egg",
            new SpawnEggItem(ModEntities.FALLEN_FOOTSOLDIER, 8995, 2223,
                    new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnceForgotten.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnceForgotten.LOGGER.debug("Registering mod items for "+ OnceForgotten.MOD_ID);
    }
}
