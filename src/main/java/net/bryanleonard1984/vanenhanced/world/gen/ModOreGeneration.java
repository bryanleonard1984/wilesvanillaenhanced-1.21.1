package net.bryanleonard1984.vanenhanced.world.gen;

import net.bryanleonard1984.vanenhanced.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;



public class ModOreGeneration
{
    public static void generateOres()
    {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.STONE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BADLANDS, BiomeKeys.WOODED_BADLANDS,
                        BiomeKeys.ERODED_BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_LARGE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.DESERT, BiomeKeys.BADLANDS, BiomeKeys.WOODED_BADLANDS,
                        BiomeKeys.ERODED_BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_COAL_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_COPPER_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_EMERALD_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
               ModPlacedFeatures.NETHER_IRON_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_COAL_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_COPPER_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_DIAMOND_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_EMERALD_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_GOLD_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_IRON_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                  ModPlacedFeatures.END_LAPIS_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_QUARTZ_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_REDSTONE_ORE_PLACED);
    }
}
