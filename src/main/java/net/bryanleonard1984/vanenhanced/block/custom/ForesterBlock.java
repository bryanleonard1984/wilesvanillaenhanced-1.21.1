package net.bryanleonard1984.vanenhanced.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ForesterBlock extends HorizontalFacingBlock
{
    public static final MapCodec<ForesterBlock> CODEC = createCodec(ForesterBlock::new);

    public ForesterBlock(Settings settings) {super(settings);}

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {return CODEC;}

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {builder.add(FACING);}

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    public static VoxelShape FORESTER_SHAPE = VoxelShapes.union(
      Block.createCuboidShape(0.0f, 0.0f, 0.0f, 16.0f, 2.0f, 16.0f),
      Block.createCuboidShape(2.0f, 2.0f, 2.0f, 14.0f, 4.0f, 14.0f)
    );

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return FORESTER_SHAPE;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return FORESTER_SHAPE;
    }
}
