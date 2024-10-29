package lesson_11

class RecipeCategory(
    val nameRecipeCategory: String,
    var coverRecipeCategory: String,
    val describeRecipeCategory: String,
    private val listRecipeCategory: MutableList<RecipeCategory> = mutableListOf(),
    var favourites: Boolean = false,
) {
    fun addRecipeCategory(recipeCategory: RecipeCategory) {
        listRecipeCategory.add(recipeCategory)
        println("Добавлена новая категория - ${recipeCategory.nameRecipeCategory}")
    }

    fun removeRecipeCategory(recipeCategory: RecipeCategory) {
        listRecipeCategory.remove(recipeCategory)
        println("Была удалена категория - ${recipeCategory.nameRecipeCategory}")
    }
}

class Recipe(
    val nameRecipe: String,
    var coverRecipe: String,
    private val listRecipe: MutableList<Recipe> = mutableListOf(),
    var favourites: Boolean = false,
) {
    fun addRecipe(recipe: Recipe) {
        listRecipe.add(recipe)
        println("Добавлена новая категория - ${recipe.nameRecipe}")
    }

    fun removeRecipe(recipe: Recipe) {
        listRecipe.remove(recipe)
        println("Была удалена категория - ${recipe.nameRecipe}")
    }
}

class Ingredient(
    val nameIngredient: String,
    var coverIngredient: String,
    var numberOfServings: Int,
    var quantity: Int,
    var unitOfMeasurement: String,
    var cookingMethod: String,
    private val listIngredient: MutableList<Ingredient> = mutableListOf(),
    var favourites: Boolean = false,
) {
    fun addIngredient(ingredient: Ingredient) {
        listIngredient.add(ingredient)
        println("Добавлена новая категория - ${ingredient.nameIngredient}")
    }

    fun removeIngredient(ingredient: Ingredient) {
        listIngredient.remove(ingredient)
        println("Была удалена категория - ${ingredient.nameIngredient}")
    }
}