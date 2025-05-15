package net.bryce.do_marijuana.block;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.block.custom.Marijuana_Plant;
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

    public static final Block NUG_BLOCK = registerBlock("nug_block", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block DRY_NUG_BLOCK = registerBlock("dry_nug_block", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block MARIJUANA_PLANT = Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, "marijuana_plant")
            , new Marijuana_Plant(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Lets_do_marijuana.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Lets_do_marijuana.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Lets_do_marijuana.LOGGER.info("Registering Mod Blocks" + Lets_do_marijuana.MOD_ID);
    }
}
