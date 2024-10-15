package lesson_9

fun main() {

    val listIndigenous = mutableListOf("лук", "картошка", "капуста")

    fun printList() {
        listIndigenous.forEach {
            println("- $it")
        }
    }

    println("В рецепте щей есть базовые ингредиенты:")

    printList()

    println("Желаете добавить ещё? (да/нет)")

    val yesOrNo = readln()

    if (yesOrNo != "да") {
        println("Рецепт закрыт!")
        return
    }
    println("Какой ингредиент вы хотите добавить?")

    listIndigenous.add(readln())

    println("Теперь в рецепте есть следующие ингредиенты:")

    printList()
}