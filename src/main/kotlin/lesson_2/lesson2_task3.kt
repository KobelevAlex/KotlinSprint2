package lesson_2


fun main() {
    val minutesInHours: Int = 60
    val trainDepartureHour: Int = 9
    val trainDepartureMinutes: Int = 39
    val minutesOnTheWay: Int = 457

    val totalMinutes: Int = trainDepartureMinutes + minutesOnTheWay
    val arrivalTimeHours: Int = trainDepartureHour + (totalMinutes / minutesInHours)
    val arrivalTimeMinutes: Int = totalMinutes % minutesInHours

    println("Время прибытия поезда - $arrivalTimeHours:$arrivalTimeMinutes")

}

