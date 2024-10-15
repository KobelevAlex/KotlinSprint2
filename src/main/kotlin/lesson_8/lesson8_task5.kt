package lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")

    val numberIndigrients = readln().toInt()
    val listOfIngredientsUser: Array<String> = Array(numberIndigrients) { "" }

    println(numberIndigrients)
    for (i in listOfIngredientsUser.indices) {
        println("Введите ${i + 1} ингредиент:")
        listOfIngredientsUser[i] = readln()
    }

    println("Список ингредиентов:  ${listOfIngredientsUser.joinToString(", ")}")

}