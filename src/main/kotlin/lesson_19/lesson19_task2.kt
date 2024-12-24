package lesson_19

enum class Category(private val displayName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное");

    fun getDisplayName(): String {
        return displayName
    }
}

data class Product(val name: String, val id: Int, val category: Category) {
    fun displayInfo() {
        println("Товар: $name, ID: $id, Категория: ${category.getDisplayName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Блокнот", 3, Category.STATIONERY)
    val product4 = Product("Кружка", 4, Category.MISCELLANEOUS)
    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()
    product4.displayInfo()
}
