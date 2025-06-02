package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class Smokable_Item extends Item
{
    public Smokable_Item(Settings settings) {
        super(settings);
    }

    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.TOOT_HORN;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        if (user.getOffHandStack().isOf(Items.FLINT_AND_STEEL) || user.getOffHandStack().isOf(ModItems.LIT_LIGHTER))
        {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }

        return TypedActionResult.fail(user.getStackInHand(hand));
    }

    public Identifier strain = Strains.strains[0];

    public void setStrain()
    {
        for (Identifier id : Strains.strains)
        {
            if (String.valueOf(this).startsWith(String.valueOf(id.getPath())))
            {
                strain = new Identifier("herb", String.valueOf(id.getPath()));
            }
        }
    }

    public boolean filtered = false;

    public void set_Filtered()
    {
        if (String.valueOf(this).contains("filter"))
        {
            filtered = true;
        }
    }
}
