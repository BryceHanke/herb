package net.bryce.herb.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKey;

import java.util.Random;

public class HeadacheEffect extends StatusEffect {
    public HeadacheEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        int chance = new Random().nextInt(500);
        if (chance == amplifier)
        {
            PlayerEntity player = (PlayerEntity) entity;
            RegistryKey<DamageType> RegistryEntry = null;
            player.damage(new DamageSources(entity.getEntityWorld().getRegistryManager()).starve(), 1);
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
