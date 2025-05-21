package net.bryce.herb.block;

import net.bryce.herb.Herb;
import net.bryce.herb.block.custom.female.*;
import net.bryce.herb.block.custom.male.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block UNTRIMMED_OG_POUND = registerBlock("untrimmed_og_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_OG_POUND = registerBlock("trimmed_og_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_OG_POUND = registerBlock("cured_og_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_GDP_POUND = registerBlock("untrimmed_gdp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_GDP_POUND = registerBlock("trimmed_gdp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_GDP_POUND = registerBlock("cured_gdp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_RP_POUND = registerBlock("untrimmed_rp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_RP_POUND = registerBlock("trimmed_rp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_RP_POUND = registerBlock("cured_rp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_CP_POUND = registerBlock("untrimmed_cp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_CP_POUND = registerBlock("trimmed_cp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_CP_POUND = registerBlock("cured_cp_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_GDK_POUND = registerBlock("untrimmed_gdk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_GDK_POUND = registerBlock("trimmed_gdk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_GDK_POUND = registerBlock("cured_gdk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_AFG_POUND = registerBlock("untrimmed_afg_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_AFG_POUND = registerBlock("trimmed_afg_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_AFG_POUND = registerBlock("cured_afg_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_HK_POUND = registerBlock("untrimmed_hk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_HK_POUND = registerBlock("trimmed_hk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_HK_POUND = registerBlock("cured_hk_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_AK_POUND = registerBlock("untrimmed_ak_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_AK_POUND = registerBlock("trimmed_ak_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_AK_POUND = registerBlock("cured_ak_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_CD_POUND = registerBlock("untrimmed_cd_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_CD_POUND = registerBlock("trimmed_cd_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_CD_POUND = registerBlock("cured_cd_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block UNTRIMMED_WZ_POUND = registerBlock("untrimmed_wz_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TRIMMED_WZ_POUND = registerBlock("trimmed_wz_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block CURED_WZ_POUND = registerBlock("cured_wz_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block OG_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "og_female_cannabis_plant")
            , new OG_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block OG_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "og_male_cannabis_plant")
            , new OG_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GDP_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "gdp_female_cannabis_plant")
            , new GDP_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GDP_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "gdp_male_cannabis_plant")
            , new GDP_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block RP_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "rp_female_cannabis_plant")
            , new RP_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block RP_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "rp_male_cannabis_plant")
            , new RP_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block AFG_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "afg_female_cannabis_plant")
            , new AFG_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block AFG_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "afg_male_cannabis_plant")
            , new AFG_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block HK_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "hk_female_cannabis_plant")
            , new HK_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block HK_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "hk_male_cannabis_plant")
            , new HK_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block AK_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "ak_female_cannabis_plant")
            , new AK_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block AK_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "ak_male_cannabis_plant")
            , new AK_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CP_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "cp_female_cannabis_plant")
            , new CP_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CP_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "cp_male_cannabis_plant")
            , new CP_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GDK_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "gdk_female_cannabis_plant")
            , new GDK_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GDK_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "gdk_male_cannabis_plant")
            , new GDK_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CD_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "cd_female_cannabis_plant")
            , new GDK_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CD_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "cd_male_cannabis_plant")
            , new GDK_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block WZ_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "wz_female_cannabis_plant")
            , new GDK_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block WZ_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, "wz_male_cannabis_plant")
            , new GDK_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Herb.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Herb.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Herb.LOGGER.info("Registering Mod Blocks");
    }
}
