package net.bryce.do_marijuana.datagen;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.block.custom.*;
import net.bryce.do_marijuana.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNTRIMMED_OG_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIMMED_OG_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURED_OG_POUND);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNTRIMMED_GDP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIMMED_GDP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURED_GDP_POUND);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNTRIMMED_RP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIMMED_RP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURED_RP_POUND);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNTRIMMED_CP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIMMED_CP_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURED_CP_POUND);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UNTRIMMED_GDK_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIMMED_GDK_POUND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURED_GDK_POUND);

        blockStateModelGenerator.registerCrop(ModBlocks.OG_FEMALE_CANNABIS_PLANT, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.RP_FEMALE_CANNABIS_PLANT, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.CP_FEMALE_CANNABIS_PLANT, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.GDK_FEMALE_CANNABIS_PLANT, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);

        blockStateModelGenerator.registerCrop(ModBlocks.OG_MALE_CANNABIS_PLANT, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.GDP_MALE_CANNABIS_PLANT, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RP_MALE_CANNABIS_PLANT, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CP_MALE_CANNABIS_PLANT, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.GDK_MALE_CANNABIS_PLANT, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.OG_UNTRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_TRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_CURED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_GROUND_WEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.OG_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_LIT_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_ROACH, Models.GENERATED);

        itemModelGenerator.register(ModItems.OG_JAR_OF_TRIMMED, Models.GENERATED);
        itemModelGenerator.register(ModItems.OG_JAR_OF_CURED, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDP_UNTRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_TRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_CURED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_GROUND_WEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDP_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_LIT_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_ROACH, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDP_JAR_OF_TRIMMED, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDP_JAR_OF_CURED, Models.GENERATED);

        itemModelGenerator.register(ModItems.RP_UNTRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_TRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_CURED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_GROUND_WEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.RP_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_LIT_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_ROACH, Models.GENERATED);

        itemModelGenerator.register(ModItems.RP_JAR_OF_TRIMMED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RP_JAR_OF_CURED, Models.GENERATED);

        itemModelGenerator.register(ModItems.CP_UNTRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_TRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_CURED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_GROUND_WEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.CP_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_LIT_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_ROACH, Models.GENERATED);

        itemModelGenerator.register(ModItems.CP_JAR_OF_TRIMMED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CP_JAR_OF_CURED, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDK_UNTRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_TRIMMED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_CURED_NUG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_GROUND_WEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDK_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_LIT_JOINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_ROACH, Models.GENERATED);

        itemModelGenerator.register(ModItems.GDK_JAR_OF_TRIMMED, Models.GENERATED);
        itemModelGenerator.register(ModItems.GDK_JAR_OF_CURED, Models.GENERATED);


        itemModelGenerator.register(ModItems.JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHTRAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIMMING_SCISSORS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_TRIMMING_SCISSORS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROLLING_PAPER, Models.GENERATED);
    }
}
