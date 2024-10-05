package lesson_4

fun main() {
    val NUMBER_OF_CREW_MIN = 55
    val NUMBER_OF_CREW_MAX = 70
    val NUMBER_OF_FOOD_CRATES_MIN = 50
    val weatherIsGood = true
    val thereIsDamage = true
    val thereIsNoDamage = false

    println("Есть ли повреждения корпуса?  Укажите - true или false!")
    val damageToTheHousing: Boolean = readln().toBoolean()

    println("Введите Количество экипажа:")
    val numberOfCrew: Int = readln().toInt()

    println("Введите количество ящиков с провизией на борту:")
    val numberOfFoodCrates: Int = readln().toInt()

    println("Благоприятность метеоусловий?  Укажите - true или false!")
    val favorableWeatherConditions: Boolean = readln().toBoolean()

    println("Текущий состав экипажа: $numberOfCrew")
    println("Наличие повреждений корпуса: $damageToTheHousing")
    println("Количество ящиков с провизией на борту: $numberOfFoodCrates")
    println("Благоприятность метеоусловий: $favorableWeatherConditions")
    println(
        "Может ли корабль отправиться в плавание: " +
                "${
                    ((damageToTheHousing == thereIsNoDamage) &&
                            (numberOfCrew >= NUMBER_OF_CREW_MIN && numberOfCrew <= NUMBER_OF_CREW_MAX) &&
                            (numberOfFoodCrates > NUMBER_OF_FOOD_CRATES_MIN) &&
                            (favorableWeatherConditions == weatherIsGood)) ||
                            ((numberOfCrew == NUMBER_OF_CREW_MAX) &&
                                    (favorableWeatherConditions == weatherIsGood) &&
                                    (numberOfFoodCrates >= NUMBER_OF_FOOD_CRATES_MIN) &&
                                    (damageToTheHousing == thereIsDamage))
                }"
    )

}