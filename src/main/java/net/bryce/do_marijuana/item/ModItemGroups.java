package net.bryce.do_marijuana.item;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup LETSDOMARIJUANA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Lets_do_marijuana.MOD_ID, "do_marijuana"),
            FabricItemGroup.builder().displayName(Text.translatable("[Let's Do] Marijuana"))
                    .icon(() -> new ItemStack(ModItems.OG_UNTRIMMED_NUG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OG_UNTRIMMED_NUG);
                        entries.add(ModItems.OG_TRIMMED_NUG);
                        entries.add(ModItems.OG_CURED_NUG);
                        entries.add(ModItems.OG_BUD);
                        entries.add(ModItems.OG_GROUND_WEED);
                        entries.add(ModItems.OG_JOINT);
                        entries.add(ModItems.OG_LIT_JOINT);
                        entries.add(ModItems.OG_ROACH);
                        entries.add(ModItems.OG_CANNABIS_SEEDS);
                        entries.add(ModItems.OG_JAR_OF_TRIMMED);
                        entries.add(ModItems.OG_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_OG_POUND);
                        entries.add(ModBlocks.TRIMMED_OG_POUND);
                        entries.add(ModBlocks.CURED_OG_POUND);

                        entries.add(ModItems.GDP_UNTRIMMED_NUG);
                        entries.add(ModItems.GDP_TRIMMED_NUG);
                        entries.add(ModItems.GDP_CURED_NUG);
                        entries.add(ModItems.GDP_BUD);
                        entries.add(ModItems.GDP_GROUND_WEED);
                        entries.add(ModItems.GDP_JOINT);
                        entries.add(ModItems.GDP_LIT_JOINT);
                        entries.add(ModItems.GDP_ROACH);
                        entries.add(ModItems.GDP_CANNABIS_SEEDS);
                        entries.add(ModItems.GDP_JAR_OF_TRIMMED);
                        entries.add(ModItems.GDP_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_GDP_POUND);
                        entries.add(ModBlocks.TRIMMED_GDP_POUND);
                        entries.add(ModBlocks.CURED_GDP_POUND);

                        entries.add(ModItems.RP_UNTRIMMED_NUG);
                        entries.add(ModItems.RP_TRIMMED_NUG);
                        entries.add(ModItems.RP_CURED_NUG);
                        entries.add(ModItems.RP_BUD);
                        entries.add(ModItems.RP_GROUND_WEED);
                        entries.add(ModItems.RP_JOINT);
                        entries.add(ModItems.RP_LIT_JOINT);
                        entries.add(ModItems.RP_ROACH);
                        entries.add(ModItems.RP_CANNABIS_SEEDS);
                        entries.add(ModItems.RP_JAR_OF_TRIMMED);
                        entries.add(ModItems.RP_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_RP_POUND);
                        entries.add(ModBlocks.TRIMMED_RP_POUND);
                        entries.add(ModBlocks.CURED_RP_POUND);

                        entries.add(ModItems.CP_UNTRIMMED_NUG);
                        entries.add(ModItems.CP_TRIMMED_NUG);
                        entries.add(ModItems.CP_CURED_NUG);
                        entries.add(ModItems.CP_BUD);
                        entries.add(ModItems.CP_GROUND_WEED);
                        entries.add(ModItems.CP_JOINT);
                        entries.add(ModItems.CP_LIT_JOINT);
                        entries.add(ModItems.CP_ROACH);
                        entries.add(ModItems.CP_CANNABIS_SEEDS);
                        entries.add(ModItems.CP_JAR_OF_TRIMMED);
                        entries.add(ModItems.CP_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_CP_POUND);
                        entries.add(ModBlocks.TRIMMED_CP_POUND);
                        entries.add(ModBlocks.CURED_CP_POUND);

                        entries.add(ModItems.GDK_UNTRIMMED_NUG);
                        entries.add(ModItems.GDK_TRIMMED_NUG);
                        entries.add(ModItems.GDK_CURED_NUG);
                        entries.add(ModItems.GDK_BUD);
                        entries.add(ModItems.GDK_GROUND_WEED);
                        entries.add(ModItems.GDK_JOINT);
                        entries.add(ModItems.GDK_LIT_JOINT);
                        entries.add(ModItems.GDK_ROACH);
                        entries.add(ModItems.GDK_CANNABIS_SEEDS);
                        entries.add(ModItems.GDK_JAR_OF_TRIMMED);
                        entries.add(ModItems.GDK_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_GDK_POUND);
                        entries.add(ModBlocks.TRIMMED_GDK_POUND);
                        entries.add(ModBlocks.CURED_GDK_POUND);

                        entries.add(ModItems.AFG_UNTRIMMED_NUG);
                        entries.add(ModItems.AFG_TRIMMED_NUG);
                        entries.add(ModItems.AFG_CURED_NUG);
                        entries.add(ModItems.AFG_BUD);
                        entries.add(ModItems.AFG_GROUND_WEED);
                        entries.add(ModItems.AFG_JOINT);
                        entries.add(ModItems.AFG_LIT_JOINT);
                        entries.add(ModItems.AFG_ROACH);
                        entries.add(ModItems.AFG_CANNABIS_SEEDS);
                        entries.add(ModItems.AFG_JAR_OF_TRIMMED);
                        entries.add(ModItems.AFG_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_AFG_POUND);
                        entries.add(ModBlocks.TRIMMED_AFG_POUND);
                        entries.add(ModBlocks.CURED_AFG_POUND);

                        entries.add(ModItems.HK_UNTRIMMED_NUG);
                        entries.add(ModItems.HK_TRIMMED_NUG);
                        entries.add(ModItems.HK_CURED_NUG);
                        entries.add(ModItems.HK_BUD);
                        entries.add(ModItems.HK_GROUND_WEED);
                        entries.add(ModItems.HK_JOINT);
                        entries.add(ModItems.HK_LIT_JOINT);
                        entries.add(ModItems.HK_ROACH);
                        entries.add(ModItems.HK_CANNABIS_SEEDS);
                        entries.add(ModItems.HK_JAR_OF_TRIMMED);
                        entries.add(ModItems.HK_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_HK_POUND);
                        entries.add(ModBlocks.TRIMMED_HK_POUND);
                        entries.add(ModBlocks.CURED_HK_POUND);

                        entries.add(ModItems.AK_UNTRIMMED_NUG);
                        entries.add(ModItems.AK_TRIMMED_NUG);
                        entries.add(ModItems.AK_CURED_NUG);
                        entries.add(ModItems.AK_BUD);
                        entries.add(ModItems.AK_GROUND_WEED);
                        entries.add(ModItems.AK_JOINT);
                        entries.add(ModItems.AK_LIT_JOINT);
                        entries.add(ModItems.AK_ROACH);
                        entries.add(ModItems.AK_CANNABIS_SEEDS);
                        entries.add(ModItems.AK_JAR_OF_TRIMMED);
                        entries.add(ModItems.AK_JAR_OF_CURED);
                        entries.add(ModBlocks.UNTRIMMED_AK_POUND);
                        entries.add(ModBlocks.TRIMMED_AK_POUND);
                        entries.add(ModBlocks.CURED_AK_POUND);

                        entries.add(ModItems.JAR);
                        entries.add(ModItems.ASHTRAY);
                        entries.add(ModItems.GRINDER);
                        entries.add(ModItems.DIRTY_GRINDER);
                        entries.add(ModItems.TRIMMING_SCISSORS);
                        entries.add(ModItems.DIRTY_TRIMMING_SCISSORS);
                        entries.add(ModItems.ROLLING_PAPER);
                    }).build());

    public static void registerItemGroups(){
        Lets_do_marijuana.LOGGER.info("Registering Item Groups");
    }
}
