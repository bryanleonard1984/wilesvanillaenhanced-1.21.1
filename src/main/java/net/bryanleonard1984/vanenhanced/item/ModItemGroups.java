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
    public static final ItemGroup VAN_ENHANCED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "van_enhanced_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BOOK_ENCHANTMENT_CORE))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_items"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.BOOK_ENCHANTMENT_CORE);
                        entries.add(ModItems.TINY_CHARCOAL);
                        entries.add(ModItems.TINY_COAL);
                    }).build());

    public static final ItemGroup VAN_ENHANCED_TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "van_enhanced_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_CHISEL))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_tools"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.IRON_CHISEL);
                        entries.add(ModItems.DIAMOND_CHISEL);
                        entries.add(ModItems.EMERALD_CHISEL);
                        entries.add(ModItems.NETHERITE_CHISEL);
                    }).build());

    public static final ItemGroup VAN_ENHANCED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "van_enhanced_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RECLAIM_BLOCK))
                    .displayName(Text.translatable("itemgroup.vanenhanced.van_enhanced_blocks"))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModBlocks.DECAY_BLOCK);
                        entries.add(ModBlocks.RECLAIM_BLOCK);
                        entries.add(ModBlocks.NETHER_COAL_ORE);
                        entries.add(ModBlocks.NETHER_IRON_ORE);
                        entries.add(ModBlocks.NETHER_DIAMOND_ORE);
                        entries.add(ModBlocks.NETHER_EMERALD_ORE);
                        entries.add(ModBlocks.NETHER_LAPIS_ORE);
                        entries.add(ModBlocks.NETHER_REDSTONE_ORE);
                        entries.add(ModBlocks.NETHER_COPPER_ORE);
                    }).build());

    public static void registerModItemGroups()
    {
        Wilesvanillaenhanced1211.LOGGER.info("Registering Mod Item Groups for " + Wilesvanillaenhanced1211.MOD_ID);
    }
}
