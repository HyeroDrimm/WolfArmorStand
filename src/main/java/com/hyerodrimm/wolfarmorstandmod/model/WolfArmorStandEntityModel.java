package com.hyerodrimm.wolfarmorstandmod.model;


import com.hyerodrimm.wolfarmorstandmod.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WolfArmorStandEntityModel extends GeoModel<WolfArmorStandEntity> {

    @Override
    public Identifier getModelResource(WolfArmorStandEntity animatable) {
        return new Identifier(WolfArmorStandMod.MOD_ID, "geo/wolfarmorstand.geo.json");
    }

    @Override
    public Identifier getTextureResource(WolfArmorStandEntity animatable) {
        return new Identifier(WolfArmorStandMod.MOD_ID, "textures/entity/wolfarmorstandentity.png");
    }

    @Override
    public Identifier getAnimationResource(WolfArmorStandEntity animatable) {
        return new Identifier(WolfArmorStandMod.MOD_ID, "animations/wolfarmorstand.animation.json");
    }
}
