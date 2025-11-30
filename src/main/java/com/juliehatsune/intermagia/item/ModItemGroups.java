package com.juliehatsune.intermagia.item;

import com.juliehatsune.intermagia.Intermagia;
import com.juliehatsune.intermagia.block.ModBlocks;
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
                        entries.add(ModItems.IRON_GEAR);
                        entries.add(ModItems.CUTTER);
                        entries.add(ModItems.HAMMER);
                        entries.add(ModItems.ELECTRONIC_PARTS);
                        entries.add(ModItems.MURANIUM_FUEL_ROD);
                        entries.add(ModItems.SOULIUM_PLASMA);
                        entries.add(ModBlocks.CARDBOARD_BOX);

                        entries.add(ModBlocks.MONO_BLACK);
                        entries.add(ModBlocks.MONO_BLUE);
                        entries.add(ModBlocks.MONO_BROWN);
                        entries.add(ModBlocks.MONO_CYAN);
                        entries.add(ModBlocks.MONO_GRAY);
                        entries.add(ModBlocks.MONO_GREEN);
                        entries.add(ModBlocks.MONO_LIGHT_BLUE);
                        entries.add(ModBlocks.MONO_LIGHT_GRAY);
                        entries.add(ModBlocks.MONO_LIME);
                        entries.add(ModBlocks.MONO_MAGENTA);
                        entries.add(ModBlocks.MONO_ORANGE);
                        entries.add(ModBlocks.MONO_PINK);
                        entries.add(ModBlocks.MONO_PURPLE);
                        entries.add(ModBlocks.MONO_RED);
                        entries.add(ModBlocks.MONO_WHITE);
                        entries.add(ModBlocks.MONO_YELLOW);
                        entries.add(ModBlocks.MONO_RAINBOW);

                    }).build());



    public static void registerItemGroups() {
        Intermagia.LOGGER.info("Registering Item Groups for" +Intermagia.MOD_ID);
    }
}
