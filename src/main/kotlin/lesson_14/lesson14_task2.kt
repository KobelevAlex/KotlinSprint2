package lesson_14

open class Liner1(
    val name: String = "Лайнер",
    var speed: Double = 30.0,
    var passengerCapacity: Int = 1000,
) {
    open fun displayInfo() {
        println("Корабль: $name")
        println("Скорость: $speed узлов")
        println("Вместимость пассажиров: $passengerCapacity")
    }
    open fun unloadingMethod(){
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1(
    name: String = "Грузовой Корабль",
    speed: Double = 20.0,
    passengerCapacity: Int = 100,
    var cargoCapacity: Double = 10000.0,
) : Liner1(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъемность: $cargoCapacity тонн")
    }
    override fun unloadingMethod(){
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1(
    name: String = "Ледокол",
    speed: Double = 15.0,
    passengerCapacity: Int = 50,
    var iceBreakingAbility: Boolean = true,
) : Liner1(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Способность колоть лёд: $iceBreakingAbility")
    }

    override fun unloadingMethod(){
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner1()
    val cargoShip = CargoShip1()
    val icebreaker = Icebreaker1()
    println("Информация о лайнере:")
    liner.displayInfo()
    liner.unloadingMethod()
    println()
    println("Информация о грузовом корабле:")
    cargoShip.displayInfo()
    cargoShip.unloadingMethod()
    println()
    println("Информация о ледоколе:")
    icebreaker.displayInfo()
    icebreaker.unloadingMethod()
}