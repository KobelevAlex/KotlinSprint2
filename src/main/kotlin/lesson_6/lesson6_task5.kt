package lesson_6

import kotlin.random.Random

fun main() {
    var firstNumber: Int
    var secondNumber: Int
    var result: Int
    var resultUser: Int
    var comparison = false
    val right = "Добро пожаловать!"
    val notRight = "Доступ запрещен."
    var attempt = 0

    println("Подтвердите, что вы не бот! У вас есть 3 попытки.")

    while (attempt <= 3 || comparison == false) {
        attempt++
        firstNumber = Random.nextInt(1, 10)
        secondNumber = Random.nextInt(1, 10)
        result = firstNumber + secondNumber

        println("Попытка №$attempt")
        println("Сколько будет: $firstNumber+$secondNumber")

        resultUser = readln().toInt()

        comparison = result == resultUser

        if (comparison == true) {
            println(right)
            break
        } else if (attempt == 3) {
            println(notRight)
            break
        }

    }


}