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
                    new Identifier("herb","wz"),
                    new Identifier("herb","ag"),
                    new Identifier("herb","cg"),
                    new Identifier("herb","s1"),
                    new Identifier("herb","ss"),
                    new Identifier("herb", "ww"),
                    new Identifier("herb", "bd"),
                    new Identifier("herb", "ukc"),
                    new Identifier("herb", "lcg"),
                    new Identifier("herb", "wc"),
                    new Identifier("herb", "afr"),
                    new Identifier("herb", "cbc"),
                    new Identifier("herb", "bm"),
                    new Identifier("herb", "bk"),
                    new Identifier("herb", "bp"),
                    new Identifier("herb", "mk"),
                    new Identifier("herb", "gsc"),
                    new Identifier("herb", "sfv"),
                    new Identifier("herb", "fog"),
                    new Identifier("herb", "f1"),
                    new Identifier("herb", "db"),
                    new Identifier("herb", "ac"),
                    new Identifier("herb", "am"),
                    new Identifier("herb", "tk"),
                    new Identifier("herb", "smc"),
                    new Identifier("herb", "mp")
            };

    public static void effects(PlayerEntity user, String strain, Integer amplifier)
    {
        if (strain.equals("og"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
        }
        if (strain.equals("gdp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
        }
        if (strain.equals("rp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier+2));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
        if (strain.equals("cp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("gdk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier+1));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier+1));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier+1));
        }
        if (strain.equals("cd"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.tingly, 500, amplifier));
        }
        if (strain.equals("afg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 100, amplifier));
        }
        if (strain.equals("hk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 100, amplifier));
        }
        if (strain.equals("ak"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 200, amplifier));
        }
        if (strain.equals("wz"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
        if (strain.equals("ag"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.energized, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
        }
        if (strain.equals("cg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.energized, 500, amplifier));
        }
        if (strain.equals("s1"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, 500, amplifier));
        }
        if (strain.equals("ss"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
        if (strain.equals("ww"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
        if (strain.equals("bd"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dryeyes, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.uplifted, 500, amplifier));
        }
        if (strain.equals("ukc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dryeyes, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.headache, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
        }
        if (strain.equals("lcg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.tingly, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
        if (strain.equals("wc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.anxiety, 50, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
        }
        if (strain.equals("afr"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 500, amplifier));
        }
        if (strain.equals("mp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, 100, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, 500, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, 500, amplifier));
        }
    }
}
