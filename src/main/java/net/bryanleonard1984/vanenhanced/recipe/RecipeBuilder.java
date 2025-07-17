package net.bryanleonard1984.vanenhanced.recipe;

import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.*;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class RecipeBuilder
{
    public static void CrushedOreRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 2)
                .input(ModTags.Items.HAMMERS).input(input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }
}
