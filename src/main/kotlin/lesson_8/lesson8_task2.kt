package lesson_8

fun main() {
    val listOfIngredientsАorСharlotte = arrayOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")

    println("Напишите название ингредиента:")

    val userInterIngredient = readln()
    var found = false

    for (i in listOfIngredientsАorСharlotte) {

        if (i == userInterIngredient) {
            found = true
            break
        }
    }
    if (found == true) println("Ингредиент \"$userInterIngredient\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}




