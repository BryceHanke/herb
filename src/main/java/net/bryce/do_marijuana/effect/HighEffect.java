package net.bryce.do_marijuana.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Random;

public class HighEffect extends StatusEffect {
    public HighEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        int chance = new Random().nextInt(5) + 1;
        if (chance == amplifier)
        {
            PlayerEntity player = (PlayerEntity) entity;
            player.getHungerManager().setFoodLevel(player.getHungerManager().getFoodLevel() - (1+amplifier));
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
