package com.juliehatsune.intermagia;

import com.juliehatsune.intermagia.block.ModBlocks;
import com.juliehatsune.intermagia.item.ModItemGroups;
import com.juliehatsune.intermagia.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Intermagia implements ModInitializer {
	public static final String MOD_ID = "intermagia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
    }
}