package net.bryanleonard1984.vanenhanced;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItemGroups;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}