package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).setReplace(false)
                .add(ModBlocks.DECAY_BLOCK,
                        ModBlocks.RECLAIM_BLOCK,
                        ModBlocks.QUARTZ_ORE,
                        ModBlocks.DEEPSLATE_QUARTZ_ORE,
                        ModBlocks.NETHER_COAL_ORE,
                        ModBlocks.NETHER_IRON_ORE,
                        ModBlocks.NETHER_DIAMOND_ORE,
                        ModBlocks.NETHER_EMERALD_ORE,
                        ModBlocks.NETHER_LAPIS_ORE,
                        ModBlocks.NETHER_REDSTONE_ORE,
                        ModBlocks.NETHER_COPPER_ORE,
                        ModBlocks.END_COAL_ORE,
                        ModBlocks.END_COPPER_ORE,
                        ModBlocks.END_DIAMOND_ORE,
                        ModBlocks.END_EMERALD_ORE,
                        ModBlocks.END_GOLD_ORE,
                        ModBlocks.END_IRON_ORE,
                        ModBlocks.END_LAPIS_ORE,
                        ModBlocks.END_QUARTZ_ORE,
                        ModBlocks.END_REDSTONE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).setReplace(false)
                .add(ModBlocks.DECAY_BLOCK,
                        ModBlocks.QUARTZ_ORE,
                        ModBlocks.DEEPSLATE_QUARTZ_ORE,
                        ModBlocks.NETHER_COAL_ORE,
                        ModBlocks.NETHER_IRON_ORE,
                        ModBlocks.NETHER_LAPIS_ORE,
                        ModBlocks.NETHER_COPPER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).setReplace(false)
                .add(ModBlocks.RECLAIM_BLOCK,
                        ModBlocks.NETHER_DIAMOND_ORE,
                        ModBlocks.NETHER_REDSTONE_ORE,
                        ModBlocks.END_COAL_ORE,
                        ModBlocks.END_COPPER_ORE,
                        ModBlocks.END_LAPIS_ORE,
                        ModBlocks.END_IRON_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).setReplace(false)
                .add(ModBlocks.NETHER_EMERALD_ORE,
                        ModBlocks.END_DIAMOND_ORE,
                        ModBlocks.END_EMERALD_ORE,
                        ModBlocks.END_GOLD_ORE,
                        ModBlocks.END_QUARTZ_ORE,
                        ModBlocks.END_REDSTONE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.OVERWORLD_ORES).setReplace(false)
                .add(Blocks.COAL_ORE, Blocks.COAL_BLOCK,
                        Blocks.IRON_ORE, Blocks.RAW_IRON_BLOCK,
                        Blocks.COPPER_ORE, Blocks.RAW_COPPER_BLOCK,
                        Blocks.DIAMOND_ORE,
                        Blocks.EMERALD_ORE,
                        Blocks.GOLD_ORE, Blocks.RAW_GOLD_BLOCK,
                        Blocks.LAPIS_ORE,
                        Blocks.REDSTONE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.DEEPSLATE_ORES).setReplace(false)
                .add(Blocks.DEEPSLATE_COAL_ORE, Blocks.COAL_BLOCK,
                        Blocks.DEEPSLATE_IRON_ORE, Blocks.RAW_IRON_BLOCK,
                        Blocks.DEEPSLATE_COPPER_ORE, Blocks.RAW_COPPER_BLOCK,
                        Blocks.DEEPSLATE_DIAMOND_ORE,
                        Blocks.DEEPSLATE_EMERALD_ORE,
                        Blocks.DEEPSLATE_GOLD_ORE, Blocks.RAW_GOLD_BLOCK,
                        Blocks.DEEPSLATE_LAPIS_ORE,
                        Blocks.DEEPSLATE_REDSTONE_ORE);
    }
}
