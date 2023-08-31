package com.hyerodrimm.horsearmorstandmod;

import com.hyerodrimm.horsearmorstandmod.entity.ClientModEntities;
import com.hyerodrimm.horsearmorstandmod.event.AttackEntityEventHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;

@Environment(EnvType.CLIENT)
public class HorseArmorStandModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HorseArmorStandMod.LOGGER.info("Initialize client for " + HorseArmorStandMod.MOD_ID);
        ClientModEntities.registerModEntities();

        AttackEntityCallback.EVENT.register(new AttackEntityEventHandler());
    }
}
