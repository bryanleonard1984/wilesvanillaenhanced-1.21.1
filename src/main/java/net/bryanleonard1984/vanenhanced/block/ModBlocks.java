package net.bryanleonard1984.vanenhanced.block;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.custom.BankBlock;
import net.bryanleonard1984.vanenhanced.block.custom.DecayBlock;
import net.bryanleonard1984.vanenhanced.block.custom.ForesterBlock;
import net.bryanleonard1984.vanenhanced.block.custom.ReclaimBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.bryanleonard1984.wileslib.block.BlockBuilderLib;

public class ModBlocks
{
    static BlockBuilderLib blockBuilderLib = new BlockBuilderLib(Wilesvanillaenhanced1211.MOD_ID, Wilesvanillaenhanced1211.LOGGER);
    static final String MOD_ID = blockBuilderLib.getId();

    public static final Block QUARTZ_ORE = blockBuilderLib.createOre("quartz_ore", 1, 3,
            3.0f, 1.5f, BlockSoundGroup.STONE);
    public static final Block DEEPSLATE_QUARTZ_ORE = blockBuilderLib.createOre("deepslate_quartz_ore", 2, 4,
            4.5f, 2.0f, BlockSoundGroup.DEEPSLATE);

    public static final Block NETHER_COAL_ORE = blockBuilderLib.createOre("nether_coal_ore", 3, 4,
            3.0f, 1.75f, BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_IRON_ORE= blockBuilderLib.createOre("nether_iron_ore", 3, 5,
            3.25f, 1.75f, BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_DIAMOND_ORE = blockBuilderLib.createOre("nether_diamond_ore", 4, 6,
            3.25f, 1.75f, BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_LAPIS_ORE = blockBuilderLib.createOre("nether_lapis_ore", 3, 5,
            3.25f, 1.75f, BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_EMERALD_ORE = blockBuilderLib.createOre("nether_emerald_ore", 4, 7,
            3.25f, 1.75f, BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_REDSTONE_ORE = blockBuilderLib.createOre("nether_redstone_ore", 3, 5,
            3.25f, 1.75f,BlockSoundGroup.NETHER_ORE);
    public static final Block NETHER_COPPER_ORE = blockBuilderLib.createOre("nether_copper_ore", 3, 4,
            3.0f, 4.0f, BlockSoundGroup.NETHER_ORE);

    public static final Block END_COAL_ORE = blockBuilderLib.createOre("end_coal_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_COPPER_ORE = blockBuilderLib.createOre("end_copper_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_DIAMOND_ORE = blockBuilderLib.createOre("end_diamond_ore", 5, 7,
            3.25f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_EMERALD_ORE = blockBuilderLib.createOre("end_emerald_ore", 6, 8,
            3.25f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_GOLD_ORE = blockBuilderLib.createOre("end_gold_ore", 4, 7,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_IRON_ORE = blockBuilderLib.createOre("end_iron_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_LAPIS_ORE = blockBuilderLib.createOre("end_lapis_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_QUARTZ_ORE = blockBuilderLib.createOre("end_quartz_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);
    public static final Block END_REDSTONE_ORE = blockBuilderLib.createOre("end_redstone_ore", 3, 6,
            3.0f, 2.0f, BlockSoundGroup.STONE);

    public static final Block BANK_BLOCK = registerBlock("bank_block",
            new BankBlock(AbstractBlock.Settings.create().strength(3.0f, 2.0f).burnable()
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block FORESTER_BLOCK = registerBlock("forester_block",
            new ForesterBlock(AbstractBlock.Settings.create().strength(2.5f, 1.5f).burnable()
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    public static final Block RECLAIM_BLOCK = registerBlock("reclaim_block",
            new ReclaimBlock(AbstractBlock.Settings.create().strength(4.0f, 2.5f)
                    .luminance(state -> 15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DECAY_BLOCK = registerBlock("decay_block",
            new DecayBlock(AbstractBlock.Settings.create().strength(3.0f, 1.5f)
                    .requiresTool().sounds(BlockSoundGroup.MUD)));


    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()
    {
        blockBuilderLib.getLogger().info("Loading mod blocks");
    }
}
