package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final String MOD_ID = Wilesvanillaenhanced1211.MOD_ID;

    public static final ItemGroup VAN_ENHANCED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "van_enhanced_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BOOK_ENCHANTMENT_CORE))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_items"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.BOOK_ENCHANTMENT_CORE);
                        entries.add(ModItems.TINY_CHARCOAL);
                        entries.add(ModItems.TINY_COAL);
                        entries.add(ModItems.CRUSHED_COAL);
                        entries.add(ModItems.CRUSHED_COPPER);
                        entries.add(ModItems.CRUSHED_GOLD);
                        entries.add(ModItems.CRUSHED_IRON);
                        entries.add(ModItems.SMALL_COPPER_COIN);
                        entries.add(ModItems.SMALL_IRON_COIN);
                        entries.add(ModItems.SMALL_GOLD_COIN);
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.IRON_COIN);
                        entries.add(ModItems.GOLD_COIN);

                    }).build());

    public static final ItemGroup VAN_ENHANCED_TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "van_enhanced_tools"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.IRON_CHISEL))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_tools"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.IRON_CHISEL);
                        entries.add(ModItems.DIAMOND_CHISEL);
                        entries.add(ModItems.EMERALD_CHISEL);
                        entries.add(ModItems.NETHERITE_CHISEL);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                    }).build());

    public static final ItemGroup VAN_ENHANCED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "van_enhanced_blocks"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.RECLAIM_BLOCK))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_blocks"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModBlocks.DECAY_BLOCK);
                        entries.add(ModBlocks.RECLAIM_BLOCK);
                        entries.add(ModBlocks.QUARTZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_QUARTZ_ORE);
                        entries.add(ModBlocks.NETHER_COAL_ORE);
                        entries.add(ModBlocks.NETHER_IRON_ORE);
                        entries.add(ModBlocks.NETHER_DIAMOND_ORE);
                        entries.add(ModBlocks.NETHER_EMERALD_ORE);
                        entries.add(ModBlocks.NETHER_LAPIS_ORE);
                        entries.add(ModBlocks.NETHER_REDSTONE_ORE);
                        entries.add(ModBlocks.NETHER_COPPER_ORE);
                        entries.add(ModBlocks.END_COAL_ORE);
                        entries.add(ModBlocks.END_COPPER_ORE);
                        entries.add(ModBlocks.END_DIAMOND_ORE);
                        entries.add(ModBlocks.END_EMERALD_ORE);
                        entries.add(ModBlocks.END_GOLD_ORE);
                        entries.add(ModBlocks.END_IRON_ORE);
                        entries.add(ModBlocks.END_LAPIS_ORE);
                        entries.add(ModBlocks.END_QUARTZ_ORE);
                        entries.add(ModBlocks.END_REDSTONE_ORE);
                        entries.add(ModBlocks.BANK_BLOCK);
                    }).build());

    public static void registerModItemGroups()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Registering Mod Item Groups for " + Wilesvanillaenhanced1211.MOD_ID);
    }
}
