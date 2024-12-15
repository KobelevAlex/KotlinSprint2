package lesson_18

class Order(numberOder: Int) {
    fun printInfoOrder(items: Any) {
        when (items) {
            is String -> println("Заказан товар: $items")
            is List<*> -> println("Заказаны следующие товары: ${items.joinToString(", ")}")
            else -> println("Неправильный тип данных")
        }
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printInfoOrder("Гречка")
    order2.printInfoOrder(listOf("яблоки", "вишня", "капуста"))
}
