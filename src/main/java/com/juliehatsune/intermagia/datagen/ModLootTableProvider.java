package com.juliehatsune.intermagia.datagen;

import com.juliehatsune.intermagia.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.MONO_BLACK);
        addDrop(ModBlocks.MONO_BLUE);
        addDrop(ModBlocks.MONO_BROWN);
        addDrop(ModBlocks.MONO_CYAN);
        addDrop(ModBlocks.MONO_GRAY);
        addDrop(ModBlocks.MONO_GREEN);
        addDrop(ModBlocks.MONO_LIGHT_BLUE);
        addDrop(ModBlocks.MONO_LIGHT_GRAY);
        addDrop(ModBlocks.MONO_LIME);
        addDrop(ModBlocks.MONO_MAGENTA);
        addDrop(ModBlocks.MONO_ORANGE);
        addDrop(ModBlocks.MONO_PINK);
        addDrop(ModBlocks.MONO_PURPLE);
        addDrop(ModBlocks.MONO_RED);
        addDrop(ModBlocks.MONO_WHITE);
        addDrop(ModBlocks.MONO_YELLOW);
        addDrop(ModBlocks.MONO_RAINBOW);
    }





    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
