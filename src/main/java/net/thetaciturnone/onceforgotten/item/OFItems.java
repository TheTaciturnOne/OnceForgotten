package net.thetaciturnone.onceforgotten.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.minecraft.item.PickaxeItem;
import net.thetaciturnone.onceforgotten.entity.OFEntities;
import net.thetaciturnone.onceforgotten.item.custom.CrystallineHeart;
import net.thetaciturnone.onceforgotten.item.custom.UruLongswordItem;

public class OFItems {

    // Chapter 1
    public static final Item RAW_URU = registerItem("raw_uru",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item URU_INGOT = registerItem("uru_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ARMOR_SHARD = registerItem("armor_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item URU_WARAXE = registerItem("uru_waraxe",
            new AxeItem(OFToolMaterials.URU, 6, -3.0F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_LONGSWORD = registerItem("uru_longsword",
            new UruLongswordItem(OFToolMaterials.URU, 4, -2.99F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_WARHAMMER = registerItem("uru_warhammer",
            new PickaxeItem(OFToolMaterials.URU, 5, -3.05F,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    public static final Item URU_WARSPADE = registerItem("uru_warspade",
            new ShovelItem(OFToolMaterials.URU, 3, -3,
                    new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));
    // Chapter 2
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item LAPIS_DUST = registerItem("lapis_lazuli_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TEMPUS_DUST = registerItem("tempus_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TEMPUS_CRYSTAL = registerItem("tempus_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MALFORMED_ENDER_PEARL = registerItem("malformed_ender_pearl",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item POWERFUL_CONTRAPTION_PIECE = registerItem("powerful_contraption_piece",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CRYSTALLINE_HEART = registerItem("crystalline_heart",
            new CrystallineHeart(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item POWER_ARMOR = registerItem("power_armor",
            new PowerArmorItem(OFArmorMaterials.POWER_ARMOR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FACTORUS_GUARDIAN_SPAWN_EGG = registerItem("factorus_guardian_spawn_egg",
            new SpawnEggItem(OFEntities.FACTORUS_GUARDIAN,0x2d5144, 0x75a996,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnceForgotten.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnceForgotten.LOGGER.debug("Registering mod items for "+ OnceForgotten.MOD_ID);
    }
}
