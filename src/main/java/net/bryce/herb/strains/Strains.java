package net.bryce.herb.strains;

import net.bryce.herb.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class Strains {

    public static Identifier[] strains =
            {
                    new Identifier("herb","og"),
                    new Identifier("herb","gdp"),
                    new Identifier("herb","rp"),
                    new Identifier("herb","cp"),
                    new Identifier("herb","gdk"),
                    new Identifier("herb","cd"),
                    new Identifier("herb","afg"),
                    new Identifier("herb","hk"),
                    new Identifier("herb","ak"),
                    new Identifier("herb","wz")
            };

    public static void effects(PlayerEntity user, String strain, Integer amplifier)
    {
        if (strain.equals("og"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
        }
        if (strain.equals("gdp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
        }
        if (strain.equals("rp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("cp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("gdk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("cd"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("afg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("hk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("ak"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("wz"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
    }
}
