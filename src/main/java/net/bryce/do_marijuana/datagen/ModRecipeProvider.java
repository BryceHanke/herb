package net.bryce.do_marijuana.datagen;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.OG_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_OG_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.OG_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_OG_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.OG_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_OG_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDP_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_GDP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDP_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_GDP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDP_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_GDP_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.RP_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_RP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.RP_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_RP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.RP_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_RP_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CP_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_CP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CP_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_CP_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CP_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_CP_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDK_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_GDK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDK_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_GDK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.GDK_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_GDK_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AFG_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_AFG_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AFG_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_AFG_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AFG_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_AFG_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.HK_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_HK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.HK_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_HK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.HK_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_HK_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AK_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_AK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AK_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_AK_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.AK_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_AK_POUND);

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CD_UNTRIMMED_NUG, RecipeCategory.MISC, ModBlocks.UNTRIMMED_CD_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CD_TRIMMED_NUG, RecipeCategory.MISC, ModBlocks.TRIMMED_CD_POUND);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.CD_CURED_NUG, RecipeCategory.MISC, ModBlocks.CURED_CD_POUND);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRINDER, 1)
                .pattern("III")
                .pattern("   ")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GRINDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JAR, 1)
                .pattern("GIG")
                .pattern("G G")
                .pattern("GGG")
                .input('I', Items.IRON_INGOT)
                .input('G', Items.GLASS)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.JAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROLLING_PAPER, 1)
                .input(Items.PAPER, 1)
                .input(Items.SUGAR_CANE, 1)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.ROLLING_PAPER)));

        // OG Kush
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.OG_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.OG_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_BUD, 5)
                .input(ModItems.OG_CURED_NUG, 1)
                .criterion(hasItem(ModItems.OG_CURED_NUG), conditionsFromItem(ModItems.OG_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.OG_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_JOINT)));

        // Grand Daddy Kush
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDP_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.GDP_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDP_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDP_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.GDP_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDP_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDP_BUD, 5)
                .input(ModItems.GDP_CURED_NUG, 1)
                .criterion(hasItem(ModItems.GDP_CURED_NUG), conditionsFromItem(ModItems.GDP_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDP_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDP_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.GDP_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDP_JOINT)));

        // Rosa Parks
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RP_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.RP_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RP_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.RP_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RP_BUD, 5)
                .input(ModItems.RP_CURED_NUG, 1)
                .criterion(hasItem(ModItems.RP_CURED_NUG), conditionsFromItem(ModItems.RP_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RP_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.RP_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_JOINT)));

        // Cheetah Piss
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CP_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.CP_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CP_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CP_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.CP_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CP_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CP_BUD, 5)
                .input(ModItems.CP_CURED_NUG, 1)
                .criterion(hasItem(ModItems.CP_CURED_NUG), conditionsFromItem(ModItems.CP_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CP_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CP_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.CP_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CP_JOINT)));

        // Grand Daddy Kush
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDK_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.GDK_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDK_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDK_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.GDK_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDK_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDK_BUD, 5)
                .input(ModItems.GDK_CURED_NUG, 1)
                .criterion(hasItem(ModItems.GDK_CURED_NUG), conditionsFromItem(ModItems.GDK_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDK_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDK_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.GDK_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.GDK_JOINT)));

        // ChemDawg
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CD_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.CD_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CD_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CD_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.CD_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CD_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CD_BUD, 5)
                .input(ModItems.CD_CURED_NUG, 1)
                .criterion(hasItem(ModItems.CD_CURED_NUG), conditionsFromItem(ModItems.CD_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CD_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CD_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.CD_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.CD_JOINT)));

        // Afghani
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AFG_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.AFG_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AFG_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AFG_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.AFG_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AFG_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AFG_BUD, 5)
                .input(ModItems.AFG_CURED_NUG, 1)
                .criterion(hasItem(ModItems.AFG_CURED_NUG), conditionsFromItem(ModItems.AFG_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AFG_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AFG_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.AFG_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AFG_JOINT)));

        // Hindu Kush
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HK_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.HK_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.HK_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HK_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.HK_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.HK_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HK_BUD, 5)
                .input(ModItems.HK_CURED_NUG, 1)
                .criterion(hasItem(ModItems.HK_CURED_NUG), conditionsFromItem(ModItems.HK_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.HK_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HK_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.HK_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.HK_JOINT)));

        // Afghan Kush
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AK_JAR_OF_TRIMMED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.AK_TRIMMED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AK_JAR_OF_TRIMMED)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AK_JAR_OF_CURED, 1)
                .pattern("NJN")
                .pattern("NNN")
                .input('J', ModItems.JAR)
                .input('N', ModItems.AK_CURED_NUG)
                .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AK_JAR_OF_CURED)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AK_BUD, 5)
                .input(ModItems.AK_CURED_NUG, 1)
                .criterion(hasItem(ModItems.AK_CURED_NUG), conditionsFromItem(ModItems.AK_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AK_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AK_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.AK_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.AK_JOINT)));
    }
}
