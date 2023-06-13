package net.thetaciturnone.onceforgotten.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.minecraft.util.registry.Registry;

public class OFBlocks {

    // Chapter One: Wars Of Yore

    public static final Block HARDENED_METAL_SUPPORT = registerBlock("hardened_metal_support",
            new Block(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block HARDENED_METAL_PLATE = registerBlock("hardened_metal_plate",
            new Block(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LUMINOUS_METAL_PLATE = registerBlock("luminous_metal_plate",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).luminance(15).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLOCK_OF_RAW_URU = registerBlock("block_of_raw_uru",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2F).hardness(30.0F).sounds(BlockSoundGroup.ANCIENT_DEBRIS).resistance(3600000F).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLOCK_OF_URU = registerBlock("block_of_uru",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2F).hardness(30.0F).sounds(BlockSoundGroup.METAL).resistance(3600000F).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTMOLD = registerBlock("sootmold",
            new OreBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.1F).sounds(BlockSoundGroup.SOUL_SAND).requiresTool()), ItemGroup.MISC);
    public static final Block SOOTSTONE_BRICKS = registerBlock("sootstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_WALL = registerBlock("sootstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_STAIRS = registerBlock("sootstone_brick_stairs",
            new StairsBlock(OFBlocks.SOOTSTONE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_SLAB = registerBlock("sootstone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_SOOTSTONE_BRICKS = registerBlock("chiseled_sootstone_bricks",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    //Chapter Two: Rediscovered Technologies

    public static final Block COPPER_GEAR = registerBlock("copper_gear",
            new CopperGearBlock(FabricBlockSettings.of(Material.METAL).strength(2.0F, 6.0f).sounds(BlockSoundGroup.COPPER).nonOpaque().requiresTool()), ItemGroup.MATERIALS);
    public static final Block CLOCKWORK_MECHANISM = registerBlock("clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block EXPOSED_CLOCKWORK_MECHANISM = registerBlock("exposed_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WEATHERED_CLOCKWORK_MECHANISM = registerBlock("weathered_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block OXIDIZED_CLOCKWORK_MECHANISM = registerBlock("oxidized_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block REVERSED_EXPOSED_CLOCKWORK_MECHANISM = registerBlock("reversed_exposed_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block REVERSED_WEATHERED_CLOCKWORK_MECHANISM = registerBlock("reversed_weathered_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block REVERSED_OXIDIZED_CLOCKWORK_MECHANISM = registerBlock("reversed_oxidized_clockwork_mechanism",
            new CopperMechanismBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0f).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
    public static final Block TEMPUS_CRYSTAL_BLOCK = registerBlock("tempus_crystal_block",
            new RedstoneBlock(FabricBlockSettings.of(Material.DECORATION).strength(3.0F, 6.0f).luminance(10).sounds(BlockSoundGroup.GLASS).requiresTool()), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock( String name, Block block, ItemGroup tab ) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(OnceForgotten.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(OnceForgotten.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks () {
        OnceForgotten.LOGGER.debug("Registering ModBlocks for "+ OnceForgotten.MOD_ID);
    }
}
