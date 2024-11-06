package lesson_12

const val CONVERSION_TO_DEGREES = 273

class WeatherTheCity(
    _daytimeTemperatureKelvin: Int,
    _nightTemperatureKelvin: Int,
    _presenceOfPrecipitationDuringTheDay: Boolean,
) {
    private val daytimeTemperatureDegrees = _daytimeTemperatureKelvin - CONVERSION_TO_DEGREES
    private val nightTemperatureDegrees = _nightTemperatureKelvin - CONVERSION_TO_DEGREES
    private val presenceOfPrecipitationDuringTheDay = _presenceOfPrecipitationDuringTheDay

    fun printInfo() {
        println(
            """
            - дневная температура: $daytimeTemperatureDegrees ^С
            - ночная температура: $nightTemperatureDegrees ^С
            - наличие осадков в течение суток: $presenceOfPrecipitationDuringTheDay
        """.trimIndent()
        )
    }
}

fun main() {
    val day1 = WeatherTheCity(273, 260, false)
    val day2 = WeatherTheCity(300, 290, true)
    println("Погода в первый день")
    day1.printInfo()
    println("Погода во второй день")
    day2.printInfo()
}

