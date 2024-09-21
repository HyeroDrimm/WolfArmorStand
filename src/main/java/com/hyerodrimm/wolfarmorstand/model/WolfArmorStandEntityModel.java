package com.hyerodrimm.wolfarmorstand.model;


import com.hyerodrimm.wolfarmorstand.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstand.entity.custom.WolfArmorStandEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WolfArmorStandEntityModel extends GeoModel<WolfArmorStandEntity> {

    @Override
    public Identifier getModelResource(WolfArmorStandEntity animatable) {
        return Identifier.of(WolfArmorStandMod.MOD_ID, "geo/wolfarmorstand.geo.json");
    }

    @Override
    public Identifier getTextureResource(WolfArmorStandEntity animatable) {
        return Identifier.of(WolfArmorStandMod.MOD_ID, "textures/entity/wolfarmorstandentity.png");
    }

    @Override
    public Identifier getAnimationResource(WolfArmorStandEntity animatable) {
        return Identifier.of(WolfArmorStandMod.MOD_ID, "animations/wolfarmorstand.animation.json");
    }
}
