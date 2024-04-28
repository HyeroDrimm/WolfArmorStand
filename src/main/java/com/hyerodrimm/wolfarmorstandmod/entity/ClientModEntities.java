package com.hyerodrimm.wolfarmorstandmod.entity;

import com.hyerodrimm.wolfarmorstandmod.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstandmod.renderer.WolfArmorStandEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ClientModEntities {

    public static void registerModEntities() {
        WolfArmorStandMod.LOGGER.info("Register client entities for " + WolfArmorStandMod.MOD_ID);

        EntityRendererRegistry.register(ModEntities.WOLF_ARMOR_STAND, WolfArmorStandEntityRenderer::new);
    }
}
