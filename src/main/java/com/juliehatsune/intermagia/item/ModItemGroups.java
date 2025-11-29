package com.juliehatsune.intermagia.item;

import com.juliehatsune.intermagia.Intermagia;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ModItemGroups {
    public static final ItemGroup INTERMAGIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Intermagia.MOD_ID, "intermagia_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SOUL_INFUSED_TANTALUM_INGOT))
                    .displayName(Text.translatable("itemgroup.intermagia.intermagia_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SOUL_INFUSED_TANTALUM_INGOT);
                        entries.add(ModItems.SOUL_INFUSED_TANTALUM_GEAR);
                        entries.add(ModItems.INFUSED_TANTALUM_INGOT);
                        entries.add(ModItems.INFUSED_TANTALUM_GEAR);
                        entries.add(ModItems.TANTALUM_INGOT);
                        entries.add(ModItems.TANTALUM_GEAR);
                    }).build());



    public static void registerItemGroups() {
        Intermagia.LOGGER.info("Registering Item Groups for" +Intermagia.MOD_ID);
    }
}
