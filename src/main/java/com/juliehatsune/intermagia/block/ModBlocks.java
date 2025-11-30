package com.juliehatsune.intermagia.block;

import com.juliehatsune.intermagia.Intermagia;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box",
            properties -> new Block(properties.strength(0f)
                    .sounds(BlockSoundGroup.AZALEA)));




    //-------------------------MONO COLOR TM
    public static final Block MONO_BLACK = registerBlock("mono_black",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_BLUE = registerBlock("mono_blue",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_BROWN = registerBlock("mono_brown",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_CYAN = registerBlock("mono_cyan",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_GRAY = registerBlock("mono_gray",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_GREEN = registerBlock("mono_green",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_LIGHT_BLUE = registerBlock("mono_light_blue",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_LIGHT_GRAY = registerBlock("mono_light_gray",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_LIME = registerBlock("mono_lime",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_MAGENTA = registerBlock("mono_magenta",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_ORANGE = registerBlock("mono_orange",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_PINK = registerBlock("mono_pink",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_PURPLE = registerBlock("mono_purple",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_RED = registerBlock("mono_red",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_WHITE = registerBlock("mono_white",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_YELLOW = registerBlock("mono_yellow",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block MONO_RAINBOW = registerBlock("mono_rainbow",
            properties -> new Block(properties
                    .strength(0.2f)
                    .nonOpaque()
                    .requiresTool()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GLASS)));




    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Intermagia.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Intermagia.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Intermagia.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Intermagia.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Intermagia.LOGGER.info("Registering Mod Blocks for " + Intermagia.MOD_ID);
    }
}
