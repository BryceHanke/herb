package net.bryce.do_marijuana.item.custom;

import net.bryce.do_marijuana.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Joint_Item extends Item {
    public Joint_Item(Settings settings) {super(settings);}


    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks)
    {
        PlayerEntity player = (PlayerEntity)user;

        if (stack.isOf(ModItems.OG_JOINT))
        {
            ItemStack lit_joint = new ItemStack(ModItems.OG_LIT_JOINT);
            player.giveItemStack(lit_joint);
            stack.decrement(1);
        }
        if (stack.isOf(ModItems.GDP_JOINT))
        {
            ItemStack lit_joint = new ItemStack(ModItems.GDP_LIT_JOINT);
            player.giveItemStack(lit_joint);
            stack.decrement(1);
        }
        if (stack.isOf(ModItems.RP_JOINT))
        {
            ItemStack lit_joint = new ItemStack(ModItems.RP_LIT_JOINT);
            player.giveItemStack(lit_joint);
            stack.decrement(1);
        }
        if (stack.isOf(ModItems.CP_JOINT))
        {
            ItemStack lit_joint = new ItemStack(ModItems.CP_LIT_JOINT);
            player.giveItemStack(lit_joint);
            stack.decrement(1);
        }
        if (stack.isOf(ModItems.GDK_JOINT))
        {
            ItemStack lit_joint = new ItemStack(ModItems.GDK_LIT_JOINT);
            player.giveItemStack(lit_joint);
            stack.decrement(1);
        }

        super.usageTick(world, user, stack, remainingUseTicks);
    }

    public int getMaxUseTime(ItemStack stack) {
        return 64;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        stack.setDamage(stack.getDamage() + 1);
        return UseAction.BOW;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {

        if (user.getOffHandStack().isOf(Items.FLINT_AND_STEEL))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);

        }

        if(user.getOffHandStack().isOf(Items.FIRE_CHARGE))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        if(user.getOffHandStack().isOf(Items.LAVA_BUCKET))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        return TypedActionResult.fail(user.getStackInHand(hand));
    }
}
