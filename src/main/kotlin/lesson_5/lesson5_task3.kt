package lesson_5

fun main() {
    val firstNumber = 15
    val secondNumber = 35

    println("Нужно угадать два числа от 0 до 42")

    println("Введите первое число:")
    val userFirstNumber: Int = readln().toInt()
    println("Ваше первое число - $userFirstNumber")

    println("Введите второе число:")
    val userSecondNumber: Int = readln().toInt()
    println("Ваше второе число - $userSecondNumber")

    println("Ваши числа: $userFirstNumber и $userSecondNumber")
    println("Были загаданы - $firstNumber и $secondNumber")
    if ((userFirstNumber == firstNumber && userSecondNumber == secondNumber) ||
        (userFirstNumber == secondNumber && userSecondNumber == firstNumber)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userFirstNumber == firstNumber && userSecondNumber != secondNumber) ||
        (userFirstNumber != firstNumber && userSecondNumber == secondNumber) ||
        (userFirstNumber == secondNumber && userSecondNumber != firstNumber) ||
        (userFirstNumber != secondNumber && userSecondNumber == firstNumber)
    ) {
        println("Вы угадали одно число и выиграли утешительный приз!")
    } else println("Неудача!")
}