package lesson_4

fun main() {
    val sunnyWeather = true
    val outDoorAwning = true
    val AIR_HUMIDITY = 20
    val CURRENT_TIME_OF_YEAR = "Не зима"

    var weatherTodaysunny = true
    var outDoorAwningAtTheMoment = true
    var airHumidity = 20
    var currentTimeOfTheYear = "Зима"

    var checkingTheConditions =
        ((weatherTodaysunny == sunnyWeather) && (outDoorAwningAtTheMoment == outDoorAwning) && (airHumidity == AIR_HUMIDITY) && (currentTimeOfTheYear == CURRENT_TIME_OF_YEAR))

    println("Благоприятные ли условия сейчас для роста бобовых? $checkingTheConditions")
}