package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item BOOK_ENCHANTMENT_CORE = registerItem("book_enchantment_core", new Item(new Item.Settings()));

    public static final Item IRON_CHISEL = registerItem("iron_chisel", new ChiselItem(new Item.Settings().maxDamage(275)));
    public static final Item EMERALD_CHISEL = registerItem("emerald_chisel", new ChiselItem(new Item.Settings().maxDamage(500)));
    public static final Item DIAMOND_CHISEL = registerItem("diamond_chisel", new ChiselItem(new Item.Settings().maxDamage(850)));
    public static final Item NETHERITE_CHISEL = registerItem("netherite_chisel", new ChiselItem(new Item.Settings().maxDamage(1750).fireproof()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries)
    {
        entries.add(BOOK_ENCHANTMENT_CORE);
    }

    private static void customTools(FabricItemGroupEntries entries)
    {
        entries.add(IRON_CHISEL);
        entries.add(EMERALD_CHISEL);
        entries.add(DIAMOND_CHISEL);
        entries.add(NETHERITE_CHISEL);
    }

    public static void registerModItems()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Registering Mod Items for " + Wilesvanillaenhanced1211.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::customTools);
    }
}
