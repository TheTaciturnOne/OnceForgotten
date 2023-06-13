package net.thetaciturnone.onceforgotten.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.thetaciturnone.onceforgotten.OnceForgotten;
import net.thetaciturnone.onceforgotten.block.OFBlocks;

import java.util.List;

public class OFConfiguredFeatures {

    public static void registerConfiguredFeatures() {
        OnceForgotten.LOGGER.debug("Registering the ModConfiguredFeatures for" + OnceForgotten.MOD_ID);
    }

    public static final List<OreFeatureConfig.Target> SOOTMOLD_GROWTH = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.STONE),
                    OFBlocks.SOOTMOLD.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOOTMOLD =
            ConfiguredFeatures.register("sootmold", Feature.ORE,
                    new OreFeatureConfig(SOOTMOLD_GROWTH, 45));
}
