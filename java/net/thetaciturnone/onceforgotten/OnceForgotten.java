package net.thetaciturnone.onceforgotten;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.thetaciturnone.onceforgotten.block.ModBlocks;
import net.thetaciturnone.onceforgotten.entity.ModEntities;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;
import net.thetaciturnone.onceforgotten.item.ModItems;
import net.thetaciturnone.onceforgotten.world.gen.ModEntitySpawn;
import net.thetaciturnone.onceforgotten.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.thetaciturnone.onceforgotten.entity.ModEntities.FALLEN_FOOTSOLDIER;

public class OnceForgotten implements ModInitializer {
	public static final String MOD_ID = "onceforgotten";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
		ModEntitySpawn.register();
		ModOreGeneration.generateOres();
		FabricDefaultAttributeRegistry.register(FALLEN_FOOTSOLDIER, FallenFootsoldierEntity.createHostileAttributes());
	}
}
