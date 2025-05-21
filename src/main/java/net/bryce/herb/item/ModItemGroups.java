package net.bryce.herb.item;

import net.bryce.herb.Herb;
import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.strains.Strains;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup HERB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Herb.MOD_ID, "herb"),
            FabricItemGroup.builder().displayName(Text.translatable("Herb"))
                    .icon(() -> new ItemStack(Registries.ITEM.get(new Identifier("herb", "og_untrimmed_nug")))).entries((displayContext, entries) -> {
                        for (Identifier strain : Strains.strains)
                        {
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_untrimmed_nug")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_trimmed_nug")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_cured_nug")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_bud")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_ground_weed")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_joint")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_lit_joint")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_roach")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_cannabis_seeds")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", "male_"+ String.valueOf(strain.getPath())+"_cannabis_seeds")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_jar_of_trimmed")));
                            entries.add(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_jar_of_cured")));
                            entries.add(Registries.BLOCK.get(new Identifier("herb", "untrimmed_"+String.valueOf(strain.getPath())+"_pound")));
                            entries.add(Registries.BLOCK.get(new Identifier("herb", "trimmed_"+String.valueOf(strain.getPath())+"_pound")));
                            entries.add(Registries.BLOCK.get(new Identifier("herb", "cured_"+String.valueOf(strain.getPath())+"_pound")));
                        }

                        entries.add(ModItems.JAR);
                        entries.add(ModItems.ASHTRAY);
                        entries.add(ModItems.GRINDER);
                        entries.add(ModItems.DIRTY_GRINDER);
                        entries.add(ModItems.TRIMMING_SCISSORS);
                        entries.add(ModItems.DIRTY_TRIMMING_SCISSORS);
                        entries.add(ModItems.ROLLING_PAPER);
                    }).build());

    public static void registerItemGroups(){
        Herb.LOGGER.info("Registering Item Groups");
    }
}
