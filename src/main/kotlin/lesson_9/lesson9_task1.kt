package lesson_9

fun main() {
    val listIndigenous = listOf<String>("лук", "картошка", "капуста", "морковь", "говядина", "соль")

    println("В рецепте есть следующие ингредиенты:")
    listIndigenous.forEach {
        println("- $it")

    }

}