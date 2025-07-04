package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.util.ModTags;
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
    final List<ItemConvertible> HAMMERS = List.of(ModItems.STONE_HAMMER, ModItems.IRON_HAMMER, ModItems.DIAMOND_HAMMER, ModItems.NETHERITE_HAMMER);

    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        final List<ItemConvertible> COAL_SMELTABLES = List.of(ModBlocks.NETHER_COAL_ORE, ModBlocks.END_COAL_ORE, ModItems.CRUSHED_COAL);
        final List<ItemConvertible> IRON_SMELTABLES = List.of(ModBlocks.NETHER_IRON_ORE, ModBlocks.END_IRON_ORE, ModItems.CRUSHED_IRON);
        final List<ItemConvertible> DIAMOND_SMELTABLES = List.of(ModBlocks.NETHER_DIAMOND_ORE, ModBlocks.END_DIAMOND_ORE);
        final List<ItemConvertible> EMERALD_SMELTABLES = List.of(ModBlocks.NETHER_EMERALD_ORE, ModBlocks.END_EMERALD_ORE);
        final List<ItemConvertible> COPPER_SMELTABLES = List.of(ModBlocks.NETHER_COPPER_ORE, ModBlocks.END_COPPER_ORE, ModItems.CRUSHED_COPPER);
        final List<ItemConvertible> REDSTONE_SMELTABLES = List.of(ModBlocks.NETHER_REDSTONE_ORE, ModBlocks.END_REDSTONE_ORE);
        final List<ItemConvertible> LAPIS_SMELTABLES = List.of(ModBlocks.NETHER_LAPIS_ORE, ModBlocks.END_LAPIS_ORE);
        final List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE, ModBlocks.END_QUARTZ_ORE);
        final List<ItemConvertible> GOLD_SMELTABLES = List.of(ModBlocks.END_GOLD_ORE, ModItems.CRUSHED_GOLD);

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
                .pattern("RFR").pattern("FBF").pattern("RFR")
                .input('R', Items.ROTTEN_FLESH).input('F', Items.FERMENTED_SPIDER_EYE).input('B', Blocks.BONE_BLOCK)
                .criterion(hasItem(Blocks.BONE_BLOCK), conditionsFromItem(Blocks.BONE_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DECAY_BLOCK)
                .pattern("FRF").pattern("RBR").pattern("FRF")
                .input('R', Items.ROTTEN_FLESH).input('F', Items.FERMENTED_SPIDER_EYE).input('B', Blocks.BONE_BLOCK)
                .criterion(hasItem(Blocks.BONE_BLOCK), conditionsFromItem(Blocks.BONE_BLOCK))
                .offerTo(recipeExporter, Identifier.of(Wilesvanillaenhanced1211.MOD_ID, "decay_block_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RECLAIM_BLOCK)
                .pattern("LGL").pattern("GBG").pattern("LGL")
                .input('L', Items.LAPIS_LAZULI).input('G', Items.GOLD_INGOT).input('B', Items.GLOWSTONE)
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(recipeExporter);

        HammerRecipes(ModItems.STONE_HAMMER, Blocks.COBBLESTONE, recipeExporter);
        HammerRecipes(ModItems.IRON_HAMMER, Items.IRON_INGOT, recipeExporter);
        HammerRecipes(ModItems.DIAMOND_HAMMER, Items.DIAMOND, recipeExporter);
        HammerRecipes(ModItems.NETHERITE_HAMMER, Items.NETHERITE_INGOT, recipeExporter);

        ChiselRecipes(ModItems.IRON_CHISEL, Items.IRON_INGOT, recipeExporter);
        ChiselRecipes(ModItems.DIAMOND_CHISEL, Items.DIAMOND, recipeExporter);
        ChiselRecipes(ModItems.EMERALD_CHISEL, Items.EMERALD, recipeExporter);
        ChiselRecipes(ModItems.NETHERITE_CHISEL, Items.NETHERITE_INGOT, recipeExporter);

        TinyFuelRecipes(Items.CHARCOAL, ModItems.TINY_CHARCOAL, recipeExporter);
        TinyFuelRecipes(Items.COAL, ModItems.TINY_COAL, recipeExporter);

        CrushedOreRecipes(ModItems.CRUSHED_COAL, Items.COAL, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_COPPER, Items.RAW_COPPER, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_GOLD, Items.RAW_GOLD, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_IRON, Items.RAW_IRON, recipeExporter);
        CrushedOreRecipes(Items.COBBLESTONE, Items.STONE, recipeExporter);
        CrushedOreRecipes(Items.GRAVEL, Items.COBBLESTONE, recipeExporter);
        CrushedOreRecipes(Items.SAND, Items.GRAVEL, recipeExporter);
    }

    private void HammerRecipes(ItemConvertible output, ItemConvertible material, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" MS").pattern(" SM").pattern("S  ")
                .input('M', material).input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(recipeExporter);
    }

    private void ChiselRecipes(ItemConvertible output, ItemConvertible material, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("S  ").pattern(" M ").pattern("  M")
                .input('M', material).input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(recipeExporter);
    }

    private void TinyFuelRecipes(ItemConvertible input, ItemConvertible output, RecipeExporter recipeExporter)
    {
        offerShapelessRecipe(recipeExporter, output, input, "tiny_fuel", 8);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, input)
                .input(output).input(output).input(output).input(output)
                .input(output).input(output).input(output).input(output)
                .criterion(hasItem(output), conditionsFromItem(output))
                .offerTo(recipeExporter);
    }

    private void CrushedOreRecipes(ItemConvertible output, ItemConvertible material, RecipeExporter recipeExporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 2)
                .input(ModTags.Items.HAMMERS).input(material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(recipeExporter);
    }
}
