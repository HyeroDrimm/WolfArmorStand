package com.hyerodrimm.horsearmorstandmod.renderer;

import com.hyerodrimm.horsearmorstandmod.HorseArmorStandMod;
import com.hyerodrimm.horsearmorstandmod.entity.ClientModEntities;
import com.hyerodrimm.horsearmorstandmod.entity.custom.HorseArmorStandEntity;
import com.hyerodrimm.horsearmorstandmod.model.HorseArmorStandEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;

public class HorseArmorStandEntityRenderer extends LivingEntityRenderer<HorseArmorStandEntity, HorseArmorStandEntityModel> {
    public HorseArmorStandEntityRenderer(EntityRendererFactory.Context context){
        super(context, new HorseArmorStandEntityModel(context.getPart(ClientModEntities.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(HorseArmorStandEntity entity) {
        return new Identifier(HorseArmorStandMod.MOD_ID, "textures/entity/cube/cube.png");
    }
}
