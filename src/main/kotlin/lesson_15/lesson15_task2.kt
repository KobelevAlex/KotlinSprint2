package lesson_15

abstract class WeatherStationStats {
    abstract fun addValue(value: WeatherStationStats)
    val listWeatherValues: MutableList<WeatherStationStats> = mutableListOf()
}

class Temperature(val value: Int) : WeatherStationStats() {
    override fun addValue(value: WeatherStationStats) {
        listWeatherValues.add(value)
    }
}

class PrecipitationAmount(val value: Int) : WeatherStationStats() {
    override fun addValue(value: WeatherStationStats) {
        listWeatherValues.add(value)
    }
}

class WeatherServer {
    fun sendMessage(weatherStationStats: WeatherStationStats) {
        if (weatherStationStats.listWeatherValues.isEmpty()) {
            println("У вас пока нет данных о погоде.")
        } else weatherStationStats.listWeatherValues.forEach { it ->
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
    temperature.addValue(temperature)
    precipitationAmount.addValue(precipitationAmount)
    temperature.addValue(Temperature(25))
    precipitationAmount.addValue(PrecipitationAmount(5))
    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}

