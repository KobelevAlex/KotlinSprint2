package lesson_17

class Ship(private var _name: String, private val _averageSpeed: Int, private val _homePackage: String) {
    var name: String
        get() = _name
        set(value) {
            if (value == _name) _name = value
            else println("Вы не можете менять название корабля!")
        }
    val averageSpeed: Int
        get() = _averageSpeed
    val homePackage: String
        get() = _homePackage
}

fun main() {
    val ship = Ship("Победа", 30, "Порт №2")
    println("Название корабля - ${ship.name}")
    ship.name = "Беда"
    println("Новое название корабля - ${ship.name}")
}

