package lesson_4

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println(
        "Груз с весом $cargoWeight кг и объёмом $cargoVolume л, соответствует категории \"Average\": " +
                "${(cargoWeight > 35) && (cargoWeight < 100) && (cargoVolume < 100)}"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и объёмом $cargoVolume л, соответствует категории \"Average\": " +
                "${(cargoWeight > 35) && (cargoWeight < 100) && (cargoVolume < 100)}"
    )

    cargoWeight = 42
    cargoVolume = 99

    println(
        "Груз с весом $cargoWeight кг и объёмом $cargoVolume л, соответствует категории \"Average\": " +
                "${(cargoWeight > 35) && (cargoWeight < 100) && (cargoVolume < 100)}"
    )
}