package net.bryce.herb.block;

import net.bryce.herb.Herb;
import net.bryce.herb.block.custom.female.*;
import net.bryce.herb.block.custom.male.*;
import net.bryce.herb.strains.Strains;
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
    public static void registerStrainBlocks()
    {
        for (Identifier strain : Strains.strains)
        {
            registerBlock("untrimmed_"+String.valueOf(strain.getPath())+"_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
            registerBlock("trimmed_"+String.valueOf(strain.getPath())+"_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
            registerBlock("cured_"+String.valueOf(strain.getPath())+"_pound", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

            registerBlock(String.valueOf(strain.getPath())+"_female_cannabis_plant", new _Female_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
            registerBlock(String.valueOf(strain.getPath())+"_male_cannabis_plant", new _Male_Cannabis_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        }
    }

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
