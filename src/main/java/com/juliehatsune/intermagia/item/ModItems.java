package com.juliehatsune.intermagia.item;

import com.juliehatsune.intermagia.Intermagia;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SOUL_INFUSED_TANTALUM_INGOT = registerItem("soul_infused_tantalum_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Intermagia.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Intermagia.LOGGER.info("Registering Mod Items for " + Intermagia.MOD_ID);


    }
}
