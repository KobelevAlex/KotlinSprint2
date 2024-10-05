package lesson_5

import kotlin.random.Random

fun main() {
    var firstNumber: Int = Random.nextInt(1, 101)
    var secondNumber: Int = Random.nextInt(1, 101)
    var result = firstNumber + secondNumber
    var comparison: Boolean
    val right = "Добро пожаловать!"
    val notRight = "Доступ запрещен."


    println("Подтвердите, что вы не бот! Сколько будет: $firstNumber+$secondNumber")

    var resultUser: Int = readln().toInt()

    comparison = result == resultUser
    if (comparison == true) {
        println(right)
    } else println(notRight)

}