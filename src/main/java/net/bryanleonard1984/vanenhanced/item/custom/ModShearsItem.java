package net.bryanleonard1984.vanenhanced.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.bryanleonard1984.wileslib.util.utils;

public class ModShearsItem extends ShearsItem
{
    public ModShearsItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack)
    {
        return utils.setDamageOnCraft(stack);
    }
}
