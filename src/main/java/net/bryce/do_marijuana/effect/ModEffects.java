package net.bryce.do_marijuana.effect;

import net.bryce.do_marijuana.Lets_do_marijuana;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final HighEffect high = new HighEffect(StatusEffectCategory.BENEFICIAL, 0);
    public static final DrowsyEffect drowsy = new DrowsyEffect(StatusEffectCategory.NEUTRAL, 374577);
    public static final FocusedEffect focused = new FocusedEffect(StatusEffectCategory.BENEFICIAL, 678447);
    public static final RelaxedEffect relaxed = new RelaxedEffect(StatusEffectCategory.BENEFICIAL, 403151);

    public static void registerEffects(){
        Lets_do_marijuana.LOGGER.info("Registering Mod Effects");
        Registry.register(Registries.STATUS_EFFECT, new Identifier("do_marijuana", "high"), high);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("do_marijuana", "drowsy"), drowsy).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("do_marijuana", "focused"), focused).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("do_marijuana", "relaxed"), relaxed);
    }
}
