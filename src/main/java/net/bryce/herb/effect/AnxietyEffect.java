package net.bryce.herb.effect;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKey;

import javax.swing.text.html.parser.Entity;
import java.util.Random;

public class AnxietyEffect extends StatusEffect {
    public AnxietyEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        int chance = new Random().nextInt(500);
        if (chance == amplifier)
        {
            PhantomEntity phantom = new PhantomEntity(EntityType.PHANTOM, entity.getWorld());
            phantom.setPos(entity.getX(), entity.getY()+5, entity.getZ());
            entity.getWorld().spawnEntity(phantom);
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
