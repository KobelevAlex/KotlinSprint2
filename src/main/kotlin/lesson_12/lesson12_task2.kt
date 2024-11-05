package lesson_12

class WeatherOutside(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var presenceOfPrecipitationDuringTheDay: Boolean,
) {

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
    val day1 = WeatherOutside(30, 15,false)
    val day2 = WeatherOutside(24, 12, true)
    println("Погода в первый день")
    day1.printInfo()
    println("Погода во второй день")
    day2.printInfo()



}