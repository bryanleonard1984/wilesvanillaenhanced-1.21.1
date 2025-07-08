package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.DECAY_BLOCK);
        addDrop(ModBlocks.RECLAIM_BLOCK);

        addDrop(ModBlocks.QUARTZ_ORE, oreDrops(ModBlocks.QUARTZ_ORE, Items.QUARTZ));
        addDrop(ModBlocks.DEEPSLATE_QUARTZ_ORE, oreDrops(ModBlocks.DEEPSLATE_QUARTZ_ORE, Items.QUARTZ));

        addDrop(ModBlocks.NETHER_COAL_ORE, multipleOreDrops(ModBlocks.NETHER_COAL_ORE, Items.COAL, 2.0f, 3.0f));
        addDrop(ModBlocks.NETHER_IRON_ORE, multipleOreDrops(ModBlocks.NETHER_IRON_ORE, Items.RAW_IRON, 1.0f, 3.0f));
        addDrop(ModBlocks.NETHER_DIAMOND_ORE, multipleOreDrops(ModBlocks.NETHER_DIAMOND_ORE, Items.DIAMOND, 1.0f, 2.0f));
        addDrop(ModBlocks.NETHER_LAPIS_ORE, multipleOreDrops(ModBlocks.NETHER_LAPIS_ORE, Items.LAPIS_LAZULI, 5.0f, 9.0f));
        addDrop(ModBlocks.NETHER_REDSTONE_ORE, multipleOreDrops(ModBlocks.NETHER_REDSTONE_ORE, Items.REDSTONE, 5.0f, 6.0f));
        addDrop(ModBlocks.NETHER_COPPER_ORE, multipleOreDrops(ModBlocks.NETHER_COPPER_ORE, Items.RAW_COPPER, 3.0f, 6.0f));
        addDrop(ModBlocks.NETHER_EMERALD_ORE, multipleOreDrops(ModBlocks.NETHER_EMERALD_ORE, Items.EMERALD, 1.0f, 2.0f));
        addDrop(Blocks.NETHER_GOLD_ORE, multipleOreDrops(Blocks.NETHER_GOLD_ORE, Items.RAW_GOLD, 1.0f, 2.0f));

        addDrop(ModBlocks.END_COAL_ORE, multipleOreDrops(ModBlocks.END_COAL_ORE, Items.COAL, 3.0f, 5.0f));
        addDrop(ModBlocks.END_COPPER_ORE, multipleOreDrops(ModBlocks.END_COPPER_ORE, Items.RAW_COPPER, 5.0f, 8.0f));
        addDrop(ModBlocks.END_DIAMOND_ORE, multipleOreDrops(ModBlocks.END_DIAMOND_ORE, Items.DIAMOND, 2.0f, 4.0f));
        addDrop(ModBlocks.END_EMERALD_ORE, multipleOreDrops(ModBlocks.END_EMERALD_ORE, Items.EMERALD, 2.0f, 3.0f));
        addDrop(ModBlocks.END_GOLD_ORE, multipleOreDrops(ModBlocks.END_GOLD_ORE, Items.RAW_GOLD, 2.0f, 3.0f));
        addDrop(ModBlocks.END_IRON_ORE, multipleOreDrops(ModBlocks.END_IRON_ORE, Items.RAW_IRON, 2.0f, 5.0f));
        addDrop(ModBlocks.END_LAPIS_ORE, multipleOreDrops(ModBlocks.END_LAPIS_ORE, Items.LAPIS_LAZULI, 6.0f, 11.0f));
        addDrop(ModBlocks.END_QUARTZ_ORE, multipleOreDrops(ModBlocks.END_QUARTZ_ORE, Items.QUARTZ, 4.0f, 6.0f));
        addDrop(ModBlocks.END_REDSTONE_ORE, multipleOreDrops(ModBlocks.END_REDSTONE_ORE, Items.REDSTONE, 6.0f, 10.0f));

        addDrop(ModBlocks.BANK_BLOCK);
    }

    @Override
    public BlockLootTableGenerator withConditions(ResourceCondition... conditions)
    {
        return super.withConditions(conditions);
    }

    @Override
    public BiConsumer<RegistryKey<LootTable>, LootTable.Builder> withConditions(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> exporter, ResourceCondition... conditions)
    {
        return super.withConditions(exporter, conditions);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops)
    {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
