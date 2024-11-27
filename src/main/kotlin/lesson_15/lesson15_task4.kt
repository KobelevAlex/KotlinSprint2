package lesson_15

open class Product(val name: String, var quantity: Int)
class Accessory(name: String, quantity: Int) : Product(name, quantity)
class Instrument(name: String, quantity: Int) : Product(name, quantity) {
    private val accessories = mutableListOf<Accessory>()
    fun addAccessory(accessory: Accessory) {
        accessories.add(accessory)
    }

    fun searchAccessories(instrument: Instrument) {
        println("Выполняется поиск...")
        Thread.sleep(3000)
        if (instrument.accessories.isNotEmpty()) {
            println("Найденные комплектующие для инструмента '${instrument.name}':")
            for (accessory in instrument.accessories) {
                println("- ${accessory.name} (Количество: ${accessory.quantity})")
            }
        } else {
            println("Комплектующие для инструмента '${instrument.name}' не найдены.")
        }
    }
}

fun main() {
    val guitar = Instrument("Гитара 6 струнная", 5)
    val stringSet = Accessory("Набор струн", 10)
    val tuner = Accessory("Тюнер", 7)
    guitar.addAccessory(stringSet)
    guitar.addAccessory(tuner)
    val violin = Instrument("Скрипка", 2)
    val stringSet2 = Accessory("Набор струн", 4)
    val bow = Accessory("Смычок", 1)
    violin.addAccessory(stringSet2)
    violin.addAccessory(bow)
    guitar.searchAccessories(guitar)
    violin.searchAccessories(violin)
}
