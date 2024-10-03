package lesson_4

fun main() {
    println("Есть ли повреждения корпуса?  Укажите - true или false!")
    val damageToTheHousing: Boolean = readLine()?.toBoolean() ?: false

    println("Введите Количество экипажа:")
    val numberOfCrew: Int = readLine()?.toInt() ?: 0

    println("Введите количество ящиков с провизией на борту:")
    val numberOfFoodCrates: Int = readLine()?.toInt() ?: 0

    println("Благоприятность метеоусловий?  Укажите - true или false!")
    val favorableWeatherConditions: Boolean = readLine()?.toBoolean() ?: false


    println("Текущий состав экипажа: $numberOfCrew")
    println("Наличие повреждений корпуса: $damageToTheHousing")
    println("Количество ящиков с провизией на борту: $numberOfFoodCrates")
    println("Благоприятность метеоусловий: $favorableWeatherConditions")
    println(
        "Может ли корабль отправиться в плавание: " +
                "${
                    ((damageToTheHousing == false) &&
                            (numberOfCrew >= 55 && numberOfCrew <= 70) &&
                            (numberOfFoodCrates > 50) &&
                            (favorableWeatherConditions == true)) ||
                            ((numberOfCrew == 70) &&
                                    (favorableWeatherConditions == true) &&
                                    (numberOfFoodCrates >= 50) &&
                                    (damageToTheHousing == true))
                }"
    )

}