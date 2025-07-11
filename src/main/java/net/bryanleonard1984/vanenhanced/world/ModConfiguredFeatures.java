package net.bryanleonard1984.vanenhanced.world;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE = registerKey("stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE = registerKey("deepslate");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE = registerKey("quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_LARGE = registerKey("quartz_ore_large");
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
        RuleTest oreReplaceables = new TagMatchRuleTest(ModTags.Blocks.OVERWORLD_ORES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(ModTags.Blocks.DEEPSLATE_ORES);
        RuleTest stoneReplaceables = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest deepslateReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest netherReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.QUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOres =
                List.of(OreFeatureConfig.createTarget(oreReplaceables, Blocks.STONE.getDefaultState()));
        List<OreFeatureConfig.Target> deepslateOres =
                List.of(OreFeatureConfig.createTarget(deepslateOreReplaceables, Blocks.DEEPSLATE.getDefaultState()));

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

        register(context, STONE, Feature.ORE, new OreFeatureConfig(overworldOres, 20));
        register(context, DEEPSLATE, Feature.ORE, new OreFeatureConfig(deepslateOres, 20));

        register(context, QUARTZ_ORE, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 6));
        register(context, QUARTZ_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 30));

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

    public static RegistryKey<ConfiguredFeature<?, ?>> registerVanillaKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of("minecraft", name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>>
                                       context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
