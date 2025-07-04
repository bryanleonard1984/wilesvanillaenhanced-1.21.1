package net.bryanleonard1984.vanenhanced.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;

public class ModShearsItem extends ShearsItem
{
    public ModShearsItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack)
    {
        if(stack.getDamage() < stack.getMaxDamage() - 1)
        {
            ItemStack moreDamaged = stack.copy();
            moreDamaged.setDamage(stack.getDamage() + 1);
            return moreDamaged;
        }
        return ItemStack.EMPTY;
    }
}
