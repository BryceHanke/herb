package net.bryce.herb.effect;

import net.bryce.herb.Herb;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModEffects {
    public static final HungryEffect hungry = new HungryEffect(StatusEffectCategory.NEUTRAL, 14068317);
    public static final SleepyEffect sleepy = new SleepyEffect(StatusEffectCategory.HARMFUL, 8284092);
    public static final FocusedEffect focused = new FocusedEffect(StatusEffectCategory.BENEFICIAL, 6739199);
    public static final RelaxedEffect relaxed = new RelaxedEffect(StatusEffectCategory.BENEFICIAL, 14053277);
    public static final EnergizedEffect energized = new EnergizedEffect(StatusEffectCategory.BENEFICIAL, 9830107);
    public static final GigglyEffect giggly = new GigglyEffect(StatusEffectCategory.NEUTRAL, 15820950);
    public static final EuphoricEffect euphoric = new EuphoricEffect(StatusEffectCategory.BENEFICIAL, 14144633);
    public static final ArousedEffect aroused = new ArousedEffect(StatusEffectCategory.NEUTRAL, 14144633);
    public static final TinglyEffect tingly = new TinglyEffect(StatusEffectCategory.NEUTRAL, 14144633);

    public static void registerEffects(){
        Herb.LOGGER.info("Registering Mod Effects");
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "hungry"), hungry);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "sleepy"), sleepy).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "focused"), focused).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "relaxed"), relaxed);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "energized"), energized).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "giggly"), giggly).addAttributeModifier(EntityAttributes.GENERIC_LUCK,"03C3C89D-7037-4B42-869F-B146BCB64D2E", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "euphoric"), euphoric).addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "tingly"), tingly);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "aroused"), aroused).addAttributeModifier(EntityAttributes.GENERIC_FOLLOW_RANGE, "CC5AF142-2BD2-4215-B636-2605AED11727", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
