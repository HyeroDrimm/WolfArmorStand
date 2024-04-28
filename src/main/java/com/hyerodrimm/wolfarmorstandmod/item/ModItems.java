package com.hyerodrimm.wolfarmorstandmod.item;

import com.hyerodrimm.wolfarmorstandmod.WolfArmorStandMod;
import com.hyerodrimm.wolfarmorstandmod.item.custom.WolfArmorStandItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WOLF_ARMOR_STAND_ITEM = registerItem("wolfarmorstanditem", new WolfArmorStandItem(new Item.Settings()));

    private static void addItemsToFunctionalTabItemGroup(FabricItemGroupEntries entries){
        entries.add(WOLF_ARMOR_STAND_ITEM);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WolfArmorStandMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        WolfArmorStandMod.LOGGER.info("Registering Mod Items for" + WolfArmorStandMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalTabItemGroup);
    }
}
