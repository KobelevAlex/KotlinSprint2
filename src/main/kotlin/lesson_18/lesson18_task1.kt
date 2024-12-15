package lesson_18

class Order(val number: Int) {
    fun printInfoOrder(items: String) {
        println("Заказан товар №$number: $items")
    }

    fun printInfoOrder(items: List<*>) {
        println("Заказаны следующие товары №$number: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printInfoOrder("Гречка")
    order2.printInfoOrder(listOf("Яблоки", "вишня", "капуста."))
}
