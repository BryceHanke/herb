package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Lit_Joint_Item extends Smokable_Item{
    public Lit_Joint_Item(Settings settings) {super(settings);}

    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.TOOT_HORN;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {

        if (stack.getDamage() >= stack.getMaxDamage())
        {
            set_Filtered();
            if (!this.filtered)
            {
                ItemStack roach = Registries.ITEM.get(new Identifier("herb",String.valueOf(strain.getPath()) + "_roach")).getDefaultStack();
                roach.getOrCreateNbt().putString("strain", String.valueOf(strain.getPath()));
                stack.decrement(1);
                ((PlayerEntity) entity).giveItemStack(roach);
            }else
            {
                stack.decrement(1);
            }
        }
        PlayerEntity player = (PlayerEntity)entity;

        stack.setDamage(stack.getDamage() + 4);
        if (!world.isClient) {
            if (selected)
            {
                ((ServerWorld) world).spawnParticles(ParticleTypes.ASH,
                        player.getX() + (player.getRotationVector().x / 8),
                        player.getY() + player.getEyeHeight(player.getPose()),
                        player.getZ() + (player.getRotationVector().z / 8),
                        1,
                        player.getRotationVector().x * 0.01,
                        player.getRotationVector().y * 0.01,
                        player.getRotationVector().z * 0.01,
                        0.001);
            }
        }

        if(player.getOffHandStack().getDamage() >= player.getOffHandStack().getMaxDamage())
        {
            player.getOffHandStack().decrement(1);
        }

        if (player.isSubmergedInWater())
        {
            extinguish_Joint(stack, player);
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        stack.setDamage(stack.getDamage() + 16);
        if (remainingUseTicks <= 1)
        {
            setStrain();
            Strains.effects((PlayerEntity) user, strain.getPath(), 0);

            setStrain();

            if (user.getOffHandStack().getItem() == ModItems.ASHTRAY)
            {
                set_Filtered();
                extinguish_Joint(stack, user);
            }
        }

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

            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }

    public void extinguish_Joint(ItemStack stack, Entity user)
    {
        if (this.filtered)
        {
            ItemStack roach = Registries.ITEM.get(new Identifier("herb",String.valueOf(strain.getPath()) + "_extinguished_filtered_joint")).getDefaultStack();
            roach.setDamage(stack.getDamage());
            stack.decrement(1);
            ((PlayerEntity) user).giveItemStack(roach);
        }else {
            ItemStack roach = Registries.ITEM.get(new Identifier("herb",String.valueOf(strain.getPath()) + "_extinguished_joint")).getDefaultStack();
            roach.setDamage(stack.getDamage());
            stack.decrement(1);
            ((PlayerEntity) user).giveItemStack(roach);
        }

    }

}
