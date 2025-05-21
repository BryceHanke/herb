package net.bryce.herb.datagen;

import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.block.custom.female.GDP_Female_Cannabis_Plant;
import net.bryce.herb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
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

        addDrop(ModBlocks.UNTRIMMED_CP_POUND);
        addDrop(ModBlocks.TRIMMED_CP_POUND);
        addDrop(ModBlocks.CURED_CP_POUND);

        addDrop(ModBlocks.UNTRIMMED_GDK_POUND);
        addDrop(ModBlocks.TRIMMED_GDK_POUND);
        addDrop(ModBlocks.CURED_GDK_POUND);

        addDrop(ModBlocks.UNTRIMMED_AFG_POUND);
        addDrop(ModBlocks.TRIMMED_AFG_POUND);
        addDrop(ModBlocks.CURED_AFG_POUND);

        addDrop(ModBlocks.UNTRIMMED_HK_POUND);
        addDrop(ModBlocks.TRIMMED_HK_POUND);
        addDrop(ModBlocks.CURED_HK_POUND);

        addDrop(ModBlocks.UNTRIMMED_AK_POUND);
        addDrop(ModBlocks.TRIMMED_AK_POUND);
        addDrop(ModBlocks.CURED_AK_POUND);

        addDrop(ModBlocks.UNTRIMMED_CD_POUND);
        addDrop(ModBlocks.TRIMMED_CD_POUND);
        addDrop(ModBlocks.CURED_CD_POUND);

        addDrop(ModBlocks.UNTRIMMED_WZ_POUND);
        addDrop(ModBlocks.TRIMMED_WZ_POUND);
        addDrop(ModBlocks.CURED_WZ_POUND);

        BlockStatePropertyLootCondition.Builder og_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.OG_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.OG_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.OG_FEMALE_CANNABIS_PLANT, ModItems.OG_UNTRIMMED_NUG, ModItems.OG_CANNABIS_SEEDS, og_fem_builder));

        BlockStatePropertyLootCondition.Builder gdp_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.GDP_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, ModItems.GDP_UNTRIMMED_NUG, ModItems.GDP_CANNABIS_SEEDS, gdp_fem_builder));

        BlockStatePropertyLootCondition.Builder rp_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.RP_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.RP_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.RP_FEMALE_CANNABIS_PLANT, ModItems.RP_UNTRIMMED_NUG, ModItems.RP_CANNABIS_SEEDS, rp_fem_builder));

        BlockStatePropertyLootCondition.Builder cp_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.CP_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.CP_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.CP_FEMALE_CANNABIS_PLANT, ModItems.CP_UNTRIMMED_NUG, ModItems.CP_CANNABIS_SEEDS, cp_fem_builder));

        BlockStatePropertyLootCondition.Builder gdk_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.GDK_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.GDK_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.GDK_FEMALE_CANNABIS_PLANT, ModItems.GDK_UNTRIMMED_NUG, ModItems.GDK_CANNABIS_SEEDS, gdk_fem_builder));

        BlockStatePropertyLootCondition.Builder afg_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.AFG_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.AFG_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.AFG_FEMALE_CANNABIS_PLANT, ModItems.AFG_UNTRIMMED_NUG, ModItems.AFG_CANNABIS_SEEDS, afg_fem_builder));

        BlockStatePropertyLootCondition.Builder hk_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.HK_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.HK_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.HK_FEMALE_CANNABIS_PLANT, ModItems.HK_UNTRIMMED_NUG, ModItems.HK_CANNABIS_SEEDS, hk_fem_builder));

        BlockStatePropertyLootCondition.Builder ak_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.AK_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.AK_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.AK_FEMALE_CANNABIS_PLANT, ModItems.AK_UNTRIMMED_NUG, ModItems.AK_CANNABIS_SEEDS, ak_fem_builder));

        BlockStatePropertyLootCondition.Builder cd_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.CD_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.CD_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.CD_FEMALE_CANNABIS_PLANT, ModItems.CD_UNTRIMMED_NUG, ModItems.CD_CANNABIS_SEEDS, cd_fem_builder));

        BlockStatePropertyLootCondition.Builder wz_fem_builder = BlockStatePropertyLootCondition.builder(ModBlocks.WZ_FEMALE_CANNABIS_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(GDP_Female_Cannabis_Plant.AGE, 3));
        addDrop(ModBlocks.WZ_FEMALE_CANNABIS_PLANT, cropDrops(ModBlocks.WZ_FEMALE_CANNABIS_PLANT, ModItems.WZ_UNTRIMMED_NUG, ModItems.WZ_CANNABIS_SEEDS, wz_fem_builder));


        addDrop(ModBlocks.OG_MALE_CANNABIS_PLANT, drops(ModItems.OG_CANNABIS_SEEDS));
        addDrop(ModBlocks.GDP_MALE_CANNABIS_PLANT, drops(ModItems.GDP_CANNABIS_SEEDS));
        addDrop(ModBlocks.RP_MALE_CANNABIS_PLANT, drops(ModItems.RP_CANNABIS_SEEDS));
        addDrop(ModBlocks.CP_MALE_CANNABIS_PLANT, drops(ModItems.CP_CANNABIS_SEEDS));
        addDrop(ModBlocks.GDK_MALE_CANNABIS_PLANT, drops(ModItems.GDK_CANNABIS_SEEDS));
        addDrop(ModBlocks.AFG_MALE_CANNABIS_PLANT, drops(ModItems.AFG_CANNABIS_SEEDS));
        addDrop(ModBlocks.HK_MALE_CANNABIS_PLANT, drops(ModItems.HK_CANNABIS_SEEDS));
        addDrop(ModBlocks.AK_MALE_CANNABIS_PLANT, drops(ModItems.AK_CANNABIS_SEEDS));
        addDrop(ModBlocks.CD_MALE_CANNABIS_PLANT, drops(ModItems.CD_CANNABIS_SEEDS));
        addDrop(ModBlocks.WZ_MALE_CANNABIS_PLANT, drops(ModItems.WZ_CANNABIS_SEEDS));
    }
}