package net.bryanleonard1984.vanenhanced.datagen;

import net.bryanleonard1984.vanenhanced.Wilesvanillaenhanced1211;
import net.bryanleonard1984.vanenhanced.block.ModBlocks;
import net.bryanleonard1984.vanenhanced.item.ModItems;
import static net.bryanleonard1984.vanenhanced.recipe.RecipeBuilder.*;
import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.bryanleonard1984.wileslib.util.RecipeBuilderLib.*;

public class ModRecipeGenerator extends FabricRecipeProvider
{
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
        final List<ItemConvertible> COPPER_EQUIPMENT_SMELTABLES = List.of(ModItems.COPPER_AXE, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_HOE, ModItems.COPPER_BOOTS, ModItems.COPPER_PICKAXE, ModItems.COPPER_HELMET,
            ModItems.COPPER_LEGGINGS, ModItems.COPPER_SWORD, ModItems.COPPER_SHOVEL);

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
        offerSmelting(recipeExporter, COPPER_EQUIPMENT_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 2.5f, 200, "copper_equipment_smelts");

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
        offerBlasting(recipeExporter, COPPER_EQUIPMENT_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 2.5f, 100, "copper_equipment_smelts");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.STICK), RecipeCategory.MISC, Items.TORCH,
                0.5f, 50).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING, 4)
                .input(ItemTags.WOOL).input(ModItems.MOD_SHEARS)
                .criterion(hasItem(ModItems.MOD_SHEARS), conditionsFromItem(ModItems.MOD_SHEARS))
                .offerTo(recipeExporter, "string_with_shears");

        offerShapelessRecipe(recipeExporter, Items.NETHER_WART, Blocks.NETHER_WART_BLOCK, "nether_wart", 4);

        ChiselRecipes(ModItems.IRON_CHISEL, Items.IRON_INGOT, recipeExporter);
        ChiselRecipes(ModItems.DIAMOND_CHISEL, Items.DIAMOND, recipeExporter);
        ChiselRecipes(ModItems.EMERALD_CHISEL, Items.EMERALD, recipeExporter);
        ChiselRecipes(ModItems.NETHERITE_CHISEL, Items.NETHERITE_INGOT, recipeExporter);

        CrushedOreRecipes(ModItems.CRUSHED_COAL, Items.COAL, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_COPPER, Items.RAW_COPPER, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_GOLD, Items.RAW_GOLD, recipeExporter);
        CrushedOreRecipes(ModItems.CRUSHED_IRON, Items.RAW_IRON, recipeExporter);
        CrushedOreRecipes(Items.COBBLESTONE, Items.STONE, recipeExporter);
        CrushedOreRecipes(Items.GRAVEL, Items.COBBLESTONE, recipeExporter);
        CrushedOreRecipes(Items.SAND, Items.GRAVEL, recipeExporter);
        CrushedOreRecipes(Items.SOUL_SAND, Items.SOUL_SOIL, recipeExporter);

        eggRecipe(Items.ALLAY_SPAWN_EGG, Items.AMETHYST_SHARD, recipeExporter);
        eggRecipe(Items.AXOLOTL_SPAWN_EGG, Items.TROPICAL_FISH, recipeExporter);
        eggRecipe(Items.BEE_SPAWN_EGG, Items.HONEYCOMB, recipeExporter);
        eggRecipe(Items.CAT_SPAWN_EGG, Items.COD, recipeExporter);
        eggRecipe(Items.CHICKEN_SPAWN_EGG, Items.FEATHER, recipeExporter);
        eggRecipe(Items.COW_SPAWN_EGG, Items.LEATHER, recipeExporter);
        eggRecipe(Items.FROG_SPAWN_EGG, Items.MUD, recipeExporter);
        eggRecipe(Items.HORSE_SPAWN_EGG, Items.HAY_BLOCK, recipeExporter);
        eggRecipe(Items.IRON_GOLEM_SPAWN_EGG, Items.IRON_BLOCK, recipeExporter);
        eggRecipe(Items.LLAMA_SPAWN_EGG, Items.WHITE_CARPET, recipeExporter);
        eggRecipe(Items.MOOSHROOM_SPAWN_EGG, Items.RED_MUSHROOM, recipeExporter);
        eggRecipe(Items.PARROT_SPAWN_EGG, Items.WHEAT_SEEDS, recipeExporter);
        eggRecipe(Items.PIG_SPAWN_EGG, Items.PORKCHOP, recipeExporter);
        eggRecipe(Items.RABBIT_SPAWN_EGG, Items.RABBIT_HIDE, recipeExporter);
        eggRecipe(Items.SHEEP_SPAWN_EGG, Items.WHITE_WOOL, recipeExporter);
        eggRecipe(Items.SNOW_GOLEM_SPAWN_EGG, Items.SNOW_BLOCK, recipeExporter);
        eggRecipe(Items.VILLAGER_SPAWN_EGG, Items.EMERALD_BLOCK, recipeExporter);
        eggRecipe(Items.WOLF_SPAWN_EGG, Items.MUTTON, recipeExporter);

        eggRecipe(Items.BLAZE_SPAWN_EGG, Items.BLAZE_ROD, recipeExporter);
        eggRecipe(Items.CREEPER_SPAWN_EGG, Items.GUNPOWDER, recipeExporter);
        eggRecipe(Items.DROWNED_SPAWN_EGG, Items.NAUTILUS_SHELL, recipeExporter);
        eggRecipe(Items.ENDERMAN_SPAWN_EGG, Items.ENDER_PEARL, recipeExporter);
        eggRecipe(Items.EVOKER_SPAWN_EGG, Items.BOOKSHELF, recipeExporter);
        eggRecipe(Items.GHAST_SPAWN_EGG, Items.GHAST_TEAR, recipeExporter);
        eggRecipe(Items.GUARDIAN_SPAWN_EGG, Items.PRISMARINE_SHARD, recipeExporter);
        eggRecipe(Items.MAGMA_CUBE_SPAWN_EGG, Items.MAGMA_CREAM, recipeExporter);
        eggRecipe(Items.PIGLIN_SPAWN_EGG, Items.GOLD_INGOT, recipeExporter);
        eggRecipe(Items.PILLAGER_SPAWN_EGG, Items.WHITE_BANNER, recipeExporter);
        eggRecipe(Items.SHULKER_SPAWN_EGG, Items.SHULKER_SHELL, recipeExporter);
        eggRecipe(Items.SKELETON_SPAWN_EGG, Items.BONE, recipeExporter);
        eggRecipe(Items.SLIME_SPAWN_EGG, Items.SLIME_BALL, recipeExporter);
        eggRecipe(Items.SPIDER_SPAWN_EGG, Items.COBWEB, recipeExporter);
        eggRecipe(Items.VINDICATOR_SPAWN_EGG, Items.BLACK_BANNER, recipeExporter);
        eggRecipe(Items.WITCH_SPAWN_EGG, Items.GLASS_BOTTLE, recipeExporter);
        eggRecipe(Items.WITHER_SPAWN_EGG, Items.WITHER_SKELETON_SKULL, recipeExporter);
        eggRecipe(Items.WITHER_SKELETON_SPAWN_EGG, Items.COAL, recipeExporter);
        eggRecipe(Items.ZOMBIE_SPAWN_EGG, Items.ROTTEN_FLESH, recipeExporter);
        eggRecipe(Items.ZOMBIE_VILLAGER_SPAWN_EGG, Items.EMERALD, recipeExporter);
        eggRecipe(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, Items.GOLD_NUGGET, recipeExporter);

        HammerRecipes(ModItems.STONE_HAMMER, Blocks.SMOOTH_STONE, recipeExporter);
        HammerRecipes(ModItems.IRON_HAMMER, Items.IRON_INGOT, recipeExporter);
        HammerRecipes(ModItems.DIAMOND_HAMMER, Items.DIAMOND, recipeExporter);
        HammerRecipes(ModItems.NETHERITE_HAMMER, Items.NETHERITE_INGOT, recipeExporter);

        horseArmorRecipes(Items.LEATHER_HORSE_ARMOR, Items.LEATHER, recipeExporter);
        horseArmorRecipes(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, recipeExporter);
        horseArmorRecipes(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, recipeExporter);
        horseArmorRecipes(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, recipeExporter);

        compactingRecipeWithEightItems(ModItems.TINY_CHARCOAL, Items.CHARCOAL, "tiny_fuel", recipeExporter);
        compactingRecipeWithEightItems(ModItems.TINY_COAL, Items.COAL, "tiny_fuel", recipeExporter);

        AxeRecipes(ModItems.COPPER_AXE, Items.COPPER_INGOT, recipeExporter, "copper_axe");
        AxeRecipes(ModItems.EMERALD_AXE, Items.EMERALD, recipeExporter, "emerald_axe");
        HoeRecipes(ModItems.COPPER_HOE, Items.COPPER_INGOT, recipeExporter, "copper_hoe");
        HoeRecipes(ModItems.EMERALD_HOE, Items.EMERALD, recipeExporter, "emerald_hoe");
        PickaxeRecipes(ModItems.COPPER_PICKAXE, Items.COPPER_INGOT, recipeExporter);
        PickaxeRecipes(ModItems.EMERALD_PICKAXE, Items.EMERALD, recipeExporter);
        ShovelRecipes(ModItems.COPPER_SHOVEL, Items.COPPER_INGOT, recipeExporter);
        ShovelRecipes(ModItems.EMERALD_SHOVEL, Items.EMERALD, recipeExporter);
        SwordRecipes(ModItems.COPPER_SWORD, Items.COPPER_INGOT, recipeExporter);
        SwordRecipes(ModItems.EMERALD_SWORD, Items.EMERALD, recipeExporter);
        BootsRecipes(ModItems.COPPER_BOOTS, Items.COPPER_INGOT, recipeExporter);
        BootsRecipes(ModItems.EMERALD_BOOTS, Items.EMERALD, recipeExporter);
        ChiselRecipes(ModItems.COPPER_CHESTPLATE, Items.COPPER_INGOT, recipeExporter);
        ChestplateRecipes(ModItems.EMERALD_CHESTPLATE, Items.EMERALD, recipeExporter);
        HelmetRecipes(ModItems.COPPER_HELMET, Items.COPPER_INGOT, recipeExporter);
        HelmetRecipes(ModItems.EMERALD_HELMET, Items.EMERALD, recipeExporter);
        LeggingsRecipes(ModItems.COPPER_LEGGINGS, Items.COPPER_INGOT, recipeExporter);
        LeggingsRecipes(ModItems.EMERALD_LEGGINGS, Items.EMERALD, recipeExporter);
    }
}
