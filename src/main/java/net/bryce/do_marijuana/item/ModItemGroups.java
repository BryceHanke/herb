package net.bryce.do_marijuana.item;

import net.bryce.do_marijuana.Lets_do_marijuana;
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
                        entries.add(new ItemStack(ModItems.NUG));
                        entries.add(new ItemStack(ModItems.DRY_NUG));
                    }).build());

    public static void registerItemGroups(){
        Lets_do_marijuana.LOGGER.info("Registering ItemGroups");
    }
}
