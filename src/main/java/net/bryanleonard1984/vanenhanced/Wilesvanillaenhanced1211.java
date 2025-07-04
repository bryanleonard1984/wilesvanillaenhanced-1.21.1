package net.bryanleonard1984.vanenhanced;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItemGroups;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wilesvanillaenhanced1211 implements ModInitializer
{
	public static final String MOD_ID = "vanenhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerModItemGroups();

		Registry.register(Registries.ITEM, Identifier.of("minecraft", "shears"), ModItems.MOD_SHEARS);
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.TINY_CHARCOAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.TINY_COAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.CRUSHED_COAL, 1600);
	}
}