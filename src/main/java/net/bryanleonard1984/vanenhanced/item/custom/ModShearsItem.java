package net.bryanleonard1984.vanenhanced.item.custom;

import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;

import static net.bryanleonard1984.wileslib.util.utils.setDamageOnCraft;

public class ModShearsItem extends ShearsItem
{
    public ModShearsItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack)
    {
        return setDamageOnCraft(stack);
    }

    public static Item createModShearsItem(String id, String name, Item item)
    {
        return ModItems.registerItem(id, name, new ModShearsItem(new Settings().recipeRemainder(item)));
    }
}
