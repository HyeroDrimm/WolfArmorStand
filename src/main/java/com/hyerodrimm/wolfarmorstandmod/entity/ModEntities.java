package com.hyerodrimm.wolfarmorstandmod.entity;

import com.hyerodrimm.wolfarmorstandmod.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WolfArmorStandEntity> WOLF_ARMOR_STAND = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(WolfArmorStandMod.MOD_ID, "wolfarmorstandentity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, WolfArmorStandEntity::new).dimensions(EntityDimensions.fixed(0.6875f, 0.6875f)).build());

    public static void registerModEntities(){
        WolfArmorStandMod.LOGGER.info("Registering Mod Entities for" + WolfArmorStandMod.MOD_ID);

        FabricDefaultAttributeRegistry.register(WOLF_ARMOR_STAND, WolfArmorStandEntity.createLivingAttributes());
    }
}
