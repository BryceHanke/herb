package net.bryce.herb;

import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.effect.ModEffects;
import net.bryce.herb.item.ModItemGroups;
import net.bryce.herb.item.ModItems;
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

public class Herb implements ModInitializer {
	public static final Identifier AFG_TILLED_PATCH_ID = Identifier.of(Herb.MOD_ID, "afg_tilled_patch_feature_placed");
	public static final Identifier HK_TILLED_PATCH_ID = Identifier.of(Herb.MOD_ID, "hk_tilled_patch_feature_placed");

	public static final String MOD_ID = "herb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Let's Do Marijuana!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModBlocks.registerModBlocks();

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE, BiomeKeys.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(RegistryKeys.PLACED_FEATURE, AFG_TILLED_PATCH_ID));
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(RegistryKeys.PLACED_FEATURE, HK_TILLED_PATCH_ID));
	}


}