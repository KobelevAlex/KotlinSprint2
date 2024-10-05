package lesson_5

fun main() {
    val userAge: Int
    val AGE_OF_MAJORITY = 18
    val currentYear = 2024

    println("Введите ваш год рождения (например: 2002)")

    val userYearOfBirth: Int = readln().toInt()

    userAge = currentYear - userYearOfBirth

    if (userAge < AGE_OF_MAJORITY) {
        println("Вернуться на главный экран приложения")
    } else println("Показать экран со скрытым контентом")

}