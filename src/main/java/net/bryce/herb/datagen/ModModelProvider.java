package net.bryce.herb.datagen;

import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.strains.Strains;
import net.bryce.herb.block.custom.cannabis_crops.female._Female_Cannabis_Plant;
import net.bryce.herb.block.custom.cannabis_crops.male._Male_Cannabis_Plant;
import net.bryce.herb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for (Identifier id : Strains.strains)
        {
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","untrimmed_"+String.valueOf(id.getPath()) + "_pound")));
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","trimmed_"+String.valueOf(id.getPath()) + "_pound")));
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","cured_"+String.valueOf(id.getPath()) + "_pound")));

            blockStateModelGenerator.registerTintableCrossBlockStateWithStages(Registries.BLOCK.get(new Identifier("herb",String.valueOf(id.getPath()) + "_female_cannabis_plant")), BlockStateModelGenerator.TintType.NOT_TINTED, _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
            blockStateModelGenerator.registerTintableCrossBlockStateWithStages(Registries.BLOCK.get(new Identifier("herb",String.valueOf(id.getPath()) + "_male_cannabis_plant")), BlockStateModelGenerator.TintType.NOT_TINTED, _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        }

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRAIGHT_BONG_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Identifier id : Strains.strains)
        {
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_untrimmed_nug")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_trimmed_nug")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_cured_nug")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_bud")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_ground_weed")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_filtered_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_filtered_lit_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_extinguished_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_lit_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_extinguished_filtered_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_roach")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_trimmed")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_cured")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_packed_pipe")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_packed_bowl")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_packed_straight_bong")), Models.GENERATED);
        }

        itemModelGenerator.register(ModItems.JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHTRAY, Models.GENERATED);

        itemModelGenerator.register(ModItems.TRIMMING_SCISSORS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_TRIMMING_SCISSORS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROLLING_PAPER, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLASS_PIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_GLASS_PIPE, Models.GENERATED);

        itemModelGenerator.register(ModItems.FILTER, Models.GENERATED);

        itemModelGenerator.register(ModItems.LIGHTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIT_LIGHTER, Models.GENERATED);

        itemModelGenerator.register(ModItems.STRAIGHT_BONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_PACKED_STRAIGHT_BONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_STRAIGHT_BONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_BOWL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_BOWL, Models.GENERATED);
    }
}
