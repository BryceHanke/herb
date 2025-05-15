package net.bryce.do_marijuana.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class JointItem extends Item {
    public JointItem(Settings settings) {
        super(settings);
    }

    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.TOOT_HORN;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        var player = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        stack.damage(2, user, (p) -> p.sendToolBreakStatus(user.getActiveHand()));

        if (!world.isClient)
        {


            ((ServerWorld) world).spawnParticles(ParticleTypes.ASH,
                    user.getX() + user.getRotationVector().x,
                    user.getY() + user.getEyeHeight(user.getPose()),
                    user.getZ() + user.getRotationVector().z, 25,
                    user.getRotationVector().x * 0.5,
                    0.0,
                    user.getRotationVector().z * 0.5,
                    0.0001);
        }

        return super.finishUsing(stack, world, user);
    }
}
