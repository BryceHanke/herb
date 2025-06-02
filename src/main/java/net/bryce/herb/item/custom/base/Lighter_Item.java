package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;


public class Lighter_Item extends Item{
    public Lighter_Item(Settings settings) {
        super(settings);
    }

    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.BLOCK;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks)
    {
        light(user, stack);
    }

    public void light(Entity entity, ItemStack stack)
    {
        ItemStack lighter = ModItems.LIT_LIGHTER.getDefaultStack();
        lighter.setDamage(stack.getDamage());
        stack.decrement(1);
        ((PlayerEntity) entity).giveItemStack(lighter);
    }
}
