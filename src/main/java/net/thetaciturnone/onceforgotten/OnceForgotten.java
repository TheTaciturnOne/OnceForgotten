package net.thetaciturnone.onceforgotten;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thetaciturnone.onceforgotten.block.OFBlocks;
import net.thetaciturnone.onceforgotten.entity.OFEntities;
import net.thetaciturnone.onceforgotten.entity.entities.FactorusGuardianEntity;
import net.thetaciturnone.onceforgotten.entity.entities.GuardianDroneEntity;
import net.thetaciturnone.onceforgotten.item.OFItems;
import net.thetaciturnone.onceforgotten.util.OFLootTableModifiers;
import net.thetaciturnone.onceforgotten.world.gen.OFOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class OnceForgotten implements ModInitializer {
	public static final String MOD_ID = "onceforgotten";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier CLOCKWORK_ID = new Identifier("onceforgotten:clockwork_ticks");
	public static SoundEvent CLOCKWORK_SOUND_EVENT = new SoundEvent(CLOCKWORK_ID);
	public static final Identifier FG_DEATH_ID = new Identifier("onceforgotten:factorus_guardian_death");
	public static SoundEvent FG_DEATH_SOUND_EVENT = new SoundEvent(FG_DEATH_ID);
	public static final Identifier FG_HURT_ID = new Identifier("onceforgotten:factorus_guardian_hurt");
	public static SoundEvent FG_HURT_SOUND_EVENT = new SoundEvent(FG_HURT_ID);
	public static final Identifier GD_DEATH_ID = new Identifier("onceforgotten:guardian_drone_death");
	public static SoundEvent GD_DEATH_SOUND_EVENT = new SoundEvent(GD_DEATH_ID);
	public static final Identifier GD_HURT_ID = new Identifier("onceforgotten:guardian_drone_hurt");
	public static SoundEvent GD_HURT_SOUND_EVENT = new SoundEvent(GD_HURT_ID);
	public static final Identifier GD_IDLE_ID = new Identifier("onceforgotten:guardian_drone_idle");
	public static SoundEvent GD_IDLE_SOUND_EVENT = new SoundEvent(GD_IDLE_ID);


	@Override
	public void onInitialize() {
		OFItems.registerModItems();
		OFBlocks.registerModBlocks();
		OFOreGeneration.generateOres();
		OFLootTableModifiers.modifyLootTables();
		GeckoLib.initialize();
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.CLOCKWORK_ID, CLOCKWORK_SOUND_EVENT);
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.GD_IDLE_ID, GD_IDLE_SOUND_EVENT);
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.FG_DEATH_ID, FG_DEATH_SOUND_EVENT);
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.FG_HURT_ID, FG_HURT_SOUND_EVENT);
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.GD_DEATH_ID, GD_DEATH_SOUND_EVENT);
		Registry.register(Registry.SOUND_EVENT, OnceForgotten.GD_HURT_ID, GD_HURT_SOUND_EVENT);
		FabricDefaultAttributeRegistry.register(OFEntities.FACTORUS_GUARDIAN, FactorusGuardianEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(OFEntities.GUARDIAN_DRONE, GuardianDroneEntity.setAttributes());
	}


}
