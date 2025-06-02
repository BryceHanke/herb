package net.bryce.herb.strains;

import net.bryce.herb.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class Strains {

    public static final int duration = 4200;

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
                    new Identifier("herb", "mp"),
                    new Identifier("herb", "nf"),
                    new Identifier("herb", "vg"),
                    new Identifier("herb", "p420")
            };

    public static void effects(PlayerEntity user, String strain, Integer amplifier)
    {
        if (strain.equals("og"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
        }
        if (strain.equals("gdp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("rp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier+2));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("cp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, duration, amplifier));
        }
        if (strain.equals("gdk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier+1));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier+1));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier+1));
        }
        if (strain.equals("cd"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.tingly, duration, amplifier));
        }
        if (strain.equals("afg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
        }
        if (strain.equals("hk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
        }
        if (strain.equals("ak"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("wz"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("ag"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.energized, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, duration, amplifier));
        }
        if (strain.equals("cg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.focused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.energized, duration, amplifier));
        }
        if (strain.equals("s1"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, duration, amplifier));
        }
        if (strain.equals("ss"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("ww"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.sleepy, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("bd"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dryeyes, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.creative, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.euphoric, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.uplifted, duration, amplifier));
        }
        if (strain.equals("ukc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dryeyes, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.headache, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
        }
        if (strain.equals("lcg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.tingly, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("wc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.anxiety, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("afr"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("cbc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("bm"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("bk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("bp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("gsc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("sfv"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("fog"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("f1"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("db"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("ac"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("am"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("tk"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("smc"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
        if (strain.equals("mp"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("nf"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("vg"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.giggly, duration, amplifier));
        }
        if (strain.equals("p420"))
        {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.dizzy, duration / 4200, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.relaxed, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.aroused, duration, amplifier));
            user.addStatusEffect(new StatusEffectInstance(ModEffects.hungry, duration / 4000, amplifier));
        }
    }
}
