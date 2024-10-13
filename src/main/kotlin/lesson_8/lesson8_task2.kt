package lesson_8

fun main() {
    val listOfIngredientsАorСharlotte = arrayListOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")

    println("Напишите название ингредиента:")

    val userInterIngredient = readln()

    for (i in listOfIngredientsАorСharlotte.indices) {
        var ingredientTrueOralse: Boolean
        if (listOfIngredientsАorСharlotte[i] == userInterIngredient) {
            println("Ингредиент ${listOfIngredientsАorСharlotte[i]} в рецепте есть")
            break
        } else if ((listOfIngredientsАorСharlotte.size - 1) == i) println("Такого ингредиента в рецепте нет")

    }


}
