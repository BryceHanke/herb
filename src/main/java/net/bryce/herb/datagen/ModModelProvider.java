package net.bryce.herb.datagen;

import net.bryce.herb.strains.Strains;
import net.bryce.herb.block.custom.female._Female_Cannabis_Plant;
import net.bryce.herb.block.custom.male._Male_Cannabis_Plant;
import net.bryce.herb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
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
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","untrimmed_"+String.valueOf(id.getPath())+"_pound")));
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","trimmed_"+String.valueOf(id.getPath()) + "_pound")));
            blockStateModelGenerator.registerSimpleCubeAll(Registries.BLOCK.get(new Identifier("herb","cured_"+String.valueOf(id.getPath()) + "_pound")));

            blockStateModelGenerator.registerCrop(Registries.BLOCK.get(new Identifier("herb",String.valueOf(id.getPath()) + "_female_cannabis_plant")), _Female_Cannabis_Plant.AGE, 0, 1, 2, 3, 4, 5, 6);
            blockStateModelGenerator.registerCrop(Registries.BLOCK.get(new Identifier("herb",String.valueOf(id.getPath()) + "_male_cannabis_plant")), _Male_Cannabis_Plant.AGE, 0, 1, 2, 3);
        }
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
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_lit_joint")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_roach")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_trimmed")), Models.GENERATED);
            itemModelGenerator.register(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_cured")), Models.GENERATED);
        }

        itemModelGenerator.register(ModItems.JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHTRAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIMMING_SCISSORS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_TRIMMING_SCISSORS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRTY_GRINDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROLLING_PAPER, Models.GENERATED);
    }
}
