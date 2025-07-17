package net.bryanleonard1984.vanenhanced.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.bryanleonard1984.wileslib.util.utils;

import java.util.List;

public class HammerItem extends Item
{
    public HammerItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack)
    {
        return utils.setDamageOnCraft(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
    {
        if(Screen.hasShiftDown())
        {
            tooltip.add(Text.translatable("tooltip.vanenhanced.hammer.shiftdown"));
        }
        else
        {
            tooltip.add(Text.translatable("tooltip.vanenhanced.hammer"));
        }
    }
}
