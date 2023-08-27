package com.hyerodrimm.horsearmorstandmod.entity;

import com.hyerodrimm.horsearmorstandmod.HorseArmorStandMod;
import com.hyerodrimm.horsearmorstandmod.model.HorseArmorStandEntityModel;
import com.hyerodrimm.horsearmorstandmod.renderer.HorseArmorStandEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ClientModEntities {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier(HorseArmorStandMod.MOD_ID, "horsearmorstandentity"), "main");

    public static void registerModEntities() {
        EntityRendererRegistry.register(ModEntities.HORSE_ARMOR_STAND, HorseArmorStandEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, HorseArmorStandEntityModel::getTexturedModelData);
    }
}
