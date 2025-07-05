package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.item.custom.ChiselItem;
import net.bryanleonard1984.vanenhanced.item.custom.HammerItem;
import net.bryanleonard1984.vanenhanced.item.custom.ModShearsItem;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item BOOK_ENCHANTMENT_CORE = registerItem("book_enchantment_core", new Item(new Item.Settings()));
    public static final Item TINY_CHARCOAL = registerItem("tiny_charcoal", new Item(new Item.Settings()));
    public static final Item TINY_COAL = registerItem("tiny_coal", new Item(new Item.Settings()));

    public static final Item IRON_CHISEL = registerItem("iron_chisel", new ChiselItem(new Item.Settings().maxDamage(275)));
    public static final Item EMERALD_CHISEL = registerItem("emerald_chisel", new ChiselItem(new Item.Settings().maxDamage(500)));
    public static final Item DIAMOND_CHISEL = registerItem("diamond_chisel", new ChiselItem(new Item.Settings().maxDamage(850)));
    public static final Item NETHERITE_CHISEL = registerItem("netherite_chisel", new ChiselItem(new Item.Settings().maxDamage(1750).fireproof()));

    public static final Item STONE_HAMMER = registerItem("stone_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.STONE_HAMMER).maxCount(1).maxDamage(200)));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.IRON_HAMMER).maxDamage(450).maxCount(1)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.DIAMOND_HAMMER).maxDamage(900).maxCount(1)));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.NETHERITE_CHISEL).maxDamage(1750).maxCount(1)
            .fireproof()));

    public static final Item CRUSHED_COAL = registerItem("crushed_coal", new Item(new Item.Settings()));
    public static final Item CRUSHED_COPPER = registerItem("crushed_copper", new Item(new Item.Settings()));
    public static final Item CRUSHED_GOLD = registerItem("crushed_gold", new Item(new Item.Settings()));
    public static final Item CRUSHED_IRON = registerItem("crushed_iron", new Item(new Item.Settings()));

    public static final Item MOD_SHEARS = registerVanillaItem("shears", new ModShearsItem(new Item.Settings()
            .maxDamage(238).recipeRemainder(ModItems.MOD_SHEARS).maxCount(1)));
    //public static final Item MOD_SHEARS = new ModShearsItem(new Item.Settings().maxDamage(238).recipeRemainder(ModItems.MOD_SHEARS).maxCount(1));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, name), item);
    }

    private static Item registerVanillaItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of("minecraft", name), item);
    }

    public static void registerModItems()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Registering Mod Items for " + Wilesvanillaenhanced1211.MOD_ID);
    }
}
