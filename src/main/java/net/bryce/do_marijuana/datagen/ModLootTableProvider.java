package net.bryce.do_marijuana.datagen;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.block.custom.GDP_Female_Cannabis_Plant;
import net.bryce.do_marijuana.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProviderType;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.UNTRIMMED_OG_POUND);
        addDrop(ModBlocks.TRIMMED_OG_POUND);
        addDrop(ModBlocks.CURED_OG_POUND);

        addDrop(ModBlocks.UNTRIMMED_GDP_POUND);
        addDrop(ModBlocks.TRIMMED_GDP_POUND);
        addDrop(ModBlocks.CURED_GDP_POUND);

        addDrop(ModBlocks.UNTRIMMED_RP_POUND);
        addDrop(ModBlocks.TRIMMED_RP_POUND);
        addDrop(ModBlocks.CURED_RP_POUND);

        BlockStatePropertyLootCondition.Builder og_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.OG_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.OG_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.OG_FEMALE_CANNABIS_PLANT, ModItems.OG_UNTRIMMED_NUG, ModItems.OG_CANNABIS_SEEDS, og_fem_builder));

        BlockStatePropertyLootCondition.Builder gdp_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.GDP_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, ModItems.GDP_UNTRIMMED_NUG, ModItems.GDP_CANNABIS_SEEDS, gdp_fem_builder));

        BlockStatePropertyLootCondition.Builder rp_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.RP_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.RP_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.RP_FEMALE_CANNABIS_PLANT, ModItems.RP_UNTRIMMED_NUG, ModItems.RP_CANNABIS_SEEDS, rp_fem_builder));

        addDrop(ModBlocks.OG_MALE_CANNABIS_PLANT, drops(ModItems.OG_CANNABIS_SEEDS));
        addDrop(ModBlocks.GDP_MALE_CANNABIS_PLANT, drops(ModItems.GDP_CANNABIS_SEEDS));
        addDrop(ModBlocks.RP_MALE_CANNABIS_PLANT, drops(ModItems.RP_CANNABIS_SEEDS));
    }
}