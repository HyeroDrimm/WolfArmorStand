package com.hyerodrimm.wolfarmorstandmod.renderer;

import com.hyerodrimm.wolfarmorstandmod.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import com.hyerodrimm.wolfarmorstandmod.model.WolfArmorStandEntityModel;
import com.hyerodrimm.wolfarmorstandmod.renderer.layer.WolfArmorStandArmorRenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WolfArmorStandEntityRenderer extends GeoEntityRenderer<WolfArmorStandEntity> {

    public WolfArmorStandEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WolfArmorStandEntityModel());
        this.addRenderLayer(new WolfArmorStandArmorRenderLayer(this));
    }

    @Override
    public Identifier getTextureLocation(WolfArmorStandEntity animatable) {
        return new Identifier(WolfArmorStandMod.MOD_ID, "textures/entity/wolfarmorstandentity.png");
    }

    @Override
    public void render(WolfArmorStandEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f,0.4f,0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
