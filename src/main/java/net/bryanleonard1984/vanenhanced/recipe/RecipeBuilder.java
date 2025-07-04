package net.bryanleonard1984.vanenhanced.recipe;

import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.*;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class RecipeBuilder
{
    public RecipeBuilder() {}

    public void HammerRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" IS")
                .pattern(" SI")
                .pattern("S  ")
                .input('I', input).input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public void ChiselRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("S  ")
                .pattern(" I ")
                .pattern("  I")
                .input('I', input).input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public void TinyFuelRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        offerShapelessRecipe(recipeExporter, output, input, "tiny_fuel", 8);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, input)
                .input(output).input(output).input(output).input(output)
                .input(output).input(output).input(output).input(output)
                .criterion(hasItem(output), conditionsFromItem(output))
                .offerTo(recipeExporter);
    }

    public void CrushedOreRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 2)
                .input(ModTags.Items.HAMMERS).input(input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public void eggRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern("###")
                .pattern("#E#")
                .pattern("###")
                .input('#', input).input('E', Items.EGG)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(recipeExporter);
    }

    public void horseArmorRecipes(ItemConvertible output, ItemConvertible input, RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern("#  ")
                .pattern("#S#")
                .pattern("# #")
                .input('#', input).input('S', Items.SADDLE)
                .criterion(hasItem(Items.SADDLE), conditionsFromItem(Items.SADDLE))
                .offerTo(recipeExporter);
    }
}
