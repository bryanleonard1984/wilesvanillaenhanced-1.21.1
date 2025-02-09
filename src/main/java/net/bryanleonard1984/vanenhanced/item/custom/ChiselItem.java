package net.bryanleonard1984.vanenhanced.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ChiselItem extends Item
{
    private static final Map<Block, Block> CHISEL_MAP = Map.of
            (
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS,
                    Blocks.CRACKED_STONE_BRICKS, Blocks.COBBLESTONE,
                    Blocks.COBBLESTONE, Blocks.STONE
            );

    public ChiselItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context)
    {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Block clickedBlock = world.getBlockState(blockPos).getBlock();
        if(CHISEL_MAP.containsKey(clickedBlock))
        {
            if(!world.isClient() && context.getPlayer() != null)
            {
                ServerPlayerEntity player = (ServerPlayerEntity) context.getPlayer();
                world.setBlockState(blockPos, CHISEL_MAP.get(clickedBlock).getDefaultState());
                context.getStack().damage(1, (ServerWorld) world, player,
                        item -> player.sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, blockPos, SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
    {
        if(Screen.hasShiftDown())
        {
            tooltip.add(Text.translatable("tooltip.vanenhanced.chisel.shiftdown"));
        }
        else
        {
            tooltip.add(Text.translatable("tooltip.vanenhanced.chisel"));
        }
    }
}
