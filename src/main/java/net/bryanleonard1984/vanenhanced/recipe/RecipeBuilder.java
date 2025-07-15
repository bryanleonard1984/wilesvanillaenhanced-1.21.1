package net.bryanleonard1984.vanenhanced.recipe;

import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.*;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class RecipeBuilder
{
    public RecipeBuilder() {}

    public static void HammerRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" IS")
                .pattern(" SI")
                .pattern("S  ")
                .input('I', input).input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public static void ChiselRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("S  ")
                .pattern(" I ")
                .pattern("  I")
                .input('I', input).input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public static void CrushedOreRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 2)
                .input(ModTags.Items.HAMMERS).input(input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }
}
