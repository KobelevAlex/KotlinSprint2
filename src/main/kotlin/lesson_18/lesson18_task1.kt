package lesson_18

class Order(val number: Int) {
    fun printInfoOrder(items: Any) {
        when (items) {
            is String -> println("Заказан товар №$number: $items")
            is List<*> -> println("Заказаны следующие товары №$number: ${items.joinToString(", ")}")
            else -> println("Неправильный тип данных")
        }
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printInfoOrder("Гречка")
    order2.printInfoOrder(listOf("Яблоки", "вишня", "капуста."))
}
