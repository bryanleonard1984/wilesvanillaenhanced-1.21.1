package net.bryanleonard1984.vanenhanced.mixin;

import net.bryanleonard1984.vanenhanced.item.ItemAccessable;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Item.Settings.class)
public class ItemSettingMixin implements ItemAccessable
{
	@Unique private int copperPoints = 0;

	@Override public Item.Settings wilesvanillaenhanced_1_21_1$setCopperPoints(int copperPoints)
	{
		this.copperPoints = copperPoints;
		return (Item.Settings)(Object) this;
	}

	@Override public int wilesvanillaenhanced_1_21_1$getCopperPoints() {return this.copperPoints;}
}