package net.thetaciturnone.onceforgotten.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.block.ModBlocks;

import java.rmi.registry.Registry;
import java.util.List;

import static net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD;

public class ModConfiguredFeatures {

    public static void registerConfiguredFeatures() {
        OnceForgotten.LOGGER.debug("Registering the ModConfiguredFeatures for" + OnceForgotten.MOD_ID);
    }


    public static final List<OreFeatureConfig.Target> URU_ORES = List.of(
           OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.DEEPSLATE),
                    ModBlocks.BLOCK_OF_RAW_URU.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RAW_URU =
            ConfiguredFeatures.register("raw_uru", Feature.ORE,
                    new OreFeatureConfig(URU_ORES, 7));
    public static final List<OreFeatureConfig.Target> SOOTMOLD_GROWTH = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.STONE),
                    ModBlocks.SOOTMOLD.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOOTMOLD =
            ConfiguredFeatures.register("sootmold", Feature.ORE,
                    new OreFeatureConfig(SOOTMOLD_GROWTH, 45));
}
