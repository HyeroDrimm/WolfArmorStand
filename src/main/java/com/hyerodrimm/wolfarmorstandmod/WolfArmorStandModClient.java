package com.hyerodrimm.wolfarmorstandmod;

import com.hyerodrimm.wolfarmorstandmod.entity.ClientModEntities;
import com.hyerodrimm.wolfarmorstandmod.event.AttackEntityEventHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;

@Environment(EnvType.CLIENT)
public class WolfArmorStandModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        WolfArmorStandMod.LOGGER.info("Initialize client for " + WolfArmorStandMod.MOD_ID);
        ClientModEntities.registerModEntities();

        AttackEntityCallback.EVENT.register(new AttackEntityEventHandler());
    }
}
