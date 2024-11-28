package lesson_15

interface Move {
    fun move()
}

interface CargoTransport {
    var currentWeightOfCargo: Int
    val maxWeightOfCargo: Int
    fun loadCargo(quantityCargo: Int)
    fun unloadCargo(quantityCargo: Int)
}

interface PassengerTransport {
    var currentNumberPassenger: Int
    val maxNumberPassenger: Int
    fun loadPassenger(quantityPassengers: Int)
    fun unloadPassenger(quantityPassengers: Int)
}

class Truck : CargoTransport, PassengerTransport, Move {
    override var currentNumberPassenger = 0
    override var currentWeightOfCargo = 0
    override val maxWeightOfCargo = 2
    override val maxNumberPassenger = 1
    override fun loadCargo(quantityCargo: Int) {
        if (currentWeightOfCargo + quantityCargo <= maxWeightOfCargo) {
            currentWeightOfCargo += quantityCargo
            println("Грузовик загрузил $quantityCargo тонн груза. Текущий груз: $currentWeightOfCargo тонн.")
        } else println("Недостаточно места для груза!")
    }

    override fun unloadCargo(quantityCargo: Int) {
        if (currentWeightOfCargo >= quantityCargo) {
            currentWeightOfCargo -= quantityCargo
            println("Грузовик выгрузил $quantityCargo тонн груза. Текущий груз: $currentWeightOfCargo тонн.")
        } else println("В грузовике нет столько груза.")
    }

    override fun loadPassenger(quantityPassengers: Int) {
        if (quantityPassengers == 1 && currentNumberPassenger < maxNumberPassenger) {
            currentNumberPassenger += quantityPassengers
            println("Грузовик посадил $quantityPassengers чел. Текущее количество пассажиров: $currentNumberPassenger чел.")
        } else {
            println("Можно перевозить только одного пассажира!")
        }
    }

    override fun unloadPassenger(quantityPassengers: Int) {
        if (currentNumberPassenger - quantityPassengers != maxNumberPassenger) {
            currentNumberPassenger -= quantityPassengers
            println("Грузовик высадил $quantityPassengers чел. Текущее количество пассажиров: $currentNumberPassenger чел.")
        } else println("В грузовике нет пассажиров!")
    }

    override fun move() {
        println("Грузовик едет!")
    }
}

class PassengerCar : PassengerTransport, Move {
    override var currentNumberPassenger = 0
    override val maxNumberPassenger = 3
    override fun loadPassenger(quantityPassengers: Int) {
        if (currentNumberPassenger + quantityPassengers <= maxNumberPassenger) {
            currentNumberPassenger += quantityPassengers
            println("Автомобиль посадил $quantityPassengers чел. Текущее количество пассажиров: $currentNumberPassenger чел.")
        } else println("В автомобиле недостаточно мест для посадки!")
    }

    override fun unloadPassenger(quantityPassengers: Int) {
        if (currentNumberPassenger - quantityPassengers != maxNumberPassenger) {
            currentNumberPassenger -= quantityPassengers
            println("Автомобиль высадил $quantityPassengers чел. Текущее количество пассажиров: $currentNumberPassenger чел.")
        } else println("В автомобиле нет пассажиров!")
    }

    override fun move() {
        println("Автомобиль едет!")
    }
}

fun main() {
    val truck = Truck()
    val passengerCar1 = PassengerCar()
    truck.loadCargo(2)
    truck.loadPassenger(1)
    truck.move()
    truck.unloadPassenger(1)
    truck.unloadCargo(2)
    passengerCar1.loadPassenger(3)
    passengerCar1.move()
    passengerCar1.unloadPassenger(3)
    passengerCar1.loadPassenger(2)
    passengerCar1.move()
    passengerCar1.unloadPassenger(2)
}

