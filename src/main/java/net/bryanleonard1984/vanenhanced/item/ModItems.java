package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.wileslib.item.ItemBuilderLib;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.bryanleonard1984.vanenhanced.util.CopperPoints;

import static net.bryanleonard1984.vanenhanced.item.custom.ChiselItem.createChiselItem;
import static net.bryanleonard1984.vanenhanced.item.custom.HammerItem.createHammerItem;
import static net.bryanleonard1984.vanenhanced.item.custom.ModShearsItem.createModShearsItem;

public class ModItems
{
    static ItemBuilderLib itemBuilder = new ItemBuilderLib(Wilesvanillaenhanced1211.LOGGER, Wilesvanillaenhanced1211.MOD_ID);
    static final String MOD_ID = itemBuilder.getId();

    public static final Item BOOK_ENCHANTMENT_CORE = itemBuilder.createSimpleItem(MOD_ID, "book_enchantment_core");
    public static final Item TINY_CHARCOAL = itemBuilder.createSimpleItem(MOD_ID, "tiny_charcoal");
    public static final Item TINY_COAL = itemBuilder.createSimpleItem(MOD_ID, "tiny_coal");

    public static final Item IRON_CHISEL = createChiselItem(MOD_ID, "iron_chisel", false);
    public static final Item EMERALD_CHISEL = createChiselItem(MOD_ID, "emerald_chisel", false);
    public static final Item DIAMOND_CHISEL = createChiselItem(MOD_ID, "diamond_chisel", false);
    public static final Item NETHERITE_CHISEL = createChiselItem(MOD_ID, "netherite_chisel", true);

    public static final Item STONE_HAMMER = createHammerItem(MOD_ID, "stone_hammer", ModItems.STONE_HAMMER, false);
    public static final Item IRON_HAMMER = createHammerItem(MOD_ID, "iron_hammer", ModItems.IRON_HAMMER, false);
    public static final Item DIAMOND_HAMMER = createHammerItem(MOD_ID, "diamond_hammer", ModItems.DIAMOND_HAMMER, false);
    public static final Item NETHERITE_HAMMER = createHammerItem(MOD_ID, "netherite_hammer", ModItems.NETHERITE_HAMMER, true);

    public static final Item COPPER_AXE = itemBuilder.createAxeItem(MOD_ID, "copper_axe", ModToolMaterials.COPPER, 5.0f, -3.0f);
    public static final Item EMERALD_AXE = itemBuilder.createAxeItem(MOD_ID, "emerald_axe", ModToolMaterials.EMERALD, 5.0f, -3.0f);
    public static final Item COPPER_HOE = itemBuilder.createHoeItem(MOD_ID, "copper_hoe", ModToolMaterials.COPPER, -3.0f, 0.0f);
    public static final Item EMERALD_HOE = itemBuilder.createHoeItem(MOD_ID, "emerald_hoe", ModToolMaterials.EMERALD, -3.0f, 0.0f);
    public static final Item COPPER_PICKAXE = itemBuilder.createPickaxeItem(MOD_ID, "copper_pickaxe", ModToolMaterials.COPPER, 1.0f, -2.8f);
    public static final Item EMERALD_PICKAXE = itemBuilder.createPickaxeItem(MOD_ID, "emerald_pickaxe", ModToolMaterials.EMERALD, 1.0f, -2.8f);
    public static final Item COPPER_SHOVEL = itemBuilder.createShovelItem(MOD_ID, "copper_shovel", ModToolMaterials.COPPER, 1.5f, -3.0f);
    public static final Item EMERALD_SHOVEL = itemBuilder.createShovelItem(MOD_ID, "emerald_shovel", ModToolMaterials.EMERALD, 1.5f, -3.0f);
    public static final Item COPPER_SWORD = itemBuilder.createSwordItem(MOD_ID, "copper_sword", ModToolMaterials.COPPER, 3, -2.4f);
    public static final Item EMERALD_SWORD = itemBuilder.createSwordItem(MOD_ID, "emerald_sword", ModToolMaterials.EMERALD, 3, -2.4f);

    public static final Item COPPER_BOOTS = itemBuilder.createArmorItem(MOD_ID, "copper_boots", ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, 33);
    public static final Item EMERALD_BOOTS = itemBuilder.createArmorItem(MOD_ID, "emerald_boots", ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, 33);
    public static final Item COPPER_CHESTPLATE = itemBuilder.createArmorItem(MOD_ID, "copper_chestplate", ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, 33);
    public static final Item EMERALD_CHESTPLATE = itemBuilder.createArmorItem(MOD_ID, "emerald_chestplate", ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, 33);
    public static final Item COPPER_HELMET = itemBuilder.createArmorItem(MOD_ID, "copper_helmet", ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, 33);
    public static final Item EMERALD_HELMET = itemBuilder.createArmorItem(MOD_ID, "emerald_helmet", ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, 33);
    public static final Item COPPER_LEGGINGS = itemBuilder.createArmorItem(MOD_ID, "copper_leggings", ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, 33);
    public static final Item EMERALD_LEGGINGS = itemBuilder.createArmorItem(MOD_ID, "emerald_leggings", ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, 33);

    public static final Item CRUSHED_COAL = itemBuilder.createSimpleItem(MOD_ID, "crushed_coal");
    public static final Item CRUSHED_COPPER = itemBuilder.createSimpleItem(MOD_ID,"crushed_copper");
    public static final Item CRUSHED_GOLD = itemBuilder.createSimpleItem(MOD_ID,"crushed_gold");
    public static final Item CRUSHED_IRON = itemBuilder.createSimpleItem(MOD_ID,"crushed_iron");

    public static final Item MOD_SHEARS = createModShearsItem("minecraft", "shears", ModItems.MOD_SHEARS);
    public static final Item SMALL_COPPER_COIN = itemBuilder.createSimpleItem(MOD_ID, "small_copper_coin");
    public static final Item SMALL_IRON_COIN = itemBuilder.createSimpleItem(MOD_ID, "small_iron_coin");
    public static final Item SMALL_GOLD_COIN = itemBuilder.createSimpleItem(MOD_ID, "small_gold_coin");
    public static final Item COPPER_COIN = itemBuilder.createSimpleItem(MOD_ID, "copper_coin");
    public static final Item IRON_COIN = itemBuilder.createSimpleItem(MOD_ID, "iron_coin");
    public static final Item GOLD_COIN = itemBuilder.createSimpleItem(MOD_ID, "gold_coin");

    public static Item registerItem(String id, String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(id, name), item);
    }
}
