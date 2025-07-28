package net.bryanleonard1984.vanenhanced.util;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> OVERWORLD_ORES = createTag("overworld_ores");
        public static final TagKey<Block> DEEPSLATE_ORES = createTag("deepslate_ores");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
        }
    }

    public static class Biomes
    {
        public static final TagKey<Biome> IS_PLAINS = createTag("is_plains");
        public static final TagKey<Biome> IS_SANDY = createTag("is_sandy");
        public static final TagKey<Biome> COAL_BIOMES = createTag("coal_biomes");

        private static TagKey<Biome> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BIOME, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> RECLAMABLE_ITEMS = createTag("reclamable_items");
        public static final TagKey<Item> DECAYABLE_ITEMS = createTag("decayable_items");
        public static final TagKey<Item> HAMMERS = createTag("hammers");
        public static final TagKey<Item> LOGS = createTag("logs");
        public static final TagKey<Item> STRIPPED_LOGS = createTag("stripped_logs");
        public static final TagKey<Item> WOODS = createTag("woods");
        public static final TagKey<Item> STRIPPED_WOODS = createTag("stripped_woods");
        public static final TagKey<Item> CHISELS = createTag("chisels");
        public static final TagKey<Item> SEEDS = createTag("seeds");
        public static final TagKey<Item> GRASS = createTag("grass");
        public static final TagKey<Item> COINS = createTag("coins");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
        }
    }
}
