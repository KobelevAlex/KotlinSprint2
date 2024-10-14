package lesson_8

fun main() {

    val listOfIngredientsForСharlotte = arrayOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")
    fun listOfIngredients() {
        println("Список ингредиентов в шарлотке:")
        for (i in listOfIngredientsForСharlotte.indices) {
            println("${i + 1} - ${listOfIngredientsForСharlotte[i]}")
        }
    }

    listOfIngredients()

    println("Напишите название ингредиента,который хотите заменить:")

    var userInterIngredient = readln()

    while (userInterIngredient !in listOfIngredientsForСharlotte) {
        println(
            "Такого ингредиента в рецепте нет. Напишите название ингредиента," +
                    "который есть в рецепте и хотите его заменить:"
        )
        userInterIngredient = readln()
    }

    println(
        """
        Ингредиент "$userInterIngredient" в рецепте есть!
        Напишите на какой ингредиент меняем:
    """.trimIndent()
    )

    val anIndigenousReplacement = readln()
    val userIngredient = listOfIngredientsForСharlotte.indexOf(userInterIngredient)

    listOfIngredientsForСharlotte[userIngredient] = anIndigenousReplacement

    println("Готово! Вы сохранили следующий список.")

    listOfIngredients()

}
