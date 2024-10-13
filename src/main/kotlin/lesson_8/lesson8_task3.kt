package lesson_8

fun main() {

    val listOfIngredientsАorСharlotte = arrayListOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")

    println("Напишите название ингредиента:")

    val userInterIngredient = readln()
    val ingredientTrueOrFalse = listOfIngredientsАorСharlotte.contains(userInterIngredient)

    if (ingredientTrueOrFalse == true) println("Ингредиент \"$userInterIngredient\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")


}