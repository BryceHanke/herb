package net.bryce.do_marijuana.item;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.item.custom.*;
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

    public static final Item OG_UNTRIMMED_NUG = registerItem("og_untrimmed_nug", new Item(new FabricItemSettings()));
    public static final Item OG_TRIMMED_NUG = registerItem("og_trimmed_nug", new Item(new FabricItemSettings()));
    public static final Item OG_CURED_NUG = registerItem("og_cured_nug", new Item(new FabricItemSettings()));
    public static final Item OG_BUD = registerItem("og_bud", new Item(new FabricItemSettings()));
    public static final Item OG_GROUND_WEED = registerItem("og_ground_weed", new Item(new FabricItemSettings()));

    public static final Item OG_JAR_OF_TRIMMED = registerItem("og_jar_of_trimmed", new Jar_Item(new FabricItemSettings().maxDamage(42000).recipeRemainder(ModItems.JAR)));
    public static final Item OG_JAR_OF_CURED = registerItem("og_jar_of_cured", new Item(new FabricItemSettings().recipeRemainder(ModItems.JAR)));

    public static final Item OG_JOINT = registerItem("og_joint", new Joint_Item(new FabricItemSettings().maxDamage(42)));
    public static final Item OG_LIT_JOINT = registerItem("og_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
    public static final Item OG_ROACH = registerItem("og_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));

    public static final Item OG_CANNABIS_SEEDS = registerItem("og_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.OG_FEMALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item MALE_OG_CANNABIS_SEEDS = registerItem("male_og_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.OG_MALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item GDP_UNTRIMMED_NUG = registerItem("gdp_untrimmed_nug", new Item(new FabricItemSettings()));
    public static final Item GDP_TRIMMED_NUG = registerItem("gdp_trimmed_nug", new Item(new FabricItemSettings()));
    public static final Item GDP_CURED_NUG = registerItem("gdp_cured_nug", new Item(new FabricItemSettings()));
    public static final Item GDP_BUD = registerItem("gdp_bud", new Item(new FabricItemSettings()));
    public static final Item GDP_GROUND_WEED = registerItem("gdp_ground_weed", new Item(new FabricItemSettings()));

    public static final Item GDP_JAR_OF_TRIMMED = registerItem("gdp_jar_of_trimmed", new Jar_Item(new FabricItemSettings().maxDamage(42000).recipeRemainder(ModItems.JAR)));
    public static final Item GDP_JAR_OF_CURED = registerItem("gdp_jar_of_cured", new Item(new FabricItemSettings().recipeRemainder(ModItems.JAR)));

    public static final Item GDP_JOINT = registerItem("gdp_joint", new Joint_Item(new FabricItemSettings().maxDamage(42)));
    public static final Item GDP_LIT_JOINT = registerItem("gdp_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
    public static final Item GDP_ROACH = registerItem("gdp_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));

    public static final Item GDP_CANNABIS_SEEDS = registerItem("gdp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.GDP_FEMALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item MALE_GDP_CANNABIS_SEEDS = registerItem("male_gdp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.GDP_MALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item RP_UNTRIMMED_NUG = registerItem("rp_untrimmed_nug", new Item(new FabricItemSettings()));
    public static final Item RP_TRIMMED_NUG = registerItem("rp_trimmed_nug", new Item(new FabricItemSettings()));
    public static final Item RP_CURED_NUG = registerItem("rp_cured_nug", new Item(new FabricItemSettings()));
    public static final Item RP_BUD = registerItem("rp_bud", new Item(new FabricItemSettings()));
    public static final Item RP_GROUND_WEED = registerItem("rp_ground_weed", new Item(new FabricItemSettings()));

    public static final Item RP_JAR_OF_TRIMMED = registerItem("rp_jar_of_trimmed", new Jar_Item(new FabricItemSettings().maxDamage(42000).recipeRemainder(ModItems.JAR)));
    public static final Item RP_JAR_OF_CURED = registerItem("rp_jar_of_cured", new Item(new FabricItemSettings().recipeRemainder(ModItems.JAR)));

    public static final Item RP_JOINT = registerItem("rp_joint", new Joint_Item(new FabricItemSettings().maxDamage(42)));
    public static final Item RP_LIT_JOINT = registerItem("rp_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
    public static final Item RP_ROACH = registerItem("rp_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));

    public static final Item RP_CANNABIS_SEEDS = registerItem("rp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.RP_FEMALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item MALE_RP_CANNABIS_SEEDS = registerItem("male_rp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.RP_MALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item CP_UNTRIMMED_NUG = registerItem("cp_untrimmed_nug", new Item(new FabricItemSettings()));
    public static final Item CP_TRIMMED_NUG = registerItem("cp_trimmed_nug", new Item(new FabricItemSettings()));
    public static final Item CP_CURED_NUG = registerItem("cp_cured_nug", new Item(new FabricItemSettings()));
    public static final Item CP_BUD = registerItem("cp_bud", new Item(new FabricItemSettings()));
    public static final Item CP_GROUND_WEED = registerItem("cp_ground_weed", new Item(new FabricItemSettings()));

    public static final Item CP_JAR_OF_TRIMMED = registerItem("cp_jar_of_trimmed", new Jar_Item(new FabricItemSettings().maxDamage(42000).recipeRemainder(ModItems.JAR)));
    public static final Item CP_JAR_OF_CURED = registerItem("cp_jar_of_cured", new Item(new FabricItemSettings().recipeRemainder(ModItems.JAR)));

    public static final Item CP_JOINT = registerItem("cp_joint", new Joint_Item(new FabricItemSettings().maxDamage(42)));
    public static final Item CP_LIT_JOINT = registerItem("cp_lit_joint", new Lit_Joint_Item(new FabricItemSettings().maxDamage(4200)));
    public static final Item CP_ROACH = registerItem("cp_roach", new Roach_Item(new FabricItemSettings().maxDamage(420)));

    public static final Item CP_CANNABIS_SEEDS = registerItem("cp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.CP_FEMALE_CANNABIS_PLANT, new FabricItemSettings()));

    public static final Item MALE_CP_CANNABIS_SEEDS = registerItem("male_cp_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.CP_MALE_CANNABIS_PLANT, new FabricItemSettings()));

    private static void addItemsToIngredientGroup(FabricItemGroupEntries entries){
        entries.add(JAR);
    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Lets_do_marijuana.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Lets_do_marijuana.LOGGER.info("Registering Mod Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientGroup);
    }
}
