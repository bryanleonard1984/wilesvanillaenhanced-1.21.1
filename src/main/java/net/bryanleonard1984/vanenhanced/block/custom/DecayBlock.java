package net.bryanleonard1984.vanenhanced.block.custom;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class DecayBlock extends TransformingBlock
{
    public DecayBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof ItemEntity itemEntity)
        {
            ItemStack stack = itemEntity.getStack();
            if(isValidItem(stack, ModTags.Items.DECAYABLE_ITEMS))
            {
                int count = stack.getCount();
                switch (stack.getTranslationKey())
                {
                    case "block.minecraft.cobweb":
                        transformItem(itemEntity, Items.STRING, count);
                        break;
                    case "item.minecraft.leather":
                        transformItem(itemEntity, Items.ROTTEN_FLESH, count);
                        break;
                    case "item.minecraft.spider_eye":
                        transformItem(itemEntity, Items.FERMENTED_SPIDER_EYE, count);
                        break;
                    default:
                        Wilesvanillaenhanced1211.LOGGER.info(stack.getTranslationKey());
                        break;
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options)
    {
        tooltip.add(Text.translatable("tooltip.vanenhanced.decay_block"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
