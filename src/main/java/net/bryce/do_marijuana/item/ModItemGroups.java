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

    public static final ItemGroup WEED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Lets_do_marijuana.MOD_ID, "weed"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weed"))
                    .icon(() -> new ItemStack(ModItems.NUG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.NUG);
                        entries.add(ModItems.DRY_NUG);
                        entries.add(ModBlocks.NUG_BLOCK);
                        entries.add(ModBlocks.DRY_NUG_BLOCK);
                        entries.add(ModItems.MARIJUANA_SEEDS);
                        entries.add(ModItems.JOINT);
                    }).build());

    public static void registerItemGroups(){
        Lets_do_marijuana.LOGGER.info("Registering ItemGroups");
    }
}
