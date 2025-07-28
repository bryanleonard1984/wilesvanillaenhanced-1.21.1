package net.bryanleonard1984.vanenhanced.mixin;

import net.bryanleonard1984.vanenhanced.util.CopperPoints;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Block.class)
public class BlockMixin implements CopperPoints
{
	@Unique private int copperPoints = 0;

	@Override
	public int getCopperPoints() {return this.copperPoints;}

	@Override
	public void copperPoints(int copperPoints) {this.copperPoints = copperPoints;}
}