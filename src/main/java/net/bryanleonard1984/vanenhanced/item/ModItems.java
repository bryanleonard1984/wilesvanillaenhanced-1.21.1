package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.item.custom.ChiselItem;
import net.bryanleonard1984.vanenhanced.item.custom.HammerItem;
import net.bryanleonard1984.vanenhanced.item.custom.ModShearsItem;
import net.bryanleonard1984.wileslib.item.ItemBuilderLib;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems
{
    static ItemBuilderLib itemBuilder = new ItemBuilderLib(Wilesvanillaenhanced1211.LOGGER, Wilesvanillaenhanced1211.MOD_ID);
    static final String MOD_ID = itemBuilder.getId();

    public static final Item BOOK_ENCHANTMENT_CORE = itemBuilder.createSimpleItem("book_enchantment_core");
    public static final Item TINY_CHARCOAL = itemBuilder.createSimpleItem("tiny_charcoal");
    public static final Item TINY_COAL = itemBuilder.createSimpleItem("tiny_coal");
    public static final Item SMALL_COPPER_COIN = itemBuilder.createSimpleItem("small_copper_coin");
    public static final Item SMALL_IRON_COIN = itemBuilder.createSimpleItem("small_iron_coin");
    public static final Item SMALL_GOLD_COIN = itemBuilder.createSimpleItem("small_gold_coin");
    public static final Item COPPER_COIN = itemBuilder.createSimpleItem("copper_coin");
    public static final Item IRON_COIN = itemBuilder.createSimpleItem("iron_coin");
    public static final Item GOLD_COIN = itemBuilder.createSimpleItem("gold_coin");
    public static final Item CRUSHED_COAL = itemBuilder.createSimpleItem("crushed_coal");
    public static final Item CRUSHED_COPPER = itemBuilder.createSimpleItem("crushed_copper");
    public static final Item CRUSHED_GOLD = itemBuilder.createSimpleItem("crushed_gold");
    public static final Item CRUSHED_IRON = itemBuilder.createSimpleItem("crushed_iron");

    public static final Item IRON_CHISEL = registerItem("iron_chisel", new ChiselItem(new Item.Settings().maxDamage(275)));
    public static final Item EMERALD_CHISEL = registerItem("emerald_chisel", new ChiselItem(new Item.Settings().maxDamage(500)));
    public static final Item DIAMOND_CHISEL = registerItem("diamond_chisel", new ChiselItem(new Item.Settings().maxDamage(850)));
    public static final Item NETHERITE_CHISEL = registerItem("netherite_chisel", new ChiselItem(new Item.Settings().maxDamage(1750).fireproof()));

    public static final Item STONE_HAMMER = registerItem("stone_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.STONE_HAMMER).maxCount(1).maxDamage(200)));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.IRON_HAMMER).maxDamage(450).maxCount(1)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.DIAMOND_HAMMER).maxDamage(900).maxCount(1)));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer", new HammerItem(new Item.Settings().recipeRemainder(ModItems.NETHERITE_CHISEL).maxDamage(1750).maxCount(1)
            .fireproof()));

    public static final Item COPPER_AXE = itemBuilder.createAxeItem("copper_axe", ModToolMaterials.COPPER, 5.0f, -3.0f);
    public static final Item EMERALD_AXE = itemBuilder.createAxeItem("emerald_axe", ModToolMaterials.EMERALD, 5.0f, -3.0f);
    public static final Item COPPER_HOE = itemBuilder.createHoeItem("copper_hoe", ModToolMaterials.COPPER, -3.0f, 0.0f);
    public static final Item EMERALD_HOE = itemBuilder.createHoeItem("emerald_hoe", ModToolMaterials.EMERALD, -3.0f, 0.0f);
    public static final Item COPPER_PICKAXE = itemBuilder.createPickaxeItem("copper_pickaxe", ModToolMaterials.COPPER, 1.0f, -2.8f);
    public static final Item EMERALD_PICKAXE = itemBuilder.createPickaxeItem("emerald_pickaxe", ModToolMaterials.EMERALD, 1.0f, -2.8f);
    public static final Item EMERALD_SHOVEL = itemBuilder.createShovelItem("emerald_shovel", ModToolMaterials.EMERALD, 1.5f, -3.0f);
    public static final Item EMERALD_SWORD = itemBuilder.createSwordItem("emerald_sword", ModToolMaterials.EMERALD, 3, -2.4f);

    public static final Item EMERALD_BOOTS = itemBuilder.createArmorItem("emerald_boots", ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, 33);
    public static final Item EMERALD_CHESTPLATE = itemBuilder.createArmorItem("emerald_chestplate", ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, 33);
    public static final Item EMERALD_HELMET = itemBuilder.createArmorItem("emerald_helmet", ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, 33);
    public static final Item EMERALD_LEGGINGS = itemBuilder.createArmorItem("emerald_leggings", ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, 33);

    public static final Item MOD_SHEARS = registerVanillaItem("shears", new ModShearsItem(new Item.Settings()
            .maxDamage(238).recipeRemainder(ModItems.MOD_SHEARS).maxCount(1)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    private static Item registerVanillaItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of("minecraft", name), item);
    }
}
