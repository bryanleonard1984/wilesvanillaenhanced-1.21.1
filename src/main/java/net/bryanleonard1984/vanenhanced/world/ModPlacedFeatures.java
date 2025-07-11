package net.bryanleonard1984.vanenhanced.world;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> STONE = registerKey("stone");
    public static final RegistryKey<PlacedFeature> DEEPSLATE = registerKey("deepslate");

    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_PLACED = registerKey("quartz_ore_placed_key");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_LARGE_PLACED = registerKey("quartz_ore_large_placed");
    public static final RegistryKey<PlacedFeature> NETHER_COAL_ORE_PLACED = registerKey("nether_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_COPPER_ORE_PLACED = registerKey("nether_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_DIAMOND_ORE_PLACED = registerKey("nether_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_EMERALD_ORE_PLACED = registerKey("nether_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_IRON_ORE_PLACED = registerKey("nether_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_LAPIS_ORE_PLACED = registerKey("nether_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_REDSTONE_ORE_PLACED = registerKey("nether_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> END_COAL_ORE_PLACED = registerKey("end_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> END_COPPER_ORE_PLACED = registerKey("end_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> END_DIAMOND_ORE_PLACED = registerKey("end_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> END_EMERALD_ORE_PLACED = registerKey("end_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> END_GOLD_ORE_PLACED = registerKey("end_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> END_IRON_ORE_PLACED = registerKey("end_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> END_LAPIS_ORE_PLACED = registerKey("end_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> END_QUARTZ_ORE_PLACED = registerKey("end_quartz_ore_placed");
    public static final RegistryKey<PlacedFeature> END_REDSTONE_ORE_PLACED = registerKey("end_redstone_ore_placed");

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier)
    {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier)
    {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier)
    {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> stone = registryEntryLookup.getOrThrow(ModConfiguredFeatures.STONE);
        RegistryEntry<ConfiguredFeature<?, ?>> deepslate = registryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE);

        RegistryEntry<ConfiguredFeature<?, ?>> quartzOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> quartzOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherCoal = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_COAL_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherCopper = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_COPPER_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherDiamond = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_DIAMOND_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherEmerald = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_EMERALD_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherIron = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_IRON_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherLapis = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_LAPIS_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> netherRedstone = registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_REDSTONE_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endCoal = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_COAL_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endCopper = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_COPPER_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endDiamond = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_DIAMOND_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endEmerald = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_EMERALD_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endGold = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_GOLD_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endIron = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_IRON_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endLapis = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_LAPIS_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endQuartz = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_QUARTZ_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> endRedstone = registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_REDSTONE_ORE);

        register(context, STONE, stone, modifiersWithRarity(1, HeightRangePlacementModifier
                .uniform(YOffset.BOTTOM, YOffset.TOP)));
        register(context, DEEPSLATE, deepslate, modifiersWithRarity(1, HeightRangePlacementModifier
                .uniform(YOffset.BOTTOM, YOffset.TOP)));


        register(context, QUARTZ_ORE_PLACED, quartzOre, modifiersWithCount(5, HeightRangePlacementModifier
                .uniform(YOffset.fixed(-80), YOffset.fixed(35))));
        register(context, QUARTZ_ORE_LARGE_PLACED, quartzOreLarge, modifiersWithCount(15, HeightRangePlacementModifier
                .uniform(YOffset.fixed(-100), YOffset.fixed(50))));
        register(context, NETHER_COAL_ORE_PLACED, netherCoal, modifiersWithCount(20, HeightRangePlacementModifier
                .trapezoid(YOffset.aboveBottom(5), YOffset.belowTop(5))));
        register(context, NETHER_COPPER_ORE_PLACED, netherCopper, modifiersWithCount(20, HeightRangePlacementModifier
                .uniform(YOffset.fixed(0), YOffset.belowTop(10))));
        register(context, NETHER_DIAMOND_ORE_PLACED, netherDiamond, modifiersWithRarity(15, HeightRangePlacementModifier
                .trapezoid(YOffset.aboveBottom(10), YOffset.fixed(70))));
        register(context, NETHER_EMERALD_ORE_PLACED, netherEmerald, modifiersWithRarity(15, HeightRangePlacementModifier
                .trapezoid(YOffset.aboveBottom(5), YOffset.fixed(60))));
        register(context, NETHER_IRON_ORE_PLACED, netherIron, modifiersWithCount(20, HeightRangePlacementModifier
                .trapezoid(YOffset.fixed(40), YOffset.belowTop(10))));
        register(context, NETHER_LAPIS_ORE_PLACED, netherLapis, modifiersWithCount(17, HeightRangePlacementModifier
                .trapezoid(YOffset.fixed(40), YOffset.fixed(100))));
        register(context, NETHER_REDSTONE_ORE_PLACED, netherRedstone, modifiersWithCount(30, HeightRangePlacementModifier
                .trapezoid(YOffset.BOTTOM, YOffset.TOP)));
        register(context, END_COAL_ORE_PLACED, endCoal, modifiersWithCount(16,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_COPPER_ORE_PLACED, endCopper, modifiersWithCount(16,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_DIAMOND_ORE_PLACED, endDiamond, modifiersWithRarity(8,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_EMERALD_ORE_PLACED, endEmerald, modifiersWithRarity(6,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_GOLD_ORE_PLACED, endGold, modifiersWithCount(10,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_IRON_ORE_PLACED, endIron, modifiersWithCount(14,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_LAPIS_ORE_PLACED, endLapis, modifiersWithCount(16,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_QUARTZ_ORE_PLACED, endQuartz, modifiersWithCount(10,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));
        register(context, END_REDSTONE_ORE_PLACED, endRedstone, modifiersWithCount(11,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(60))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
    }

    public static RegistryKey<PlacedFeature> registerVanillaKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("minecraft", name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}
