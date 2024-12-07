package lesson_17

class Package(private val number: String, startLocation: String) {
    private var movementCounter: Int = 0
    var currentLocation: String = startLocation
        set(value) {
            field = value
            movementCounter++
        }

    private fun getMovementCounter(): Int {
        return movementCounter
    }

    fun getInfo(): String {
        return "Посылка №$number сейчас находится на - $currentLocation. Количество перемещений - ${getMovementCounter()}"
    }
}

fun main() {
    val packege1 = Package("12345", "Склад1")
    println(packege1.getInfo())
    packege1.currentLocation = "Склад2"
    println(packege1.getInfo())
    packege1.currentLocation = "Склад3"
    println(packege1.getInfo())
}




