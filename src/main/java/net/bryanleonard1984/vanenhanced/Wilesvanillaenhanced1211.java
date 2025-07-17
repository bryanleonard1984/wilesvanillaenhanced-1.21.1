package net.bryanleonard1984.vanenhanced;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItemGroups;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.world.gen.ModWorldGeneration;
import net.bryanleonard1984.wileslib.block.BlockBuilderLib;
import net.bryanleonard1984.wileslib.item.ItemBuilderLib;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wilesvanillaenhanced1211 implements ModInitializer
{
	public static final String MOD_ID = "vanenhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ItemBuilderLib itemBuilder = new ItemBuilderLib(LOGGER, MOD_ID);
		BlockBuilderLib blockBuilder = new BlockBuilderLib(MOD_ID, LOGGER);

		ModItemGroups.registerModItemGroups();

		blockBuilder.registerModBlocks();
		ModBlocks.registerModBlocks();
		itemBuilder.registerModItems();

		ModWorldGeneration.generateModWorldGeneration();

		FuelRegistry.INSTANCE.add(ModItems.TINY_CHARCOAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.TINY_COAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.CRUSHED_COAL, 1600);
	}
}