package net.bryanleonard1984.vanenhanced.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;

public class BankBlock extends HorizontalFacingBlock
{
    public static final MapCodec<BankBlock> CODEC = createCodec(BankBlock::new);

    public BankBlock(Settings settings) {super(settings);}

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {return CODEC;}

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {builder.add(FACING);}

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
