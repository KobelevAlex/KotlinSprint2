package lesson_11

class RecipeCategory(
    val nameRecipeCategory: String,
    var coverRecipeCategory: String,
    val describeRecipeCategory: String,
    private val listRecipeCategory: MutableList<RecipeCategory> = mutableListOf(),
    var favourites: Boolean = false,
)

class Recipe(
    val nameRecipe: String,
    var coverRecipe: String,
    private val listRecipe: MutableList<Recipe> = mutableListOf(),
    private val cookingMethod: MutableList<String> = mutableListOf(),
    var favourites: Boolean = false,
)

class Ingredient(
    val nameIngredient: String,
    var coverIngredient: String,
    var numberOfServings: Int,
    var quantity: Int,
    var unitOfMeasurement: String,
    var cookingMethod: String,
    private val listIngredient: MutableList<Ingredient> = mutableListOf(),
    var favourites: Boolean = false,
)