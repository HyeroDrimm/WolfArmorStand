package com.hyerodrimm.wolfarmorstandmod;

import com.hyerodrimm.wolfarmorstandmod.entity.ModEntities;
import com.hyerodrimm.wolfarmorstandmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WolfArmorStandMod implements ModInitializer {
	public static final String MOD_ID = "wolfarmorstandmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialize" + MOD_ID);
		ModItems.registerModItems();
		ModEntities.registerModEntities();
	}
}