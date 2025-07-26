package net.bryanleonard1984.vanenhanced;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.command.ItemCopperPointsValueCommand;
import net.bryanleonard1984.vanenhanced.command.ReturnHomeCommand;
import net.bryanleonard1984.vanenhanced.command.SetHomeCommand;
import net.bryanleonard1984.vanenhanced.event.PlayerCopyHandler;
import net.bryanleonard1984.vanenhanced.item.ModItemGroups;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.world.gen.ModWorldGeneration;
import net.bryanleonard1984.wileslib.block.BlockBuilderLib;
import net.bryanleonard1984.wileslib.item.ItemBuilderLib;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
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
		ModItems modItems = new ModItems();

		ModItemGroups.registerModItemGroups();
		modItems.initializeCopperPoints();

		blockBuilder.registerModBlocks();
		ModBlocks.registerModBlocks();
		itemBuilder.registerModItems();

		ModWorldGeneration.generateModWorldGeneration();

		FuelRegistry.INSTANCE.add(ModItems.TINY_CHARCOAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.TINY_COAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.CRUSHED_COAL, 1600);

		CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
		CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
		CommandRegistrationCallback.EVENT.register(ItemCopperPointsValueCommand::register);
		ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
	}
}