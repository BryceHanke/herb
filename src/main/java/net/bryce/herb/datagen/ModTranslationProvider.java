package net.bryce.herb.datagen;

import net.bryce.herb.strains.Strains;
import net.bryce.herb.effect.ModEffects;
import net.bryce.herb.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModTranslationProvider extends FabricLanguageProvider {
    public ModTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        for (Identifier id : Strains.strains)
        {
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_untrimmed_nug")),"Untrimmed "+String.valueOf(id.getPath().toUpperCase()) + " Nug");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_trimmed_nug")),"Trimmed "+String.valueOf(id.getPath().toUpperCase()) + " Nug");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_cured_nug")),"Cured "+String.valueOf(id.getPath().toUpperCase()) + " Nug");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_bud")),String.valueOf(id.getPath().toUpperCase()) + " Bud");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath())+"_ground_weed")),"Ground "+String.valueOf(id.getPath().toUpperCase()));
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_trimmed")),"Jar of Trimmed "+String.valueOf(id.getPath().toUpperCase()));
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_jar_of_cured")),"Jar of Cured "+String.valueOf(id.getPath().toUpperCase()));
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_cannabis_seeds")),String.valueOf(id.getPath().toUpperCase())+" Seeds");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb","male_"+String.valueOf(id.getPath()) + "_cannabis_seeds")),String.valueOf(id.getPath().toUpperCase())+" Male Seeds");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_joint")),String.valueOf(id.getPath().toUpperCase())+" Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_filtered_joint")),String.valueOf(id.getPath().toUpperCase())+" Filtered Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_filtered_lit_joint")),String.valueOf(id.getPath().toUpperCase())+" Filtered Lit Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_extinguished_joint")),String.valueOf(id.getPath().toUpperCase())+" Extinguished Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_extinguished_filtered_joint")),String.valueOf(id.getPath().toUpperCase())+" Extinguished Filtered Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_lit_joint")),"Lit "+String.valueOf(id.getPath().toUpperCase())+" Joint");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_roach")),String.valueOf(id.getPath().toUpperCase())+" Roach");
            translationBuilder.add(Registries.ITEM.get(new Identifier("herb",String.valueOf(id.getPath()) + "_packed_pipe")),String.valueOf(id.getPath().toUpperCase())+" Packed Pipe");
            translationBuilder.add(Registries.BLOCK.get(new Identifier("herb","untrimmed_"+String.valueOf(id.getPath()) + "_pound")),"Sack of Untrimmed "+String.valueOf(id.getPath().toUpperCase()));
            translationBuilder.add(Registries.BLOCK.get(new Identifier("herb","trimmed_"+String.valueOf(id.getPath()) + "_pound")),"Sack of Trimmed "+String.valueOf(id.getPath().toUpperCase()));
            translationBuilder.add(Registries.BLOCK.get(new Identifier("herb","cured_"+String.valueOf(id.getPath()) + "_pound")),"Sack of Cured "+String.valueOf(id.getPath().toUpperCase()));
        }

        translationBuilder.add(ModItems.JAR, "Jar");
        translationBuilder.add(ModItems.GRINDER, "Grinder");
        translationBuilder.add(ModItems.ASHTRAY, "Ashtray");

        translationBuilder.add(ModItems.DIRTY_GRINDER, "Dirty Grinder");
        translationBuilder.add(ModItems.ROLLING_PAPER, "Rolling Paper");

        translationBuilder.add(ModItems.TRIMMING_SCISSORS, "Trimming Scissors");
        translationBuilder.add(ModItems.DIRTY_TRIMMING_SCISSORS, "Trimming Scissors");

        translationBuilder.add(ModItems.GLASS_PIPE, "Pipe");
        translationBuilder.add(ModItems.DIRTY_GLASS_PIPE, "Dirty Pipe");

        translationBuilder.add(ModItems.FILTER, "Filter");

        translationBuilder.add(ModItems.LIGHTER, "Lighter");

        translationBuilder.add(ModEffects.sleepy, "Sleepy");
        translationBuilder.add(ModEffects.hungry, "Hungry");
        translationBuilder.add(ModEffects.focused, "Focused");
        translationBuilder.add(ModEffects.relaxed, "Relaxed");
        translationBuilder.add(ModEffects.energized, "Energized");
        translationBuilder.add(ModEffects.aroused, "Aroused");
        translationBuilder.add(ModEffects.giggly, "Giggly");
        translationBuilder.add(ModEffects.euphoric, "Euphoric");
        translationBuilder.add(ModEffects.tingly, "Tingly");
        translationBuilder.add(ModEffects.creative, "Creative");
        translationBuilder.add(ModEffects.uplifted, "Uplifted");
        translationBuilder.add(ModEffects.headache, "Headache");
        translationBuilder.add(ModEffects.dizzy, "Dizzy");
        translationBuilder.add(ModEffects.dryeyes, "Dry Eyes");
        translationBuilder.add(ModEffects.cottonmouth, "Cotton Mouth");
        translationBuilder.add(ModEffects.anxiety, "Anxiety");


        translationBuilder.add("itemgroup.herb", "Herb");
    }
}