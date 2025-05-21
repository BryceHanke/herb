package net.bryce.herb.item.custom.base;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class Jar_Item extends Item {
    public Jar_Item(Settings settings) {
        super(settings);
    }

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
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        stack.setDamage(stack.getDamage() + 1);

        if (stack.getDamage() >= stack.getMaxDamage())
        {
            setStrain();
            PlayerEntity player = (PlayerEntity)entity;
            ItemStack cured_jar = new ItemStack(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain)+"_jar_of_cured")));
            player.giveItemStack(cured_jar);
            stack.decrement(1);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
