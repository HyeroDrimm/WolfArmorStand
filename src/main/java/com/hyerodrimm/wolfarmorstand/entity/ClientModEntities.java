package com.hyerodrimm.wolfarmorstand.entity;

import com.hyerodrimm.wolfarmorstand.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstand.renderer.WolfArmorStandEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ClientModEntities {
    public static void registerModEntities() {
        WolfArmorStandMod.LOGGER.info("Register client entities for " + WolfArmorStandMod.MOD_ID);

        EntityRendererRegistry.register(ModEntities.WOLF_ARMOR_STAND, WolfArmorStandEntityRenderer::new);
    }
}
