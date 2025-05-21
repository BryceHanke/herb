package net.bryce.herb.item.custom.base;

import net.bryce.herb.effect.ModEffects;
import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Roach_Item extends Item {
    public Roach_Item(Settings settings) {
        super(settings);
    }

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
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
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
                Strains.effects((PlayerEntity) user, strain.getPath(), 1);
                stack.damage(1, user, player -> user.sendToolBreakStatus(user.getActiveHand()));
            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if (stack.isDamaged())
        {
            PlayerEntity player = (PlayerEntity) entity;
            stack.damage(1, player, user -> player.sendToolBreakStatus(player.getActiveHand()));
            if (stack.getDamage() >= stack.getMaxDamage())
            {
                stack.decrement(1);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
