package com.juliehatsune.intermagia.item;

import com.juliehatsune.intermagia.Intermagia;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item SOUL_INFUSED_TANTALUM_INGOT = registerItem("soul_infused_tantalum_ingot", Item::new);
    public static final Item SOUL_INFUSED_TANTALUM_GEAR = registerItem("soul_infused_tantalum_gear", Item::new);
    public static final Item INFUSED_TANTALUM_INGOT = registerItem("infused_tantalum_ingot", Item::new);
    public static final Item INFUSED_TANTALUM_GEAR = registerItem("infused_tantalum_gear", Item::new);
    public static final Item TANTALUM_INGOT = registerItem("tantalum_ingot", Item::new);
    public static final Item TANTALUM_GEAR = registerItem("tantalum_gear", Item::new);
    public static final Item IRON_GEAR = registerItem("iron_gear", Item::new);

    public static final Item ELECTRONIC_PARTS = registerItem("electronic_parts", Item::new);

    public static final Item CUTTER = registerItem("cutter", Item::new);
    public static final Item HAMMER = registerItem("hammer", Item::new);

    public static final Item SOULIUM_PLASMA = registerItem("soulium_plasma", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Intermagia.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Intermagia.MOD_ID, name)))));
    }



    public static void registerModItems() {
        Intermagia.LOGGER.info("Registering Mod Items for " + Intermagia.MOD_ID);
    }
}
