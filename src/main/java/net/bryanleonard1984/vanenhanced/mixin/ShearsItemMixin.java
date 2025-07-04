package net.bryanleonard1984.vanenhanced.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ShearsItem.class)
public class ShearsItemMixin
{
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
