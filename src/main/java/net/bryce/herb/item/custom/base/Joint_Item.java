package net.bryce.herb.item.custom.base;

import net.bryce.herb.strains.Strains;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Joint_Item extends Item {
    public Joint_Item(Settings settings) {super(settings);}

    public Identifier strain = Strains.strains[0];

    public void setStrain()
    {
        for (Identifier id : Strains.strains)
        {
            if (String.valueOf(this).contains(String.valueOf(id.getPath())))
            {
                strain = new Identifier("herb", String.valueOf(id.getPath()));
            }
        }
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks)
    {
        PlayerEntity player = (PlayerEntity)user;

        setStrain();
        ItemStack lit_joint = Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath()) + "_lit_joint")).getDefaultStack();
        player.giveItemStack(lit_joint);
        stack.decrement(1);

        super.usageTick(world, user, stack, remainingUseTicks);
    }

    public int getMaxUseTime(ItemStack stack) {
        return 64;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        stack.setDamage(stack.getDamage() + 1);
        return UseAction.TOOT_HORN;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {

        if (user.getOffHandStack().isOf(Items.FLINT_AND_STEEL))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        if(user.getOffHandStack().isOf(Items.FIRE_CHARGE))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        if(user.getOffHandStack().isOf(Items.LAVA_BUCKET))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        return TypedActionResult.fail(user.getStackInHand(hand));
    }
}
