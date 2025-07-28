package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(ModTags.Items.DECAYABLE_ITEMS)
                .add(Items.LEATHER, Items.COBWEB, Items.SPIDER_EYE);

        getOrCreateTagBuilder(ModTags.Items.RECLAMABLE_ITEMS)
                .add(Items.ROTTEN_FLESH, Items.STRING, Items.FERMENTED_SPIDER_EYE);

        getOrCreateTagBuilder(ModTags.Items.HAMMERS)
                .add(ModItems.STONE_HAMMER, ModItems.IRON_HAMMER, ModItems.DIAMOND_HAMMER, ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ModTags.Items.CHISELS)
                .add(ModItems.IRON_CHISEL, ModItems.DIAMOND_CHISEL, ModItems.EMERALD_CHISEL, ModItems.NETHERITE_CHISEL);

        getOrCreateTagBuilder(ModTags.Items.SEEDS)
                .add(Items.BEETROOT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.WHEAT_SEEDS, Items.TORCHFLOWER_SEEDS);

        getOrCreateTagBuilder(ModTags.Items.GRASS)
                .add(Items.SHORT_GRASS, Items.TALL_GRASS, Items.FERN, Items.LARGE_FERN);

        getOrCreateTagBuilder(ModTags.Items.COINS)
                .add(ModItems.SMALL_COPPER_COIN, ModItems.COPPER_COIN, ModItems.SMALL_IRON_COIN, ModItems.IRON_COIN, ModItems.SMALL_GOLD_COIN, ModItems.GOLD_COIN);

        getOrCreateTagBuilder(ModTags.Items.LOGS)
                .add(Items.ACACIA_LOG, Items.BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG,
                        Items.DARK_OAK_LOG, Items.OAK_LOG, Items.SPRUCE_LOG);

        getOrCreateTagBuilder(ModTags.Items.STRIPPED_LOGS)
                .add(Items.STRIPPED_ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.STRIPPED_BIRCH_LOG, Items.STRIPPED_CHERRY_LOG, Items.STRIPPED_JUNGLE_LOG, Items.STRIPPED_MANGROVE_LOG,
                        Items.STRIPPED_DARK_OAK_LOG, Items.STRIPPED_OAK_LOG, Items.STRIPPED_SPRUCE_LOG);

        getOrCreateTagBuilder(ModTags.Items.WOODS)
                .add(Items.ACACIA_WOOD, Items.BAMBOO_MOSAIC, Items.BIRCH_WOOD, Items.CHERRY_WOOD, Items.JUNGLE_WOOD, Items.MANGROVE_WOOD,
                        Items.DARK_OAK_WOOD, Items.OAK_WOOD, Items.SPRUCE_WOOD);

        getOrCreateTagBuilder(ModTags.Items.STRIPPED_WOODS)
                .add(Items.STRIPPED_ACACIA_WOOD, Items.STRIPPED_BIRCH_WOOD, Items.STRIPPED_CHERRY_WOOD, Items.STRIPPED_JUNGLE_WOOD, Items.STRIPPED_MANGROVE_WOOD,
                        Items.STRIPPED_DARK_OAK_WOOD, Items.STRIPPED_OAK_WOOD, Items.STRIPPED_SPRUCE_WOOD);
    }
}
