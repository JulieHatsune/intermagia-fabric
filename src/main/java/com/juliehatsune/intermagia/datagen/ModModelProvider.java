package com.juliehatsune.intermagia.datagen;

import com.juliehatsune.intermagia.block.ModBlocks;
import com.juliehatsune.intermagia.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_BLACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_BROWN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_CYAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_GREEN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_LIGHT_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_LIGHT_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_LIME);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_MAGENTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_ORANGE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_PINK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_PURPLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_RED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_YELLOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONO_RAINBOW);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MURANIUM_FUEL_ROD, Models.GENERATED);

    }

}
