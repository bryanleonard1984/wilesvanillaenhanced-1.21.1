package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import net.bryanleonard1984.vanenhanced.recipe.RecipeBuilder;
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
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider
{
    RecipeBuilder recipeBuilder = new RecipeBuilder();

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
        final List<ItemConvertible> SOUL_SMELTABLES = List.of(Blocks.SOUL_SAND);

        offerSmelting(recipeExporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 200, "coal_ore_smelts");
        offerSmelting(recipeExporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.75f, 200, "iron_ore_smelts");
        offerSmelting(recipeExporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 200, "diamond_ore_smelts");
        offerSmelting(recipeExporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 200, "emerald_ore_smelts");
        offerSmelting(recipeExporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.75f, 200, "copper_ore_smelts");
        offerSmelting(recipeExporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.85f, 200, "redstone_ore_smelts");
        offerSmelting(recipeExporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.75f, 200, "lapis_ore_smelts");
        offerSmelting(recipeExporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz_ore_smelts");
        offerSmelting(recipeExporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 200, "gold_ore_smelts");
        offerSmelting(recipeExporter, SOUL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.SOUL_SOIL, 1.0f, 150, "soul_smelts");

        offerBlasting(recipeExporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 100, "coal_ore_smelts");
        offerBlasting(recipeExporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.75f, 100, "iron_ore_smelts");
        offerBlasting(recipeExporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 100, "diamond_ore_smelts");
        offerBlasting(recipeExporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 100, "emerald_ore_smelts");
        offerBlasting(recipeExporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.75f, 100, "copper_ore_smelts");
        offerBlasting(recipeExporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.85f, 100, "redstone_ore_smelts");
        offerBlasting(recipeExporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.75f, 100, "lapis_ore_smelts");
        offerBlasting(recipeExporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz_ore_smelts");
        offerBlasting(recipeExporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 100, "gold_ore_smelts");
        offerBlasting(recipeExporter, SOUL_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.SOUL_SOIL, 1.0f, 75, "soul_smelts");

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.ELYTRA)
                .pattern(" E ")
                .pattern("SLS")
                .pattern("LLL")
                .input('E', Items.END_ROD).input('S', Items.STICK).input('L', Items.LEATHER)
                .criterion(hasItem(Items.END_ROD), conditionsFromItem(Items.END_ROD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.GRASS_BLOCK, 4)
                .pattern("GGG")
                .pattern("SWS")
                .pattern("DDD")
                .input('G', ModTags.Items.GRASS).input('S', ModTags.Items.SEEDS).input('D', Blocks.DIRT).input('W', Items.WATER_BUCKET)
                .criterion(hasItem(Items.DIRT), conditionsFromItem(Items.DIRT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.SADDLE)
                .pattern("L  ")
                .pattern("LLL")
                .pattern(" I ")
                .input('L', Items.LEATHER).input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.SPAWNER)
                .pattern("I#I")
                .pattern("# #")
                .pattern("I#I")
                .input('I', Items.IRON_INGOT).input('#', Items.IRON_BARS)
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NAME_TAG)
                .pattern("SLL").input('S', Items.STRING).input('L', Items.LEATHER)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.SPONGE)
                .pattern(" C ")
                .pattern("CWC")
                .pattern(" C ")
                .input('W', ItemTags.WOOL).input('C', Items.NAUTILUS_SHELL)
                .criterion(hasItem(Items.NAUTILUS_SHELL), conditionsFromItem(Items.NAUTILUS_SHELL))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.FLINT)
                .input(Blocks.GRAVEL).input(Blocks.GRAVEL)
                .criterion(hasItem(Blocks.GRAVEL), conditionsFromItem(Blocks.GRAVEL))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING, 2)
                .input(ItemTags.WOOL).input(Items.FLINT)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(recipeExporter);

        offerShapelessRecipe(recipeExporter, Items.NETHER_WART, Blocks.NETHER_WART_BLOCK, "nether_wart", 4);

        recipeBuilder.ChiselRecipes(ModItems.IRON_CHISEL, Items.IRON_INGOT, recipeExporter);
        recipeBuilder.ChiselRecipes(ModItems.DIAMOND_CHISEL, Items.DIAMOND, recipeExporter);
        recipeBuilder.ChiselRecipes(ModItems.EMERALD_CHISEL, Items.EMERALD, recipeExporter);
        recipeBuilder.ChiselRecipes(ModItems.NETHERITE_CHISEL, Items.NETHERITE_INGOT, recipeExporter);

        recipeBuilder.CrushedOreRecipes(ModItems.CRUSHED_COAL, Items.COAL, recipeExporter);
        recipeBuilder.CrushedOreRecipes(ModItems.CRUSHED_COPPER, Items.RAW_COPPER, recipeExporter);
        recipeBuilder.CrushedOreRecipes(ModItems.CRUSHED_GOLD, Items.RAW_GOLD, recipeExporter);
        recipeBuilder.CrushedOreRecipes(ModItems.CRUSHED_IRON, Items.RAW_IRON, recipeExporter);
        recipeBuilder.CrushedOreRecipes(Items.COBBLESTONE, Items.STONE, recipeExporter);
        recipeBuilder.CrushedOreRecipes(Items.GRAVEL, Items.COBBLESTONE, recipeExporter);
        recipeBuilder.CrushedOreRecipes(Items.SAND, Items.GRAVEL, recipeExporter);
        recipeBuilder.CrushedOreRecipes(Items.SOUL_SAND, Items.SOUL_SOIL, recipeExporter);

        recipeBuilder.eggRecipe(Items.ALLAY_SPAWN_EGG, Items.AMETHYST_SHARD, recipeExporter);
        recipeBuilder.eggRecipe(Items.AXOLOTL_SPAWN_EGG, Items.TROPICAL_FISH, recipeExporter);
        recipeBuilder.eggRecipe(Items.BEE_SPAWN_EGG, Items.HONEYCOMB, recipeExporter);
        recipeBuilder.eggRecipe(Items.CAT_SPAWN_EGG, Items.COD, recipeExporter);
        recipeBuilder.eggRecipe(Items.CHICKEN_SPAWN_EGG, Items.FEATHER, recipeExporter);
        recipeBuilder.eggRecipe(Items.COW_SPAWN_EGG, Items.LEATHER, recipeExporter);
        recipeBuilder.eggRecipe(Items.FROG_SPAWN_EGG, Items.MUD, recipeExporter);
        recipeBuilder.eggRecipe(Items.HORSE_SPAWN_EGG, Items.HAY_BLOCK, recipeExporter);
        recipeBuilder.eggRecipe(Items.IRON_GOLEM_SPAWN_EGG, Items.IRON_BLOCK, recipeExporter);
        recipeBuilder.eggRecipe(Items.LLAMA_SPAWN_EGG, Items.WHITE_CARPET, recipeExporter);
        recipeBuilder.eggRecipe(Items.MOOSHROOM_SPAWN_EGG, Items.RED_MUSHROOM, recipeExporter);
        recipeBuilder.eggRecipe(Items.PARROT_SPAWN_EGG, Items.WHEAT_SEEDS, recipeExporter);
        recipeBuilder.eggRecipe(Items.PIG_SPAWN_EGG, Items.PORKCHOP, recipeExporter);
        recipeBuilder.eggRecipe(Items.RABBIT_SPAWN_EGG, Items.RABBIT_HIDE, recipeExporter);
        recipeBuilder.eggRecipe(Items.SHEEP_SPAWN_EGG, Items.WHITE_WOOL, recipeExporter);
        recipeBuilder.eggRecipe(Items.SNOW_GOLEM_SPAWN_EGG, Items.SNOW_BLOCK, recipeExporter);
        recipeBuilder.eggRecipe(Items.VILLAGER_SPAWN_EGG, Items.EMERALD_BLOCK, recipeExporter);
        recipeBuilder.eggRecipe(Items.WOLF_SPAWN_EGG, Items.MUTTON, recipeExporter);

        recipeBuilder.eggRecipe(Items.BLAZE_SPAWN_EGG, Items.BLAZE_ROD, recipeExporter);
        recipeBuilder.eggRecipe(Items.CREEPER_SPAWN_EGG, Items.GUNPOWDER, recipeExporter);
        recipeBuilder.eggRecipe(Items.DROWNED_SPAWN_EGG, Items.NAUTILUS_SHELL, recipeExporter);
        recipeBuilder.eggRecipe(Items.ENDERMAN_SPAWN_EGG, Items.ENDER_PEARL, recipeExporter);
        recipeBuilder.eggRecipe(Items.EVOKER_SPAWN_EGG, Items.BOOKSHELF, recipeExporter);
        recipeBuilder.eggRecipe(Items.GHAST_SPAWN_EGG, Items.GHAST_TEAR, recipeExporter);
        recipeBuilder.eggRecipe(Items.GUARDIAN_SPAWN_EGG, Items.PRISMARINE_SHARD, recipeExporter);
        recipeBuilder.eggRecipe(Items.MAGMA_CUBE_SPAWN_EGG, Items.MAGMA_CREAM, recipeExporter);
        recipeBuilder.eggRecipe(Items.PIGLIN_SPAWN_EGG, Items.GOLD_INGOT, recipeExporter);
        recipeBuilder.eggRecipe(Items.PILLAGER_SPAWN_EGG, Items.WHITE_BANNER, recipeExporter);
        recipeBuilder.eggRecipe(Items.SHULKER_SPAWN_EGG, Items.SHULKER_SHELL, recipeExporter);
        recipeBuilder.eggRecipe(Items.SKELETON_SPAWN_EGG, Items.BONE, recipeExporter);
        recipeBuilder.eggRecipe(Items.SLIME_SPAWN_EGG, Items.SLIME_BALL, recipeExporter);
        recipeBuilder.eggRecipe(Items.SPIDER_SPAWN_EGG, Items.COBWEB, recipeExporter);
        recipeBuilder.eggRecipe(Items.VINDICATOR_SPAWN_EGG, Items.BLACK_BANNER, recipeExporter);
        recipeBuilder.eggRecipe(Items.WITCH_SPAWN_EGG, Items.GLASS_BOTTLE, recipeExporter);
        recipeBuilder.eggRecipe(Items.WITHER_SPAWN_EGG, Items.WITHER_SKELETON_SKULL, recipeExporter);
        recipeBuilder.eggRecipe(Items.WITHER_SKELETON_SPAWN_EGG, Items.COAL, recipeExporter);
        recipeBuilder.eggRecipe(Items.ZOMBIE_SPAWN_EGG, Items.ROTTEN_FLESH, recipeExporter);
        recipeBuilder.eggRecipe(Items.ZOMBIE_VILLAGER_SPAWN_EGG, Items.EMERALD, recipeExporter);
        recipeBuilder.eggRecipe(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, Items.GOLD_NUGGET, recipeExporter);

        recipeBuilder.HammerRecipes(ModItems.STONE_HAMMER, Blocks.COBBLESTONE, recipeExporter);
        recipeBuilder.HammerRecipes(ModItems.IRON_HAMMER, Items.IRON_INGOT, recipeExporter);
        recipeBuilder.HammerRecipes(ModItems.DIAMOND_HAMMER, Items.DIAMOND, recipeExporter);
        recipeBuilder.HammerRecipes(ModItems.NETHERITE_HAMMER, Items.NETHERITE_INGOT, recipeExporter);

        recipeBuilder.horseArmorRecipes(Items.LEATHER_HORSE_ARMOR, Items.LEATHER, recipeExporter);
        recipeBuilder.horseArmorRecipes(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, recipeExporter);
        recipeBuilder.horseArmorRecipes(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, recipeExporter);
        recipeBuilder.horseArmorRecipes(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, recipeExporter);

        recipeBuilder.TinyFuelRecipes(ModItems.TINY_CHARCOAL, Items.CHARCOAL, recipeExporter);
        recipeBuilder.TinyFuelRecipes(ModItems.TINY_COAL, Items.COAL, recipeExporter);
    }
}
