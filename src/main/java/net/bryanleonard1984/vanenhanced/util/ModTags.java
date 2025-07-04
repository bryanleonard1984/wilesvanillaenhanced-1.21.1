package net.bryanleonard1984.vanenhanced.util;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags
{
    public static class Blocks
    {
        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> RECLAMABLE_ITEMS = createTag("reclamable_items");
        public static final TagKey<Item> DECAYABLE_ITEMS = createTag("decayable_items");
        public static final TagKey<Item> HAMMERS = createTag("hammers");
        public static final TagKey<Item> CHISELS = createTag("chisels");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name));
        }
    }
}
