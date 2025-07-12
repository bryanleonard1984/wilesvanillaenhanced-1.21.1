package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends FabricTagProvider<Biome>
{
    public static final TagKey<Biome> MOD_BIOME_TAGS = TagKey.of(RegistryKeys.BIOME, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "mod_biome_tags"));

    public ModBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookup)
    {
        super(output, RegistryKeys.BIOME, lookup);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(MOD_BIOME_TAGS)
                .add(BiomeKeys.PLAINS, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SUNFLOWER_PLAINS);
    }
}
