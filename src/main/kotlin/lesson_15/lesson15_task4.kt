package lesson_15

open class Product(val name: String, var quantity: Int)
class Instrument(name: String, quantity: Int) : Product(name, quantity) {
    val accessories = mutableListOf<Accessory>()
    fun addAccessory(accessory: Accessory) {
        accessories.add(accessory)
    }
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)
interface AccessorySearch {
    fun searchAccessories(instrument: Instrument)
}

class AccessorySearcher : AccessorySearch {
    override fun searchAccessories(instrument: Instrument) {
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
    val searcher = AccessorySearcher()
    searcher.searchAccessories(guitar)
    searcher.searchAccessories(violin)
}
