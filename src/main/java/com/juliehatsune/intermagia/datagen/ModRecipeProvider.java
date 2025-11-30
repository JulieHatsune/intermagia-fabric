package com.juliehatsune.intermagia.datagen;

import com.juliehatsune.intermagia.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, ModItems.SOUL_INFUSED_TANTALUM_GEAR)
                        .pattern(" R ")
                        .pattern("R R")
                        .pattern(" R ")
                        .input('R', ModItems.SOUL_INFUSED_TANTALUM_INGOT)
                        .criterion(hasItem(ModItems.SOUL_INFUSED_TANTALUM_INGOT), conditionsFromItem(ModItems.SOUL_INFUSED_TANTALUM_INGOT))
                        .offerTo(exporter);

                //createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                //        .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                //        .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                //        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Intermagia Recipes";
    }
}
