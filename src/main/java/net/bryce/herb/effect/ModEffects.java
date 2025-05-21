package net.bryce.herb.effect;

import net.bryce.herb.Herb;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModEffects {
    public static final HungryEffect hungry = new HungryEffect(StatusEffectCategory.NEUTRAL, 0);
    public static final SleepyEffect sleepy = new SleepyEffect(StatusEffectCategory.NEUTRAL, 374577);
    public static final FocusedEffect focused = new FocusedEffect(StatusEffectCategory.BENEFICIAL, 678447);
    public static final RelaxedEffect relaxed = new RelaxedEffect(StatusEffectCategory.BENEFICIAL, 403151);
    public static final EnergizedEffect energized = new EnergizedEffect(StatusEffectCategory.BENEFICIAL, Color.GREEN.getGreen());

    public static void registerEffects(){
        Herb.LOGGER.info("Registering Mod Effects");
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "hungry"), hungry);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "sleepy"), sleepy).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "focused"), focused).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "relaxed"), relaxed);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("herb", "energized"), energized).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
