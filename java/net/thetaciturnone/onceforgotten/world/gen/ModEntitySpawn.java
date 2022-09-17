package net.thetaciturnone.onceforgotten.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.Heightmap;
import net.thetaciturnone.onceforgotten.entity.ModEntities;

public class ModEntitySpawn {
    public static void register() {
        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), SpawnGroup.MONSTER, ModEntities.FALLEN_FOOTSOLDIER, 25, 1, 2);
    }
}
