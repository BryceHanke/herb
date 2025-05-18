package net.bryce.do_marijuana.item.custom;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.effect.ModEffects;
import net.bryce.do_marijuana.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Lit_Joint_Item extends Item{
    public Lit_Joint_Item(Settings settings) {super(settings);}

    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.BOW;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        if (user.getOffHandStack().getItem() == ModItems.ASHTRAY)
        {
            Lets_do_marijuana.LOGGER.info("yomama");
        }

        return ItemUsage.consumeHeldItem(world, user, hand);

    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        PlayerEntity player = (PlayerEntity)entity;

        stack.setDamage(stack.getDamage() + 1);
        if (!world.isClient) {
            if (selected)
            {
                ((ServerWorld) world).spawnParticles(ParticleTypes.ASH,
                        player.getX() + player.getRotationVector().x,
                        player.getY() + player.getRotationVector().y,
                        player.getZ() + player.getRotationVector().z,
                        1,
                        player.getRotationVector().x * 0.1,
                        player.getRotationVector().y * 0.1,
                        player.getRotationVector().z * 0.1,
                        0.001);
            }
        }

        if (stack.getDamage() >= stack.getMaxDamage())
        {
            if (stack.isOf(ModItems.GDP_LIT_JOINT))
            {
                stack.decrement(1);
                ItemStack roach = new ItemStack(ModItems.GDP_ROACH);
                player.giveItemStack(roach);
            }
            if (stack.isOf(ModItems.OG_LIT_JOINT))
            {
                stack.decrement(1);
                ItemStack roach = new ItemStack(ModItems.OG_ROACH);
                player.giveItemStack(roach);
            }
            if (stack.isOf(ModItems.RP_LIT_JOINT))
            {
                stack.decrement(1);
                ItemStack roach = new ItemStack(ModItems.RP_ROACH);
                player.giveItemStack(roach);
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        stack.setDamage(stack.getDamage() + 1);
        if (remainingUseTicks <= 5)
        {
            if (!world.isClient)
            {
                ((ServerWorld) world).spawnParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                        user.getX() + user.getRotationVector().x,
                        user.getY() + user.getEyeHeight(user.getPose()),
                        user.getZ() + user.getRotationVector().z,
                        1,
                        user.getRotationVector().x * 0.5,
                        user.getRotationVector().y * 0.5,
                        user.getRotationVector().z * 0.5,
                        0.001);
                if (stack.isOf(ModItems.OG_LIT_JOINT))
                {
                    user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, 0));
                }
                if (stack.isOf(ModItems.GDP_LIT_JOINT))
                {
                    user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, 0));
                }
                if (stack.isOf(ModItems.RP_LIT_JOINT))
                {
                    user.addStatusEffect(new StatusEffectInstance(ModEffects.drowsy, 500, 0));
                }
            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }

}
