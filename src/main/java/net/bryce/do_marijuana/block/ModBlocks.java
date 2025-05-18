package net.bryce.do_marijuana.block;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.block.custom.*;
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

    public static final Block OG_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "og_female_cannabis_plant")
            , new OG_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GDP_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "gdp_female_cannabis_plant")
            , new GDP_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block RP_FEMALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "rp_female_cannabis_plant")
            , new RP_Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block OG_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "og_male_cannabis_plant")
            , new OG_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GDP_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "gdp_male_cannabis_plant")
            , new GDP_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block RP_MALE_CANNABIS_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "rp_male_cannabis_plant")
            , new RP_Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Lets_do_marijuana.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Lets_do_marijuana.LOGGER.info("Registering Mod Blocks");
    }
}
