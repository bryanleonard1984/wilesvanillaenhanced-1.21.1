package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
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

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DECAY_BLOCK,
                        ModBlocks.QUARTZ_ORE,
                        ModBlocks.DEEPSLATE_QUARTZ_ORE,
                        ModBlocks.NETHER_COAL_ORE,
                        ModBlocks.NETHER_IRON_ORE,
                        ModBlocks.NETHER_LAPIS_ORE,
                        ModBlocks.NETHER_COPPER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RECLAIM_BLOCK,
                        ModBlocks.NETHER_DIAMOND_ORE,
                        ModBlocks.NETHER_REDSTONE_ORE,
                        ModBlocks.END_COAL_ORE,
                        ModBlocks.END_COPPER_ORE,
                        ModBlocks.END_LAPIS_ORE,
                        ModBlocks.END_IRON_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHER_EMERALD_ORE,
                        ModBlocks.END_DIAMOND_ORE,
                        ModBlocks.END_EMERALD_ORE,
                        ModBlocks.END_GOLD_ORE,
                        ModBlocks.END_QUARTZ_ORE,
                        ModBlocks.END_REDSTONE_ORE);
    }
}
