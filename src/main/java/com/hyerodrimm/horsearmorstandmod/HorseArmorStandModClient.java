package com.hyerodrimm.horsearmorstandmod;

import com.hyerodrimm.horsearmorstandmod.entity.ClientModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HorseArmorStandModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientModEntities.registerModEntities();

    }
}
