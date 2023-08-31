package com.hyerodrimm.horsearmorstandmod.entity;

import com.hyerodrimm.horsearmorstandmod.HorseArmorStandMod;
import com.hyerodrimm.horsearmorstandmod.renderer.HorseArmorStandEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ClientModEntities {

    public static void registerModEntities() {
        HorseArmorStandMod.LOGGER.info("Register client entities for " + HorseArmorStandMod.MOD_ID);

        EntityRendererRegistry.register(ModEntities.HORSE_ARMOR_STAND, HorseArmorStandEntityRenderer::new);
    }
}
