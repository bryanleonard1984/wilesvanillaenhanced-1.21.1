package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider
{
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        final List<ItemConvertible> COAL_SMELTABLES = List.of(ModBlocks.NETHER_COAL_ORE, ModBlocks.END_COAL_ORE);
        final List<ItemConvertible> IRON_SMELTABLES = List.of(ModBlocks.NETHER_IRON_ORE, ModBlocks.END_IRON_ORE);
        final List<ItemConvertible> DIAMOND_SMELTABLES = List.of(ModBlocks.NETHER_DIAMOND_ORE, ModBlocks.END_DIAMOND_ORE);
        final List<ItemConvertible> EMERALD_SMELTABLES = List.of(ModBlocks.NETHER_EMERALD_ORE, ModBlocks.END_EMERALD_ORE);
        final List<ItemConvertible> COPPER_SMELTABLES = List.of(ModBlocks.NETHER_COPPER_ORE, ModBlocks.END_COPPER_ORE);
        final List<ItemConvertible> REDSTONE_SMELTABLES = List.of(ModBlocks.NETHER_REDSTONE_ORE, ModBlocks.END_REDSTONE_ORE);
        final List<ItemConvertible> LAPIS_SMELTABLES = List.of(ModBlocks.NETHER_LAPIS_ORE, ModBlocks.END_LAPIS_ORE);
        final List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE, ModBlocks.END_QUARTZ_ORE);
        final List<ItemConvertible> GOLD_SMELTABLES = List.of(ModBlocks.END_GOLD_ORE);

        offerSmelting(recipeExporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 200, "coal_ore_smelts");
        offerSmelting(recipeExporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.75f, 200, "iron_ore_smelts");
        offerSmelting(recipeExporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 200, "diamond_ore_smelts");
        offerSmelting(recipeExporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 200, "emerald_ore_smelts");
        offerSmelting(recipeExporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.75f, 200, "copper_ore_smelts");
        offerSmelting(recipeExporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.85f, 200, "redstone_ore_smelts");
        offerSmelting(recipeExporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.75f, 200, "lapis_ore_smelts");
        offerSmelting(recipeExporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz_ore_smelts");
        offerSmelting(recipeExporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 200, "gold_ore_smelts");

        offerBlasting(recipeExporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 100, "coal_ore_smelts");
        offerBlasting(recipeExporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.75f, 100, "iron_ore_smelts");
        offerBlasting(recipeExporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 100, "diamond_ore_smelts");
        offerBlasting(recipeExporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 100, "emerald_ore_smelts");
        offerBlasting(recipeExporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.75f, 100, "copper_ore_smelts");
        offerBlasting(recipeExporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.85f, 100, "redstone_ore_smelts");
        offerBlasting(recipeExporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.75f, 100, "lapis_ore_smelts");
        offerBlasting(recipeExporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz_ore_smelts");
        offerBlasting(recipeExporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 100, "gold_ore_smelts");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECAY_BLOCK)
                .pattern("RFR")
                .pattern("FBF")
                .pattern("RFR")
                .input('R', Items.ROTTEN_FLESH).input('F', Items.FERMENTED_SPIDER_EYE).input('B', Blocks.BONE_BLOCK)
                .criterion(hasItem(Blocks.BONE_BLOCK), conditionsFromItem(Blocks.BONE_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECAY_BLOCK)
                .pattern("FRF")
                .pattern("RBR")
                .pattern("FRF")
                .input('R', Items.ROTTEN_FLESH).input('F', Items.FERMENTED_SPIDER_EYE).input('B', Blocks.BONE_BLOCK)
                .criterion(hasItem(Blocks.BONE_BLOCK), conditionsFromItem(Blocks.BONE_BLOCK))
                .offerTo(recipeExporter, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "decay_block_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RECLAIM_BLOCK)
                .pattern("LGL")
                .pattern("GBG")
                .pattern("LGL")
                .input('L', Items.LAPIS_LAZULI).input('G', Items.GOLD_INGOT).input('B', Items.GLOWSTONE)
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(recipeExporter);

        offerShapelessRecipe(recipeExporter, ModItems.TINY_CHARCOAL, Items.CHARCOAL, "tiny_fuel", 8);
        offerShapelessRecipe(recipeExporter, ModItems.TINY_COAL, Items.COAL, "tiny_fuel", 8);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHARCOAL)
                .input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL)
                .input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL).input(ModItems.TINY_CHARCOAL)
                .criterion(hasItem(ModItems.TINY_CHARCOAL), conditionsFromItem(ModItems.TINY_CHARCOAL))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COAL)
                .input(ModItems.TINY_COAL).input(ModItems.TINY_COAL).input(ModItems.TINY_COAL).input(ModItems.TINY_COAL)
                .input(ModItems.TINY_COAL).input(ModItems.TINY_COAL).input(ModItems.TINY_COAL).input(ModItems.TINY_COAL)
                .criterion(hasItem(ModItems.TINY_COAL), conditionsFromItem(ModItems.TINY_COAL))
                .offerTo(recipeExporter);
    }
}
