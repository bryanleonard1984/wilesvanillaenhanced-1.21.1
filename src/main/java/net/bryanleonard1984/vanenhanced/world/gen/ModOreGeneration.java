package net.bryanleonard1984.vanenhanced.world.gen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.bryanleonard1984.vanenhanced.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.function.Predicate;


public class ModOreGeneration
{
    private static final GenerationStep.Feature UNDERGROUND_ORES = GenerationStep.Feature.UNDERGROUND_ORES;

    public static void generateOres()
    {
        Predicate<BiomeSelectionContext> nether = BiomeSelectors.foundInTheNether();
        Predicate<BiomeSelectionContext> end = BiomeSelectors.foundInTheEnd();

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.STONY_PEAKS),
                UNDERGROUND_ORES, ModPlacedFeatures.IRON_ORE_LARGE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.IS_PLAINS), UNDERGROUND_ORES, ModPlacedFeatures.IRON_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.DESERT, BiomeKeys.STONY_PEAKS), UNDERGROUND_ORES, ModPlacedFeatures.IRON_ORE_SMALL_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS),
                UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_LARGE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.IS_PLAINS), UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.DESERT, BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS),
                UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_SMALL_PLACED);

        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_COAL_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_COPPER_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_EMERALD_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_IRON_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED);
        addOreFeatureBySelector(nether, ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED);

        addOreFeatureBySelector(end, ModPlacedFeatures.END_COAL_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_COPPER_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_DIAMOND_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_EMERALD_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_GOLD_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_IRON_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_LAPIS_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_QUARTZ_ORE_PLACED);
        addOreFeatureBySelector(end, ModPlacedFeatures.END_REDSTONE_ORE_PLACED);
    }

    public static void removeOres()
    {
        BiomeModifications.create(Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "remove_ores"))
                .add(ModificationPhase.REMOVALS, ctx -> BiomeSelectors.foundInOverworld().test(ctx),
                        (BiomeModificationContext context) ->
                        {
                            removeOreFeature(context, OrePlacedFeatures.ORE_COPPER);
                            removeOreFeature(context, OrePlacedFeatures.ORE_COPPER_LARGE);
                            removeOreFeature(context, OrePlacedFeatures.ORE_COAL_UPPER);
                            removeOreFeature(context, OrePlacedFeatures.ORE_COAL_LOWER);
                            removeOreFeature(context, OrePlacedFeatures.ORE_DIAMOND);
                            removeOreFeature(context, OrePlacedFeatures.ORE_DIAMOND_LARGE);
                            removeOreFeature(context, OrePlacedFeatures.ORE_DIAMOND_MEDIUM);
                            removeOreFeature(context, OrePlacedFeatures.ORE_DIAMOND_BURIED);
                            removeOreFeature(context, OrePlacedFeatures.ORE_EMERALD);
                            removeOreFeature(context, OrePlacedFeatures.ORE_GOLD);
                            removeOreFeature(context, OrePlacedFeatures.ORE_GOLD_EXTRA);
                            removeOreFeature(context, OrePlacedFeatures.ORE_GOLD_LOWER);
                            removeOreFeature(context, OrePlacedFeatures.ORE_IRON_MIDDLE);
                            removeOreFeature(context, OrePlacedFeatures.ORE_IRON_SMALL);
                            removeOreFeature(context, OrePlacedFeatures.ORE_IRON_UPPER);
                            removeOreFeature(context, OrePlacedFeatures.ORE_LAPIS);
                            removeOreFeature(context, OrePlacedFeatures.ORE_LAPIS_BURIED);
                            removeOreFeature(context, OrePlacedFeatures.ORE_REDSTONE);
                            removeOreFeature(context, OrePlacedFeatures.ORE_REDSTONE_LOWER);
                        });
    }

    private static void removeOreFeature(BiomeModificationContext context, RegistryKey<PlacedFeature> oreFeatures)
    {
        context.getGenerationSettings().removeFeature(UNDERGROUND_ORES, oreFeatures);
    }

    private static void addOreFeatureBySelector(Predicate<BiomeSelectionContext> selector, RegistryKey<PlacedFeature> modPlacedFeatures)
    {
        BiomeModifications.addFeature(selector, UNDERGROUND_ORES, modPlacedFeatures);
    }
}
