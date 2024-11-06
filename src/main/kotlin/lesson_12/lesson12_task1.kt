package lesson_12

class Weather() {
    var daytimeTemperature: Int = 25
    var nightTemperature: Int = 15
    var presenceOfPrecipitationDuringTheDay: Boolean = true

    fun printInfo() {
        println(
            """
            - дневная температура - $daytimeTemperature
            - ночная температура - $nightTemperature
            - наличие осадков в течение суток - $presenceOfPrecipitationDuringTheDay
        """.trimIndent()
        )
    }
}

fun main() {
    val day1 = Weather()
    val day2 = Weather()
    day1.daytimeTemperature = 30
    day1.nightTemperature = 22
    day1.presenceOfPrecipitationDuringTheDay = false
    day2.daytimeTemperature = 28
    day2.nightTemperature = 25
    day2.presenceOfPrecipitationDuringTheDay = true
    println("Погода в первый день")
    day1.printInfo()
    println("Погода во второй день")
    day2.printInfo()
}
