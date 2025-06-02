package net.bryce.herb.item;

import net.bryce.herb.Herb;
import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.item.custom.base.*;
import net.bryce.herb.strains.Strains;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item JAR = registerItem("jar", new Item(new FabricItemSettings().maxCount(16)));

    public static final Item ASHTRAY = registerItem("ashtray", new Item(new FabricItemSettings().maxDamage(16)));

    public static final Item DIRTY_GRINDER = registerItem("dirty_grinder", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GRINDER =  registerItem("grinder", new Item(new FabricItemSettings().recipeRemainder(ModItems.DIRTY_GRINDER).maxCount(1)));

    public static final Item DIRTY_TRIMMING_SCISSORS = registerItem("dirty_trimming_scissors", new Item(new FabricItemSettings()));
    public static final Item TRIMMING_SCISSORS = registerItem("trimming_scissors", new Item(new FabricItemSettings().recipeRemainder(ModItems.DIRTY_TRIMMING_SCISSORS)));

    public static final Item ROLLING_PAPER =  registerItem("rolling_paper", new Item(new FabricItemSettings().maxCount(300)));

    public static final Item GLASS_PIPE =  registerItem("glass_pipe", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DIRTY_GLASS_PIPE =  registerItem("dirty_glass_pipe", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item FILTER =  registerItem("filter", new Item(new FabricItemSettings().maxCount(300)));

    public static final Item LIGHTER = registerItem("lighter", new Lighter_Item(new FabricItemSettings().maxDamage(4200)));
    public static final Item LIT_LIGHTER = registerItem("lit_lighter", new Lit_Lighter_Item(new FabricItemSettings().maxDamage(4200)));

    public static final Item STRAIGHT_BONG = registerItem("straight_bong", new AliasedBlockItem(ModBlocks.STRAIGHT_BONG_BLOCK, new FabricItemSettings()));

    public static final Item DIRTY_STRAIGHT_BONG = registerItem("dirty_straight_bong", new Item(new FabricItemSettings()));
    public static final Item DIRTY_PACKED_STRAIGHT_BONG = registerItem("dirty_packed_straight_bong", new Item(new FabricItemSettings().recipeRemainder(ModItems.DIRTY_STRAIGHT_BONG)));

    public static final Item EMPTY_BOWL = registerItem("empty_bowl", new Item(new FabricItemSettings()));
    public static final Item DIRTY_BOWL = registerItem("dirty_bowl", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientGroup(FabricItemGroupEntries entries){
        entries.add(JAR);
        entries.add(FILTER);
        entries.add(ROLLING_PAPER);
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
            registerItem(String.valueOf(strain.getPath())+"_extinguished_joint", new Extinguised_Joint_Item(new FabricItemSettings().maxDamage(4200)));
            registerItem(String.valueOf(strain.getPath())+"_filtered_joint", new Joint_Item(new FabricItemSettings().maxDamage(32)));
            registerItem(String.valueOf(strain.getPath())+"_extinguished_filtered_joint", new Extinguised_Joint_Item(new FabricItemSettings().maxDamage(4200)));
            registerItem(String.valueOf(strain.getPath())+"_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
            registerItem(String.valueOf(strain.getPath())+"_filtered_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
            registerItem(String.valueOf(strain.getPath())+"_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));
            registerItem(String.valueOf(strain.getPath())+"_cannabis_seeds", new AliasedBlockItem(Registries.BLOCK.get(new Identifier(Herb.MOD_ID, String.valueOf(strain.getPath())+"_female_cannabis_plant")), new FabricItemSettings()));
            registerItem("male_"+String.valueOf(strain.getPath())+"_cannabis_seeds", new AliasedBlockItem(Registries.BLOCK.get(new Identifier(Herb.MOD_ID, String.valueOf(strain.getPath())+"_male_cannabis_plant")), new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_packed_pipe", new Pipe_Item(new FabricItemSettings().maxDamage(16)));
            registerItem(String.valueOf(strain.getPath())+"_packed_bowl", new Item(new FabricItemSettings()));
            registerItem(String.valueOf(strain.getPath())+"_packed_straight_bong", new Bong_Item(new FabricItemSettings().recipeRemainder(ModItems.STRAIGHT_BONG).maxDamage(3)));
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
