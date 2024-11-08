package lesson_12

fun formatValue(value: Double): String {
    return String.format("%.2f", value)
}

fun List<Int>.averageValue(): Double {
    val value = if (this.isNotEmpty()) {
        this.sum().toDouble() / this.size
    } else {
        0.0
    }
    return value
}

class Weather(
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
    val numberCycles = 30
    val temperatureRange = 10..30
    val randomRange = 1..100
    val listDataWeatherForMonth: MutableList<Weather> = mutableListOf()
    val comparativeValue = 45
    for (i in 1..numberCycles) {
        val daytimeTemperature = temperatureRange.random()
        val nightTemperature = temperatureRange.random()
        val precipitation = randomRange.random() <= comparativeValue
        val dataWeatherForDay = Weather(daytimeTemperature, nightTemperature, precipitation)
        listDataWeatherForMonth.add(dataWeatherForDay)
    }
    val listTemperatureDay = listDataWeatherForMonth.map { it.daytimeTemperature }
    val listTemperatureNight = listDataWeatherForMonth.map { it.nightTemperature }
    val numberDayWithPrecipitation = (listDataWeatherForMonth.filter { it.presenceOfPrecipitationDuringTheDay }).size
    val averageValueDayTemperature = listTemperatureDay.averageValue()
    val averageValueNightTemperature = listTemperatureNight.averageValue()
    println("Среднее значение дневных температур за месяц - ${formatValue(averageValueDayTemperature)} `C")
    println("Среднее значение ночных температур за месяц - ${formatValue(averageValueNightTemperature)} `C")
    println("Количество дней с осадками за месяц - $numberDayWithPrecipitation дней")
}

