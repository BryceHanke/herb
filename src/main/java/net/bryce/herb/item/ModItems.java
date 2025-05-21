package net.bryce.herb.item;

import net.bryce.herb.Herb;
import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.item.custom.base.Jar_Item;
import net.bryce.herb.item.custom.base.Joint_Item;
import net.bryce.herb.item.custom.base.Lit_Joint_Item;
import net.bryce.herb.item.custom.base.Roach_Item;
import net.bryce.herb.strains.Strains;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item JAR = registerItem("jar", new Item(new FabricItemSettings()));

    public static final Item ASHTRAY = registerItem("ashtray", new Item(new FabricItemSettings()));

    public static final Item DIRTY_GRINDER = registerItem("dirty_grinder", new Item(new FabricItemSettings()));
    public static final Item GRINDER =  registerItem("grinder", new Item(new FabricItemSettings().recipeRemainder(ModItems.DIRTY_GRINDER)));

    public static final Item DIRTY_TRIMMING_SCISSORS = registerItem("dirty_trimming_scissors", new Item(new FabricItemSettings()));
    public static final Item TRIMMING_SCISSORS = registerItem("trimming_scissors", new Item(new FabricItemSettings().recipeRemainder(ModItems.DIRTY_TRIMMING_SCISSORS)));

    public static final Item ROLLING_PAPER =  registerItem("rolling_paper", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientGroup(FabricItemGroupEntries entries){
        entries.add(JAR);
    }

    public static void registerStrainItems()
    {
        for (Identifier strain : Strains.strains)
        {
            registerItem(String.valueOf(strain.getPath())+"_untrimmed_nug", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_trimmed_nug", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_cured_nug", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_bud", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_ground_weed", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_jar_of_trimmed", new Jar_Item(new FabricItemSettings().maxDamage(42000).recipeRemainder(ModItems.JAR)));
            registerItem(String.valueOf(strain.getPath())+"_jar_of_cured", new Item(new FabricItemSettings().recipeRemainder(ModItems.JAR)));
            registerItem(String.valueOf(strain.getPath())+"_joint", new Joint_Item(new FabricItemSettings().maxDamage(42)));
            registerItem(String.valueOf(strain.getPath())+"_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
            registerItem(String.valueOf(strain.getPath())+"_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));
            registerItem(String.valueOf(strain.getPath())+"_cannabis_seeds", new AliasedBlockItem(Registries.BLOCK.get(new Identifier(Herb.MOD_ID, String.valueOf(strain.getPath())+"_female_cannabis_plant")), new FabricItemSettings()));
            registerItem("male_"+String.valueOf(strain.getPath())+"_cannabis_seeds", new AliasedBlockItem(Registries.BLOCK.get(new Identifier(Herb.MOD_ID, String.valueOf(strain.getPath())+"_male_cannabis_plant")), new FabricItemSettings()));
        }
    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Herb.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Herb.LOGGER.info("Registering Mod Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientGroup);
    }
}
