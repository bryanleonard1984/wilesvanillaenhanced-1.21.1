package net.bryanleonard1984.vanenhanced.block;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.custom.DecayBlock;
import net.bryanleonard1984.vanenhanced.block.custom.ReclaimBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks
{
    public static final Block RECLAIM_BLOCK = registerBlock("reclaim_block",
            new ReclaimBlock(AbstractBlock.Settings.create().strength(4.0f, 2.5f)
                    .luminance(state -> 15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DECAY_BLOCK = registerBlock("decay_block",
            new DecayBlock(AbstractBlock.Settings.create().strength(3.0f, 1.5f)
                    .requiresTool().sounds(BlockSoundGroup.MUD)));

    public static final Block QUARTZ_ORE = registerBlock("quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3.0f, 1.5f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(4.5f, 2.0f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block NETHER_COAL_ORE = registerBlock("nether_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 4),
                    AbstractBlock.Settings.create().strength(3.0f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_IRON_ORE = registerBlock("nether_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5),
                    AbstractBlock.Settings.create().strength(3.25f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,6),
                    AbstractBlock.Settings.create().strength(3.25f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_LAPIS_ORE = registerBlock("nether_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5),
                    AbstractBlock.Settings.create().strength(3.25f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_EMERALD_ORE = registerBlock("nether_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,7),
                    AbstractBlock.Settings.create().strength(3.25f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_REDSTONE_ORE = registerBlock("nether_redstone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5),
                    AbstractBlock.Settings.create().strength(3.25f, 1.75f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_COPPER_ORE = registerBlock("nether_copper_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,4),
                    AbstractBlock.Settings.create().strength(3, 4)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));

    public static final Block END_COAL_ORE = registerBlock("end_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_COPPER_ORE = registerBlock("end_copper_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_DIAMOND_ORE = registerBlock("end_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 7),
                    AbstractBlock.Settings.create().strength(3.25f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_EMERALD_ORE = registerBlock("end_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 8),
                    AbstractBlock.Settings.create().strength(3.25f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_GOLD_ORE = registerBlock("end_gold_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(4, 7),
                AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                        .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_IRON_ORE = registerBlock("end_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_LAPIS_ORE = registerBlock("end_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_QUARTZ_ORE = registerBlock("end_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_REDSTONE_ORE = registerBlock("end_redstone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3.0f, 2.0f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));



    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Registering Mod Blocks for " + Wilesvanillaenhanced1211.MOD_ID);
    }
}
