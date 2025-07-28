package net.bryanleonard1984.vanenhanced.util;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

public class AppendCopperPoints
{
    static void appendCopperPoints(Item item, int copperPoints)
    {
        ((CopperPoints) item).copperPoints(copperPoints);
    }

    static void appendCopperPoints(TagKey<Item> itemTag, int copperPoints)
    {
        for(RegistryEntry<Item> entry : Registries.ITEM.getOrCreateEntryList(itemTag))
        {
            Item item = entry.value();
            ((CopperPoints) item).copperPoints(copperPoints);
        }
    }

    public static void initializeCopperPoints()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Initializing Copper Point Values for " + Wilesvanillaenhanced1211.MOD_ID);

        appendCopperPoints(ModItems.SMALL_COPPER_COIN, 1);
        appendCopperPoints(ModItems.COPPER_COIN, 10);
        appendCopperPoints(ModItems.SMALL_IRON_COIN, 100);
        appendCopperPoints(ModItems.IRON_COIN, 1000);
        appendCopperPoints(ModItems.SMALL_GOLD_COIN, 10000);
        appendCopperPoints(ModItems.GOLD_COIN, 100000);

        appendCopperPoints(ModTags.Items.LOGS, 48);
        appendCopperPoints(ModTags.Items.STRIPPED_LOGS, 53);
        appendCopperPoints(ModTags.Items.WOODS, 64);
        appendCopperPoints(ModTags.Items.STRIPPED_WOODS, 70);
        appendCopperPoints(ItemTags.PLANKS, 13);
        appendCopperPoints(Items.STICK, 7);
        appendCopperPoints(Items.WARPED_PLANKS, 30);
        appendCopperPoints(Items.CRIMSON_PLANKS, 25);
        appendCopperPoints(ItemTags.WOOL, 24);
    }
}
