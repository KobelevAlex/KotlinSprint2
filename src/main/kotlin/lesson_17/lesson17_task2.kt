package lesson_17

class Ship(name: String, averageSpeed: Int, homePackage: String) {
    var name: String = name
        set(value) = println("Вы не можете менять название корабля!")
    val averageSpeed: Int = averageSpeed
    val homePackage: String = homePackage
}

fun main() {
    val ship = Ship("Победа", 30, "Порт №2")
    println("Название корабля - ${ship.name}")
    ship.name = "Беда"
    println("Новое название корабля - ${ship.name}")
}

