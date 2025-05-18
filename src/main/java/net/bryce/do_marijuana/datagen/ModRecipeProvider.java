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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.OG_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_JOINT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OG_BUD, 5)
                .input(ModItems.OG_CURED_NUG, 1)
                .criterion(hasItem(ModItems.OG_CURED_NUG), conditionsFromItem(ModItems.OG_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.OG_BUD)));

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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GDP_BUD, 5)
                .input(ModItems.RP_CURED_NUG, 1)
                .criterion(hasItem(ModItems.GDP_CURED_NUG), conditionsFromItem(ModItems.RP_CURED_NUG))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_BUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RP_JOINT, 1)
                .input(ModItems.ROLLING_PAPER, 1)
                .input(ModItems.RP_GROUND_WEED, 3)
                .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RP_JOINT)));
    }
}
