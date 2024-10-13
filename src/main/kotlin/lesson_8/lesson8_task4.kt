package lesson_8

fun main() {

    val listOfIngredientsАorСharlotte = arrayListOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")
    fun listOfIngredients() {
        println("Список ингредиентов в шарлотке:")
        for (i in listOfIngredientsАorСharlotte.indices) {
            println("${i + 1} - ${listOfIngredientsАorСharlotte[i]}")
        }
    }

    listOfIngredients()

    println("Напишите название ингредиента,который хотите заменить:")

    var userInterIngredient = readln()
    var ingredientTrueOrFalse = listOfIngredientsАorСharlotte.contains(userInterIngredient)

    while (ingredientTrueOrFalse != true) {
        println(
            "Такого ингредиента в рецепте нет. Напишите название ингредиента," +
                    "который есть в рецепте и хотите его заменить:"
        )

        userInterIngredient = readln()

        ingredientTrueOrFalse = listOfIngredientsАorСharlotte.contains(userInterIngredient)

        if (ingredientTrueOrFalse == true) break

    }
    println(
        """
        Ингредиент "$userInterIngredient" в рецепте есть!
        Напишите на какой ингредиент меняем:
    """.trimIndent()
    )

    val anIndigenousReplacement = readln()

    for (i in listOfIngredientsАorСharlotte.indices) {
        if (listOfIngredientsАorСharlotte[i] == userInterIngredient) {
            listOfIngredientsАorСharlotte[i] = anIndigenousReplacement
            break
        }
    }

    listOfIngredients()

}
