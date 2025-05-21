package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
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

import java.util.Objects;

public class Lit_Joint_Item extends Item{
    public Lit_Joint_Item(Settings settings) {super(settings);}

    public Identifier strain = Strains.strains[0];

    public void setStrain()
    {
        for (Identifier id : Strains.strains)
        {
            if (String.valueOf(this).contains(String.valueOf(id.getPath())))
            {
                strain = new Identifier("herb", String.valueOf(id.getPath()));
            }
        }
    }

    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.TOOT_HORN;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        setStrain();

        if (user.getOffHandStack().getItem() == ModItems.ASHTRAY)
        {
            ItemStack roach = Registries.ITEM.get(new Identifier("herb",String.valueOf(strain.getPath()) + "_roach")).getDefaultStack();
            ((PlayerEntity) user).giveItemStack(roach);
            user.getStackInHand(hand).decrement(1);
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
            ItemStack roach = Registries.ITEM.get(new Identifier("herb",String.valueOf(strain.getPath()) + "_roach")).getDefaultStack();
            ((PlayerEntity) entity).giveItemStack(roach);
            stack.decrement(1);
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
                setStrain();
                Strains.effects((PlayerEntity) user, strain.getPath(), 0);
            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }

}
