package net.bryanleonard1984.vanenhanced.block.custom;


import net.minecraft.block.Block;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

public class TransformingBlock extends Block
{
    public TransformingBlock(Settings settings)
    {
        super(settings);
    }

    protected boolean isValidItem(ItemStack stack, TagKey<Item> itemTag)
    {
        return stack.isIn(itemTag);
    }

    protected void transformItem(ItemEntity entity, Item item, int count)
    {
        entity.setStack(new ItemStack(item, count));
    }

}
