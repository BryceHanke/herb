package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class Bong_Item extends Smokable_Item{
    public Bong_Item(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 64;
    }

    @Override
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.CROSSBOW;
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks)
    {
        if (remainingUseTicks <= 1)
        {
            setStrain();
            Strains.effects((PlayerEntity) user, strain.getPath(), 2);
            stack.setDamage(stack.getDamage() + 1);

            if (!world.isClient)
            {
                ((ServerWorld) world).spawnParticles(ParticleTypes.CLOUD,
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

        if (remainingUseTicks <= 5)
        {
            if (!world.isClient)
            {
                ((ServerWorld) world).spawnParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,
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
        if (remainingUseTicks <= 10)
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
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if (stack.getDamage() >= stack.getMaxDamage())
        {
            ItemStack dirty_packed_straight_bong = ModItems.DIRTY_PACKED_STRAIGHT_BONG.getDefaultStack();
            dirty_packed_straight_bong.getOrCreateNbt().putString("strain", String.valueOf(strain.getPath()));
            stack.decrement(1);
            ((PlayerEntity) entity).giveItemStack(dirty_packed_straight_bong);
        }
    }

}
