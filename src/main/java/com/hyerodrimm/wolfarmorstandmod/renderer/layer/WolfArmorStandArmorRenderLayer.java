package com.hyerodrimm.wolfarmorstandmod.renderer.layer;

import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.math.ColorHelper;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class WolfArmorStandArmorRenderLayer extends GeoRenderLayer<WolfArmorStandEntity> {
    public WolfArmorStandArmorRenderLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack poseStack, WolfArmorStandEntity animatable, BakedGeoModel bakedModel, RenderLayer renderType, VertexConsumerProvider bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        ItemStack itemStack = animatable.getArmorType();

        if (!itemStack.isEmpty() && itemStack.getItem() instanceof AnimalArmorItem horseArmorItem) {
            if (horseArmorItem.getType() == AnimalArmorItem.Type.CANINE) {
                RenderLayer armorRenderLayer = RenderLayer.getArmorCutoutNoCull(horseArmorItem.getEntityTexture());
                getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, armorRenderLayer, bufferSource.getBuffer(armorRenderLayer), partialTick, packedLight, OverlayTexture.DEFAULT_UV, 1, 1,1, 1);
            }
        }
    }
}
