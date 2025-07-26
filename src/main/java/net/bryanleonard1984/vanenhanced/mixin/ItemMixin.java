package net.bryanleonard1984.vanenhanced.mixin;

import net.bryanleonard1984.vanenhanced.util.CopperPoints;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(Item.class)
public abstract class ItemMixin implements CopperPoints
{
	@Unique private int copperPoints = 0;

	@Override
	public int getCopperPoints()
	{
		return this.copperPoints;
	}

	@Override
	public void copperPoints(int copperPoints)
	{
		this.copperPoints = copperPoints;
	}
}