package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
    }
}
