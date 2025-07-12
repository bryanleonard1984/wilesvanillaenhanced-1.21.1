package net.bryanleonard1984.vanenhanced.world;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> COAL_ORE = registerKey("coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COAL_ORE_LARGE = registerKey("coal_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COAL_ORE_SMALL = registerKey("coal_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_ORE = registerKey("copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_ORE_LARGE = registerKey("copper_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_ORE_SMALL = registerKey("copper_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIAMOND_ORE =registerKey("diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIAMOND_ORE_LARGE = registerKey("diamond_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIAMOND_ORE_SMALL = registerKey("diamond_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EMERALD_ORE = registerKey("emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLD_ORE = registerKey("gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLD_ORE_LARGE = registerKey("gold_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLD_ORE_SMALL = registerKey("gold_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRON_ORE_SMALL = registerKey("iron_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRON_ORE = registerKey("iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRON_ORE_LARGE = registerKey("iron_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPIS_ORE = registerKey("lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPIS_ORE_LARGE = registerKey("lapis_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPIS_ORE_SMALL = registerKey("lapis_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE = registerKey("quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_SMALL = registerKey("quartz_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_LARGE = registerKey("quartz_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDSTONE_ORE = registerKey("redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDSTONE_ORE_LARGE = registerKey("redstone_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDSTONE_ORE_SMALL = registerKey("redstone_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE = registerKey("nether_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE = registerKey("nether_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE = registerKey("nether_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE = registerKey("nether_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE = registerKey("nether_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE = registerKey("nether_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE = registerKey("nether_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COAL_ORE = registerKey("end_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE = registerKey("end_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_IRON_ORE = registerKey("end_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE = registerKey("end_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORE = registerKey("end_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE = registerKey("end_redstone_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceables = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest deepslateReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest netherReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCopperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.COPPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldEmeraldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGoldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldIronOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLapisOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.QUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRedstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, Blocks.REDSTONE_ORE.getDefaultState()),
                    OreFeatureConfig.createTarget(deepslateReplaceables, Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCoalOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherCopperOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherDiamondOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherEmeraldOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables,ModBlocks.NETHER_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherIronOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherLapisOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRedstoneOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endCoalOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endCopperOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endDiamondOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endEmeraldOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endGoldOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endIronOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endLapisOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endQuartzOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endRedstoneOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_REDSTONE_ORE.getDefaultState()));

        register(context, COAL_ORE, Feature.ORE, new OreFeatureConfig(overworldCoalOres, 20));
        register(context, COAL_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldCoalOres, 40));
        register(context, COAL_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldCoalOres, 12));
        register(context, COPPER_ORE, Feature.ORE, new OreFeatureConfig(overworldCopperOres, 18));
        register(context, COPPER_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldCopperOres, 30));
        register(context, COPPER_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldCopperOres, 10));
        register(context, DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(overworldDiamondOres, 10, 0.25f));
        register(context, DIAMOND_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldDiamondOres, 18, 0.15f));
        register(context, DIAMOND_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldDiamondOres, 6, 0.85f));
        register(context, EMERALD_ORE, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldEmeraldOres, 6, 1.0f));
        register(context, GOLD_ORE, Feature.ORE, new OreFeatureConfig(overworldGoldOres, 12));
        register(context, GOLD_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldGoldOres, 30));
        register(context, GOLD_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldGoldOres, 8));
        register(context, IRON_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldIronOres, 8));
        register(context, IRON_ORE, Feature.ORE, new OreFeatureConfig(overworldIronOres, 16));
        register(context, IRON_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldIronOres, 35));
        register(context, LAPIS_ORE, Feature.ORE, new OreFeatureConfig(overworldLapisOres, 12));
        register(context, LAPIS_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldLapisOres, 32));
        register(context, LAPIS_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldLapisOres, 10, 0.35f));
        register(context, QUARTZ_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldQuartzOres, 6));
        register(context, QUARTZ_ORE, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 14));
        register(context, QUARTZ_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 30));
        register(context, REDSTONE_ORE, Feature.ORE, new OreFeatureConfig(overworldRedstoneOres, 12));
        register(context, REDSTONE_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldRedstoneOres, 35, 0.25f));
        register(context, REDSTONE_ORE_SMALL, Feature.SCATTERED_ORE, new OreFeatureConfig(overworldRedstoneOres, 8, 0.55f));

        register(context, NETHER_COAL_ORE, Feature.ORE, new OreFeatureConfig(netherCoalOres, 18));
        register(context, NETHER_COPPER_ORE, Feature.ORE, new OreFeatureConfig(netherCopperOres, 15));
        register(context, NETHER_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(netherDiamondOres, 8));
        register(context, NETHER_EMERALD_ORE, Feature.ORE, new OreFeatureConfig(netherEmeraldOres, 6));
        register(context, NETHER_IRON_ORE, Feature.ORE, new OreFeatureConfig(netherIronOres, 12));
        register(context, NETHER_LAPIS_ORE, Feature.ORE, new OreFeatureConfig(netherLapisOres, 12));
        register(context, NETHER_REDSTONE_ORE, Feature.ORE, new OreFeatureConfig(netherRedstoneOres, 10));

        register(context, END_COAL_ORE, Feature.ORE, new OreFeatureConfig(endCoalOres, 15));
        register(context, END_COPPER_ORE, Feature.ORE, new OreFeatureConfig(endCopperOres, 10));
        register(context, END_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(endDiamondOres, 6));
        register(context, END_EMERALD_ORE, Feature.ORE, new OreFeatureConfig(endEmeraldOres, 4));
        register(context, END_GOLD_ORE, Feature.ORE, new OreFeatureConfig(endGoldOres, 8));
        register(context, END_IRON_ORE, Feature.ORE, new OreFeatureConfig(endIronOres, 10));
        register(context, END_LAPIS_ORE, Feature.ORE, new OreFeatureConfig(endLapisOres, 8));
        register(context, END_QUARTZ_ORE, Feature.ORE, new OreFeatureConfig(endQuartzOres, 10));
        register(context, END_REDSTONE_ORE, Feature.ORE, new OreFeatureConfig(endRedstoneOres, 6));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>>
                                       context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
