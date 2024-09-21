package com.hyerodrimm.wolfarmorstand.entity;

import com.hyerodrimm.wolfarmorstand.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstand.entity.custom.WolfArmorStandEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WolfArmorStandEntity> WOLF_ARMOR_STAND = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(WolfArmorStandMod.MOD_ID, "wolfarmorstandentity"),
            EntityType.Builder.create(WolfArmorStandEntity::new, SpawnGroup.MISC).dimensions(0.625f, 0.625f).build("wolfarmorstandentity"));

    public static void registerModEntities(){
        WolfArmorStandMod.LOGGER.info("Registering Mod Entities for" + WolfArmorStandMod.MOD_ID);

        FabricDefaultAttributeRegistry.register(WOLF_ARMOR_STAND, WolfArmorStandEntity.createLivingAttributes());
    }
}
