package lesson_14

open class Liner(
    val name: String = "Лайнер",
    var speed: Double = 30.0,
    var passengerCapacity: Int = 1000,
) {
    open fun displayInfo() {
        println("Корабль: $name")
        println("Скорость: $speed узлов")
        println("Вместимость пассажиров: $passengerCapacity")
    }
}

class CargoShip(
    name: String = "Грузовой Корабль",
    speed: Double = 20.0,
    passengerCapacity: Int = 100,
    var cargoCapacity: Double = 10000.0,
) : Liner(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

class Icebreaker(
    name: String = "Ледокол",
    speed: Double = 15.0,
    passengerCapacity: Int = 50,
    var iceBreakingAbility: Boolean = true,
) : Liner(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Способность колоть лёд: $iceBreakingAbility")
    }
}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
    println("Информация о лайнере:")
    liner.displayInfo()
    println()
    println("Информация о грузовом корабле:")
    cargoShip.displayInfo()
    println()
    println("Информация о ледоколе:")
    icebreaker.displayInfo()
}

