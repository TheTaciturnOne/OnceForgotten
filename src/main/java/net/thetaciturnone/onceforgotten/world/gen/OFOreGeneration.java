package net.thetaciturnone.onceforgotten.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.thetaciturnone.onceforgotten.world.feature.OFPlacedFeatures;

public class OFOreGeneration {
    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, OFPlacedFeatures.SOOTMOLD_GROWTH_PLACED.getKey().get());
    }
}
