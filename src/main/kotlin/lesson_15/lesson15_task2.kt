package lesson_15

abstract class WeatherStationStats

val listWeatherValues: MutableList<WeatherStationStats> = mutableListOf()
fun addValue(value: WeatherStationStats) {
    listWeatherValues.add(value)
}

class Temperature(val value: Int) : WeatherStationStats()
class PrecipitationAmount(val value: Int) : WeatherStationStats()
class WeatherServer {
    fun sendMessage(weatherStationStats: WeatherStationStats) {
        if (listWeatherValues.isEmpty()) {
            println("У вас пока нет данных о погоде.")
        } else listWeatherValues.forEach { it ->
            when (it) {
                is Temperature -> println("Температура - ${it.value} градусов.")
                is PrecipitationAmount -> println("Количество осадком - ${it.value} мм.")
            }
        }
    }
}

fun main() {
    val temperature = Temperature(20)
    val precipitationAmount = PrecipitationAmount(10)
    addValue(Temperature(25))
    addValue(PrecipitationAmount(5))
    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}

