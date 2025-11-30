package com.juliehatsune.intermagia.datagen;

import com.juliehatsune.intermagia.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MONO_BLACK)
                .add(ModBlocks.MONO_BLUE)
                .add(ModBlocks.MONO_BROWN)
                .add(ModBlocks.MONO_CYAN)
                .add(ModBlocks.MONO_GRAY)
                .add(ModBlocks.MONO_GREEN)
                .add(ModBlocks.MONO_LIGHT_BLUE)
                .add(ModBlocks.MONO_LIGHT_GRAY)
                .add(ModBlocks.MONO_LIME)
                .add(ModBlocks.MONO_MAGENTA)
                .add(ModBlocks.MONO_ORANGE)
                .add(ModBlocks.MONO_PINK)
                .add(ModBlocks.MONO_PURPLE)
                .add(ModBlocks.MONO_RED)
                .add(ModBlocks.MONO_WHITE)
                .add(ModBlocks.MONO_YELLOW)
                .add(ModBlocks.MONO_RAINBOW);


        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
        ;




    }
}