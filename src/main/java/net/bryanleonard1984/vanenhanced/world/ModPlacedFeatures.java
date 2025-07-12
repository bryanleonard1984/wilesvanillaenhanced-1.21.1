package net.bryanleonard1984.vanenhanced.world;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.Objects;

public class ModPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> COAL_ORE_PLACED = registerKey("coal_ore_placed");
    public static final RegistryKey<PlacedFeature> COAL_ORE_LARGE_PLACED = registerKey("coal_ore_large_placed");
    public static final RegistryKey<PlacedFeature> COAL_ORE_SMALL_PLACED = registerKey("coal_ore_small_placed");
    public static final RegistryKey<PlacedFeature> COPPER_ORE_PLACED = registerKey("copper_ore_placed");
    public static final RegistryKey<PlacedFeature> COPPER_ORE_LARGE_PLACED = registerKey("copper_ore_large_placed");
    public static final RegistryKey<PlacedFeature> COPPER_ORE_SMALL_PLACED = registerKey("copper_ore_small_placed");
    public static final RegistryKey<PlacedFeature> DIAMOND_ORE_PLACED = registerKey("diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> DIAMOND_ORE_LARGE_PLACED = registerKey("diamond_ore_large_placed");
    public static final RegistryKey<PlacedFeature> DIAMOND_ORE_SMALL_PLACED = registerKey("diamond_ore_small_placed");
    public static final RegistryKey<PlacedFeature> EMERALD_ORE_PLACED = registerKey("emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ORE_PLACED = registerKey("gold_ore_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ORE_LARGE_PLACED = registerKey("gold_ore_large_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ORE_SMALL_PLACED = registerKey("gold_ore_small_placed");
    public static final RegistryKey<PlacedFeature> IRON_ORE_PLACED = registerKey("iron_ore_placed");
    public static final RegistryKey<PlacedFeature> IRON_ORE_LARGE_PLACED = registerKey("iron_ore_large_placed");
    public static final RegistryKey<PlacedFeature> IRON_ORE_SMALL_PLACED = registerKey("iron_ore_small_placed");
    public static final RegistryKey<PlacedFeature> LAPIS_ORE_PLACED = registerKey("lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> LAPIS_ORE_LARGE_PLACED = registerKey("lapis_ore_large_placed");
    public static final RegistryKey<PlacedFeature> LAPIS_ORE_SMALL_PLACED = registerKey("lapis_ore_small_placed");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_PLACED = registerKey("quartz_ore_placed_key");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_SMALL_PLACED = registerKey("quartz_ore_small_placed");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_LARGE_PLACED = registerKey("quartz_ore_large_placed");
    public static final RegistryKey<PlacedFeature> REDSTONE_ORE_PLACED = registerKey("redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> REDSTONE_ORE_LARGE_PLACED = registerKey("redstone_ore_large_placed");
    public static final RegistryKey<PlacedFeature> REDSTONE_ORE_SMALL_PLACED = registerKey("redstone_ore_small_placed");
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

    private static final String UNI = "uniform";
    private static final String TRA = "trapezoid";

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

        RegistryEntry<ConfiguredFeature<?, ?>> coalOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COAL_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> coalOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COAL_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> coalOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COAL_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> copperOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COPPER_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> copperOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COPPER_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> copperOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.COPPER_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.DIAMOND_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.DIAMOND_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.DIAMOND_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> emeraldOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.EMERALD_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> goldOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.GOLD_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> goldOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.GOLD_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> goldOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.GOLD_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> ironOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> ironOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> ironOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> lapisOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.LAPIS_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> lapisOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.LAPIS_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> lapisOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.LAPIS_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> quartzOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> quartzOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> quartzOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> redstoneOre = registryEntryLookup.getOrThrow(ModConfiguredFeatures.REDSTONE_ORE);
        RegistryEntry<ConfiguredFeature<?, ?>> redstoneOreLarge = registryEntryLookup.getOrThrow(ModConfiguredFeatures.REDSTONE_ORE_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> redstoneOreSmall = registryEntryLookup.getOrThrow(ModConfiguredFeatures.REDSTONE_ORE_SMALL);
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

        register(context, COAL_ORE_PLACED, coalOre, modifiersWithCount(30, setHeightRange(-45, 75, UNI)));
        register(context, COAL_ORE_LARGE_PLACED, coalOreLarge, modifiersWithCount(20, setHeightRange(-55, 55, UNI)));
        register(context, COAL_ORE_SMALL_PLACED, coalOreSmall, modifiersWithCount(15, setHeightRange(-35, 65, UNI)));
        register(context, COPPER_ORE_PLACED, copperOre, modifiersWithCount(28, setHeightRange(-50, 65, UNI)));
        register(context, COPPER_ORE_LARGE_PLACED, copperOreLarge, modifiersWithCount(19, setHeightRange(-55, 55, UNI)));
        register(context, COPPER_ORE_SMALL_PLACED, copperOreSmall, modifiersWithCount(15, setHeightRange(-35, 55, UNI)));
        register(context, DIAMOND_ORE_PLACED, diamondOre, modifiersWithCount(3, setHeightRange(-55, 15, TRA)));
        register(context, DIAMOND_ORE_LARGE_PLACED, diamondOreLarge, modifiersWithCount(5, setHeightRange(-55, 25, UNI)));
        register(context, DIAMOND_ORE_SMALL_PLACED, diamondOreSmall, modifiersWithRarity(2, setHeightRange(-55, 10, TRA)));
        register(context, EMERALD_ORE_PLACED, emeraldOre, modifiersWithCount(15, setHeightRange(-55, 65, UNI)));
        register(context, GOLD_ORE_PLACED, goldOre, modifiersWithCount(20, setHeightRange(-50, 35, UNI)));
        register(context, GOLD_ORE_LARGE_PLACED, goldOreLarge, modifiersWithCount(15, setHeightRange(-55, 40, UNI)));
        register(context, GOLD_ORE_SMALL_PLACED, goldOreSmall, modifiersWithCount(10, setHeightRange(-55, 30, TRA)));
        register(context, IRON_ORE_PLACED, ironOre, modifiersWithCount(25, setHeightRange(-40, 60, UNI)));
        register(context, IRON_ORE_LARGE_PLACED, ironOreLarge, modifiersWithCount(18, setHeightRange(-54, 50, UNI)));
        register(context, IRON_ORE_SMALL_PLACED, ironOreSmall, modifiersWithCount(10, setHeightRange(-34, 45, UNI)));
        register(context, LAPIS_ORE_PLACED, lapisOre, modifiersWithCount(20, setHeightRange(-29, 40, UNI)));
        register(context, LAPIS_ORE_LARGE_PLACED, lapisOreLarge, modifiersWithCount(17, setHeightRange(-40, 40, UNI)));
        register(context, LAPIS_ORE_SMALL_PLACED, lapisOreSmall, modifiersWithCount(10, setHeightRange(-25, 35, UNI)));
        register(context, QUARTZ_ORE_PLACED, quartzOre, modifiersWithCount(15, setHeightRange(-50, 35, UNI)));
        register(context, QUARTZ_ORE_SMALL_PLACED, quartzOreSmall, modifiersWithCount(10, setHeightRange(-50, 40, UNI)));
        register(context, QUARTZ_ORE_LARGE_PLACED, quartzOreLarge, modifiersWithCount(15, setHeightRange(-54, 50, UNI)));
        register(context, REDSTONE_ORE_PLACED, redstoneOre, modifiersWithCount(15, setHeightRange(-55, 25, UNI)));
        register(context, REDSTONE_ORE_LARGE_PLACED, redstoneOreLarge, modifiersWithCount(15, setHeightRange(-55,35, UNI)));
        register(context, REDSTONE_ORE_SMALL_PLACED, redstoneOreSmall, modifiersWithCount(10, setHeightRange(-55, 20, TRA)));
        register(context, NETHER_COAL_ORE_PLACED, netherCoal, modifiersWithCount(20, setHeightRange(5, 123, UNI)));
        register(context, NETHER_COPPER_ORE_PLACED, netherCopper, modifiersWithCount(20, setHeightRange(50, 118, UNI)));
        register(context, NETHER_DIAMOND_ORE_PLACED, netherDiamond, modifiersWithRarity(3, setHeightRange(10, 70, TRA)));
        register(context, NETHER_EMERALD_ORE_PLACED, netherEmerald, modifiersWithRarity(5, setHeightRange(5, 60, TRA)));
        register(context, NETHER_IRON_ORE_PLACED, netherIron, modifiersWithCount(20, setHeightRange(40, 118, UNI)));
        register(context, NETHER_LAPIS_ORE_PLACED, netherLapis, modifiersWithCount(17, setHeightRange(40, 100, UNI)));
        register(context, NETHER_REDSTONE_ORE_PLACED, netherRedstone, modifiersWithCount(30, setHeightRange(5, 123, UNI)));
        register(context, END_COAL_ORE_PLACED, endCoal, modifiersWithCount(16, setEndRange()));
        register(context, END_COPPER_ORE_PLACED, endCopper, modifiersWithCount(16, setEndRange()));
        register(context, END_DIAMOND_ORE_PLACED, endDiamond, modifiersWithRarity(3, setEndRange()));
        register(context, END_EMERALD_ORE_PLACED, endEmerald, modifiersWithRarity(5, setEndRange()));
        register(context, END_GOLD_ORE_PLACED, endGold, modifiersWithCount(10, setEndRange()));
        register(context, END_IRON_ORE_PLACED, endIron, modifiersWithCount(14, setEndRange()));
        register(context, END_LAPIS_ORE_PLACED, endLapis, modifiersWithCount(16, setEndRange()));
        register(context, END_QUARTZ_ORE_PLACED, endQuartz, modifiersWithCount(10, setEndRange()));
        register(context, END_REDSTONE_ORE_PLACED, endRedstone, modifiersWithCount(11, setEndRange()));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
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

    private static HeightRangePlacementModifier setHeightRange(int min, int max, String shape)
    {
        if(Objects.equals(shape, "uniform"))
        {
            return HeightRangePlacementModifier.uniform(YOffset.fixed(min), YOffset.fixed(max));
        }
        else
        {
            return HeightRangePlacementModifier.trapezoid(YOffset.fixed(min), YOffset.fixed(max));
        }

    }

    private static HeightRangePlacementModifier setEndRange()
    {
        return setHeightRange(0, 60, TRA);
    }
}
