package net.bryce.do_marijuana;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.effect.ModEffects;
import net.bryce.do_marijuana.item.ModItemGroups;
import net.bryce.do_marijuana.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lets_do_marijuana implements ModInitializer {
	public static final Identifier TILLED_PATCH_ID = Identifier.of(Lets_do_marijuana.MOD_ID, "tilled_patch_feature_placed");

	public static final String MOD_ID = "do_marijuana";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Let's Do Marijuana!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModBlocks.registerModBlocks();

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(RegistryKeys.PLACED_FEATURE, TILLED_PATCH_ID));
	}


}