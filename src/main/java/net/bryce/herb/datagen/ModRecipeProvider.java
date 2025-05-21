package net.bryce.herb.datagen;

import net.bryce.herb.Herb;
import net.bryce.herb.strains.Strains;
import net.bryce.herb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer)
    {
        for (Identifier id : Strains.strains) {
            Herb.LOGGER.info("Loading recipes for " + id);
            offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_untrimmed_nug")), RecipeCategory.MISC,  Registries.BLOCK.get(new Identifier("herb","untrimmed_" + String.valueOf(id.getPath()) + "_pound")));
            offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_trimmed_nug")), RecipeCategory.MISC,  Registries.BLOCK.get(new Identifier("herb","trimmed_" + String.valueOf(id.getPath()) + "_pound")));
            offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug")), RecipeCategory.MISC,  Registries.BLOCK.get(new Identifier("herb","cured_" + String.valueOf(id.getPath()) + "_pound")));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_trimmed")), 1)
                    .pattern("NJN")
                    .pattern("NNN")
                    .input('J', ModItems.JAR)
                    .input('N', Registries.ITEM.get(new Identifier(String.valueOf(id) + "_trimmed_nug")))
                    .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                    .offerTo(consumer, new Identifier(getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_trimmed")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_trimmed_nug")),5)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_trimmed")), 1)
                    .criterion(hasItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_trimmed"))), conditionsFromItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_trimmed"))))
                    .offerTo(consumer, new Identifier("unjar_" + getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_trimmed_nug")))));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_cured")), 1)
                    .pattern("NJN")
                    .pattern("NNN")
                    .input('J', ModItems.JAR)
                    .input('N', Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug")))
                    .criterion(hasItem(ModItems.JAR), conditionsFromItem(ModItems.JAR))
                    .offerTo(consumer, new Identifier(getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_cured")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug")),5)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_cured")), 1)
                    .criterion(hasItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_cured"))), conditionsFromItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_jar_of_cured"))))
                    .offerTo(consumer, new Identifier("unjar_" + getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_bud")), 5)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug")), 1)
                    .criterion(hasItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug"))), conditionsFromItem(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_cured_nug"))))
                    .offerTo(consumer, new Identifier(getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_bud")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_ground_weed")), 5)
                    .input(ModItems.GRINDER, 1)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_bud")), 5)
                    .criterion(hasItem(ModItems.GRINDER), conditionsFromItem(ModItems.GRINDER))
                    .offerTo(consumer, new Identifier(getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_ground_weed")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_untrimmed_nug")), 3)
                    .input(ModItems.TRIMMING_SCISSORS, 1)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_untrimmed_nug")), 3)
                    .criterion(hasItem(ModItems.TRIMMING_SCISSORS), conditionsFromItem(ModItems.TRIMMING_SCISSORS))
                    .offerTo(consumer, new Identifier("trim_" + getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_trimmed_nug")))));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Registries.ITEM.get(new Identifier(String.valueOf(id) + "_joint")), 1)
                    .input(ModItems.ROLLING_PAPER, 1)
                    .input(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_ground_weed")), 3)
                    .criterion(hasItem(ModItems.ROLLING_PAPER), conditionsFromItem(ModItems.ROLLING_PAPER))
                    .offerTo(consumer, new Identifier(getRecipeName(Registries.ITEM.get(new Identifier(String.valueOf(id) + "_joint")))));
        }

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TRIMMING_SCISSORS, 1)
                .pattern("I I")
                .pattern(" I ")
                .pattern("I I")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.TRIMMING_SCISSORS)));

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

    }
}