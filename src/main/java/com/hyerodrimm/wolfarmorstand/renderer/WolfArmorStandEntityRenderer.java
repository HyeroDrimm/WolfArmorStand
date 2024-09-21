package com.hyerodrimm.wolfarmorstand.renderer;

import com.hyerodrimm.wolfarmorstand.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstand.entity.custom.WolfArmorStandEntity;
import com.hyerodrimm.wolfarmorstand.model.WolfArmorStandEntityModel;
import com.hyerodrimm.wolfarmorstand.renderer.layer.WolfArmorStandArmorRenderLayer;
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
        return Identifier.of(WolfArmorStandMod.MOD_ID, "textures/entity/wolfarmorstandentity.png");
    }

    @Override
    public void render(WolfArmorStandEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f,0.4f,0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    public boolean hasLabel(WolfArmorStandEntity animatable) {
        return !(!animatable.shouldRenderName() && (!animatable.hasCustomName() || animatable != this.dispatcher.targetedEntity));
    }
}
