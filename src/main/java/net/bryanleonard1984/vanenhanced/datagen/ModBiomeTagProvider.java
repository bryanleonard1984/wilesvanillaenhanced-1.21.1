package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends FabricTagProvider<Biome>
{
    public ModBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookup)
    {
        super(output, RegistryKeys.BIOME, lookup);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(ModTags.Biomes.IS_PLAINS)
                .add(BiomeKeys.PLAINS, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SUNFLOWER_PLAINS);

        getOrCreateTagBuilder(ModTags.Biomes.IS_SANDY)
                .add(BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.SNOWY_BEACH, BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS);

        getOrCreateTagBuilder(ModTags.Biomes.COAL_BIOMES)
                .add(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP, BiomeKeys.STONY_PEAKS);
    }
}
