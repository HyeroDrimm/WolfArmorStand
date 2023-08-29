package com.hyerodrimm.horsearmorstandmod.renderer.layer;

import com.hyerodrimm.horsearmorstandmod.HorseArmorStandMod;
import com.hyerodrimm.horsearmorstandmod.entity.custom.HorseArmorStandEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.DyeableHorseArmorItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class HorseArmorStandArmorRenderLayer extends GeoRenderLayer<HorseArmorStandEntity> {
    public HorseArmorStandArmorRenderLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack poseStack, HorseArmorStandEntity animatable, BakedGeoModel bakedModel, RenderLayer renderType, VertexConsumerProvider bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        ItemStack itemStack = animatable.getArmorType();

        if (!itemStack.isEmpty() && itemStack.getItem() instanceof HorseArmorItem horseArmorItem) {
            float r;
            float b;
            float g;
            if (horseArmorItem instanceof DyeableHorseArmorItem) {
                int m = ((DyeableHorseArmorItem) horseArmorItem).getColor(itemStack);
                r = (float) (m >> 16 & 0xFF) / 255.0f;
                g = (float) (m >> 8 & 0xFF) / 255.0f;
                b = (float) (m & 0xFF) / 255.0f;
            } else {
                r = 1.0f;
                g = 1.0f;
                b = 1.0f;
            }

            RenderLayer armorRenderLayer = RenderLayer.getArmorCutoutNoCull(horseArmorItem.getEntityTexture());
            getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, armorRenderLayer, bufferSource.getBuffer(armorRenderLayer), partialTick, packedLight, OverlayTexture.DEFAULT_UV, r, g, b, 1);
        }
    }
}
