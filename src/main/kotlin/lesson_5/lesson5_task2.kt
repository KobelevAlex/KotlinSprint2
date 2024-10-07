package lesson_5

const val AGE_OF_MAJORITY = 18
fun main() {
    val userAge: Int
    val currentYear = 2024

    println("Введите ваш год рождения (например: 2002)")

    val userYearOfBirth: Int = readln().toInt()

    userAge = currentYear - userYearOfBirth

    if (userAge < AGE_OF_MAJORITY) {
        println("Вернуться на главный экран приложения")
    } else println("Показать экран со скрытым контентом")

}