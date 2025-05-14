package net.bryce.do_marijuana.item;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item NUG = registerItem("nug", new Item(new FabricItemSettings()));
    public static final Item DRY_NUG =  registerItem("dry_nug", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientGroup(FabricItemGroupEntries entries){
        entries.add(NUG);
        entries.add(DRY_NUG);
    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Lets_do_marijuana.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Lets_do_marijuana.LOGGER.info("Registering ModItems" + Lets_do_marijuana.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientGroup);
    }
}
