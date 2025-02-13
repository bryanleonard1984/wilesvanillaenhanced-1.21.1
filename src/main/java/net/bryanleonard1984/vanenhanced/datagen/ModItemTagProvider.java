package net.bryanleonard1984.vanenhanced.datagen;

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
                .add(Items.LEATHER)
                .add(Items.COBWEB)
                .add(Items.SPIDER_EYE);

        getOrCreateTagBuilder(ModTags.Items.RECLAMABLE_ITEMS)
                .add(Items.ROTTEN_FLESH)
                .add(Items.STRING)
                .add(Items.FERMENTED_SPIDER_EYE);
    }
}
