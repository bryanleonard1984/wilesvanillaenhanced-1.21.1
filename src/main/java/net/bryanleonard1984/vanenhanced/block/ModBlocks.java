package net.bryanleonard1984.vanenhanced.block;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.custom.DecayBlock;
import net.bryanleonard1984.vanenhanced.block.custom.ReclaimBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block RECLAIM_BLOCK = registerBlock("reclaim_block",
            new ReclaimBlock(AbstractBlock.Settings.create().strength(4.0f, 2.5f)
                    .luminance(state -> 15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DECAY_BLOCK = registerBlock("decay_block",
            new DecayBlock(AbstractBlock.Settings.create().strength(3.0f, 1.5f)
                    .requiresTool().sounds(BlockSoundGroup.MUD)));

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
