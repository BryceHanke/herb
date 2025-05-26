package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Joint_Item extends Smokable_Item {
    public Joint_Item(Settings settings) {super(settings);}

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player)
    {
        setStrain();
        stack.getOrCreateNbt().putString("strain", String.valueOf(this.strain));
        set_Filtered();
        stack.getOrCreateNbt().putString("filter", String.valueOf(this.filtered));
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks)
    {
        if (remainingUseTicks <= 1) {
            stack.setDamage(stack.getDamage() + 1);
            light_Joint(user, stack);
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        if (user.getOffHandStack().isOf(Items.FLINT_AND_STEEL) || user.getOffHandStack().isOf(ModItems.LIGHTER))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        return TypedActionResult.fail(user.getStackInHand(hand));
    }


    public void light_Joint(Entity user, ItemStack stack)
    {
        PlayerEntity player = (PlayerEntity)user;

        setStrain();
        set_Filtered();
        ItemStack lit_joint = Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath()) + "_lit_joint")).getDefaultStack();
        ItemStack filtered_lit_joint = Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath()) + "_filtered_lit_joint")).getDefaultStack();
        lit_joint.getOrCreateNbt().putString("strain", String.valueOf(strain.getPath()));
        filtered_lit_joint.getOrCreateNbt().putString("strain", String.valueOf(strain.getPath()));
        if (this.filtered)
        {
            filtered_lit_joint.setDamage(stack.getDamage());
            stack.decrement(1);
            player.giveItemStack(filtered_lit_joint);
        }else {
            lit_joint.setDamage(stack.getDamage());
            stack.decrement(1);
            player.giveItemStack(lit_joint);
        }

        ((PlayerEntity) user).getOffHandStack().setDamage(((PlayerEntity) user).getOffHandStack().getDamage() + 1);

    }
}
