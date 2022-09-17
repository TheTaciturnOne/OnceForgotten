package net.thetaciturnone.onceforgotten.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.block.AbstractBlock.ContextPredicate;
import net.minecraft.block.AbstractBlock.OffsetType;
import net.minecraft.block.AbstractBlock.Settings;
import net.thetaciturnone.onceforgotten.item.custom.ModStairsBlock;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.*;

public class ModBlocks {
    public static final Block HARDENED_METAL_SUPPORT = registerBlock("hardened_metal_support",
            new Block(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);

    public static final Block HARDENED_METAL_PLATE = registerBlock("hardened_metal_plate",
            new Block(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);

    public static final Block LUMINOUS_METAL_PLATE = registerBlock("luminous_metal_plate",
            new Block(FabricBlockSettings.of(Material.METAL).strength(-1.0F).hardness(3600000F).luminance(15).sounds(BlockSoundGroup.NETHERITE).resistance(3600000F)), ItemGroup.BUILDING_BLOCKS);

    public static final Block BLOCK_OF_RAW_URU = registerBlock("block_of_raw_uru",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2F).hardness(30.0F).sounds(BlockSoundGroup.ANCIENT_DEBRIS).resistance(3600000F).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLOCK_OF_URU = registerBlock("block_of_uru",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2F).hardness(30.0F).sounds(BlockSoundGroup.METAL).resistance(3600000F).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    public static final Block SOOTMOLD = registerBlock("sootmold",
            new OreBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.1F).sounds(BlockSoundGroup.SOUL_SAND)), ItemGroup.MISC);

    public static final Block SOOTSTONE_BRICKS = registerBlock("sootstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_WALL = registerBlock("sootstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_STAIRS = registerBlock("sootstone_brick_stairs",
            new ModStairsBlock(ModBlocks.SOOTSTONE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SOOTSTONE_BRICK_SLAB = registerBlock("sootstone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_SOOTSTONE_BRICKS = registerBlock("chiseled_sootstone_bricks",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.5F, 6.0F).sounds(BlockSoundGroup.CALCITE)), ItemGroup.BUILDING_BLOCKS);

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
