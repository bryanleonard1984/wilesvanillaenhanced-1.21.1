package net.bryanleonard1984.vanenhanced.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.BlockStateComponent;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import java.util.function.ToIntFunction;

public class NetherExplorerBlock extends HorizontalFacingBlock
{
    protected static final MapCodec<MinerBlock> CODEC = createCodec(MinerBlock::new);
    public static final int explorerLightLevel = 10;
    public static final IntProperty LEVEL_15 = Properties.LEVEL_15;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> (Integer) state.get(LEVEL_15);

    public NetherExplorerBlock(AbstractBlock.Settings settings)
    {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(LEVEL_15, explorerLightLevel));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(LEVEL_15, FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {return CODEC;}

    @Override
    protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return addNbtForLevel(super.getPickStack(world, pos, state), (Integer)state.get(LEVEL_15));
    }

    public static ItemStack addNbtForLevel(ItemStack stack, int level) {
        if (level != 10) {
            stack.set(DataComponentTypes.BLOCK_STATE, BlockStateComponent.DEFAULT.with(LEVEL_15, level));
        }

        return stack;
    }
}
