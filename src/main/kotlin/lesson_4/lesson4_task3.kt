package lesson_4

fun main() {
    var weatherToday = true
    var awningAtTheMoment = true
    var airHumidity = 20
    var currentTimeOfTheYear = "Зима"


    var checkingTheConditions =
        ((weatherToday == true) && (awningAtTheMoment == true) && (airHumidity == 20) && (currentTimeOfTheYear != "Зима"))

    println("Благоприятные ли условия сейчас для роста бобовых? $checkingTheConditions")
}