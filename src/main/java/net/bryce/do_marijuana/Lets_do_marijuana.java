package net.bryce.do_marijuana;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.item.ModItemGroups;
import net.bryce.do_marijuana.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lets_do_marijuana implements ModInitializer {
	public static final String MOD_ID = "do_marijuana";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("let's do marijuana!");

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}