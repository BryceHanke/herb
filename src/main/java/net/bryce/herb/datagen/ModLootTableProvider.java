package net.bryce.herb.datagen;

import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.block.custom.cannabis_crops.female._Female_Cannabis_Plant;
import net.bryce.herb.strains.Strains;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Identifier strain : Strains.strains)
        {
            addDrop(Registries.BLOCK.get(new Identifier("herb", "untrimmed_"+String.valueOf(strain.getPath())+"_pound")));
            addDrop(Registries.BLOCK.get(new Identifier("herb", "trimmed_"+String.valueOf(strain.getPath())+"_pound")));
            addDrop(Registries.BLOCK.get(new Identifier("herb", "cured_"+String.valueOf(strain.getPath())+"_pound")));

            BlockStatePropertyLootCondition.Builder fem_builder = BlockStatePropertyLootCondition.builder(Registries.BLOCK.get(new Identifier("herb", String.valueOf(strain.getPath())+"_female_cannabis_plant"))).properties(StatePredicate.Builder.create()
                    .exactMatch(_Female_Cannabis_Plant.AGE, 3));
            addDrop(Registries.BLOCK.get(new Identifier("herb", String.valueOf(strain.getPath())+"_female_cannabis_plant")),
                    cropDrops(Registries.BLOCK.get(new Identifier("herb", String.valueOf(strain.getPath())+"_female_cannabis_plant")),
                            Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_untrimmed_nug")),
                            Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_cannabis_seeds")), fem_builder));
        }

        addDrop(ModBlocks.STRAIGHT_BONG_BLOCK);
    }
}