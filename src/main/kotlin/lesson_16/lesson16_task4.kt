package lesson_16

class Order(private val numberOrder: String, var statusOrder: String = "В обработке!") {
    val listOrderAdmin: MutableList<Order> = mutableListOf()
    fun addOrderAdmin(order: Order) {
        listOrderAdmin.add(order)
        changStatusOrder(order)
    }

    fun printInfoOrder(order: Order) {
        println("Заказ №${order.numberOrder} - ${order.statusOrder}")
    }

    private fun changStatusOrder(order: Order) {
        order.statusOrder = if (order in listOrderAdmin) {
            "Заказ готов!"
        } else order.statusOrder
    }
}

fun main() {
    val order = Order("1")
    val order2 = Order("2")
    order.printInfoOrder(order)
    order.addOrderAdmin(order)
    order.printInfoOrder(order)
    order2.printInfoOrder(order2)
    order2.addOrderAdmin(order2)
    order2.printInfoOrder(order2)
}