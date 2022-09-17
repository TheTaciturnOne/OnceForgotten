package net.thetaciturnone.onceforgotten.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.thetaciturnone.onceforgotten.entity.ModEntities;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;

public class ModRegistries {
    public static void registerModStuffs() {
            registerFuels();
            registerCommands();
            registerEvents();
            registerStrippables();
            registerFlammableBlock();
            registerCustomTrades();
            registerAttributes();
    }

    private static void registerFuels() {
    }

    private static void registerCommands() {
    }

    private static void registerEvents() {
    }

    private static void registerStrippables() {
    }

    private static void registerFlammableBlock() {
    }

    private static void registerCustomTrades() {
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.FALLEN_FOOTSOLDIER, FallenFootsoldierEntity.setAttributes());
    }
}
