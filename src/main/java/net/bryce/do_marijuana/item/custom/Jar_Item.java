package net.bryce.do_marijuana.item.custom;

import net.bryce.do_marijuana.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Jar_Item extends Item {
    public Jar_Item(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        stack.setDamage(stack.getDamage() + 1);

        if (stack.getDamage() >= stack.getMaxDamage())
        {
            PlayerEntity player = (PlayerEntity)entity;
            if (stack.isOf(ModItems.OG_JAR_OF_TRIMMED))
            {
                ItemStack cured_jar = new ItemStack(ModItems.OG_JAR_OF_CURED);
                player.giveItemStack(cured_jar);
                stack.decrement(1);
            }
            if (stack.isOf(ModItems.GDP_JAR_OF_TRIMMED))
            {
                ItemStack cured_jar = new ItemStack(ModItems.GDP_JAR_OF_CURED);
                player.giveItemStack(cured_jar);
                stack.decrement(1);
            }
            if (stack.isOf(ModItems.RP_JAR_OF_TRIMMED))
            {
                ItemStack cured_jar = new ItemStack(ModItems.RP_JAR_OF_CURED);
                player.giveItemStack(cured_jar);
                stack.decrement(1);
            }
            if (stack.isOf(ModItems.CP_JAR_OF_TRIMMED))
            {
                ItemStack cured_jar = new ItemStack(ModItems.CP_JAR_OF_CURED);
                player.giveItemStack(cured_jar);
                stack.decrement(1);
            }
            if (stack.isOf(ModItems.GDK_JAR_OF_TRIMMED))
            {
                ItemStack cured_jar = new ItemStack(ModItems.GDK_JAR_OF_CURED);
                player.giveItemStack(cured_jar);
                stack.decrement(1);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
