package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.item.custom.ChiselItem;
import net.bryanleonard1984.vanenhanced.item.custom.HammerItem;
import net.bryanleonard1984.vanenhanced.item.custom.ModShearsItem;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems
{
    protected int copperPoints;

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

    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterials.EMERALD,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 5.0f, -3.0f))));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterials.EMERALD,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD, -3.0f, 0.0f))));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterials.EMERALD,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1.0f, -2.8f))));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterials.EMERALD,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1.5f, -3.0f))));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterials.EMERALD,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD, 3, -2.4f))));

    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));

    public static final Item CRUSHED_COAL = registerItem("crushed_coal", new Item(new Item.Settings()));
    public static final Item CRUSHED_COPPER = registerItem("crushed_copper", new Item(new Item.Settings()));
    public static final Item CRUSHED_GOLD = registerItem("crushed_gold", new Item(new Item.Settings()));
    public static final Item CRUSHED_IRON = registerItem("crushed_iron", new Item(new Item.Settings()));

    public static final Item MOD_SHEARS = registerVanillaItem("shears", new ModShearsItem(new Item.Settings()
            .maxDamage(238).recipeRemainder(ModItems.MOD_SHEARS).maxCount(1)));
    public static final Item SMALL_COPPER_COIN = registerItem("small_copper_coin", new Item(new Item.Settings()));
    public static final Item SMALL_IRON_COIN = registerItem("small_iron_coin", new Item(new Item.Settings()));
    public static final Item SMALL_GOLD_COIN = registerItem("small_gold_coin", new Item(new Item.Settings()));
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));
    public static final Item IRON_COIN = registerItem("iron_coin", new Item(new Item.Settings()));
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new Item.Settings()));

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
