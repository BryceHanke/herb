package net.bryce.herb.item.custom.base;

import net.bryce.herb.Herb;
import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class Pipe_Item extends Smokable_Item {
    public Pipe_Item(Settings settings) {super(settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if (stack.getDamage() >= stack.getMaxDamage())
        {
            ItemStack dirty_pipe = ModItems.DIRTY_GLASS_PIPE.getDefaultStack();
            ((PlayerEntity) entity).giveItemStack(dirty_pipe);
            stack.decrement(1);
        }
    }

    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        if (remainingUseTicks <= 1)
        {
            setStrain();
            Strains.effects((PlayerEntity) user, strain.getPath(), 0);
            Herb.LOGGER.info(strain.getPath());
            stack.setDamage(stack.getDamage() + 1);
        }
        if (remainingUseTicks <= 10)
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
    }
}
