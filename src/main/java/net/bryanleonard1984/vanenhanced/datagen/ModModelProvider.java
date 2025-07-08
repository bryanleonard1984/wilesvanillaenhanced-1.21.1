package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RECLAIM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_REDSTONE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.IRON_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOK_ENCHANTMENT_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TINY_CHARCOAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TINY_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_COPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_GOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.GENERATED);
    }
}
