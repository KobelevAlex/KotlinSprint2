package lesson_8

fun main() {

    val listOfIngredientsForСharlotte = arrayOf("яйцо", "мука", "сода", "сахар", "молоко", "яблоки")

    fun listOfIngredients() {
        println("Список ингредиентов для шарлотки:")
        for (i in listOfIngredientsForСharlotte.indices) {
            println("${i + 1} - ${listOfIngredientsForСharlotte[i]}")
        }
    }

    listOfIngredients()

    println("Напишите название ингредиента,который хотите заменить:")

    var userInterIngredient = readln()
    var userIngredient = listOfIngredientsForСharlotte.indexOf(userInterIngredient)

    while (userIngredient < 0) {
        println(
            "Такого ингредиента в рецепте нет. Напишите название ингредиента," +
                    "который есть в рецепте и хотите его заменить:"
        )
        userInterIngredient = readln()
        userIngredient = listOfIngredientsForСharlotte.indexOf(userInterIngredient)
    }

    println(
        """
        Ингредиент "$userInterIngredient" в рецепте есть!
        Напишите на какой ингредиент меняем:
    """.trimIndent()
    )

    val anIndigenousReplacement = readln()


    listOfIngredientsForСharlotte[userIngredient] = anIndigenousReplacement

    println("Готово! Вы сохранили следующий список.")

    listOfIngredients()

}
