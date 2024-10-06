package lesson_5

import kotlin.random.Random

fun main() {
    val firstNumber: Int = Random.nextInt(0, 43)
    val secondNumber: Int = Random.nextInt(0, 43)
    val thirdNumber: Int = Random.nextInt(0, 43)
    val listNumber = listOf(firstNumber, secondNumber, thirdNumber)
    val listNumberUser: MutableList<Int> = mutableListOf()

    println("Попробуйте угадать, какие 3 числа, от 0 до 42, мы загадали!")

    for (i in 1..3) {
        println("Введите $i-е число:")
        listNumberUser.add(readln().toInt())
    }

    val listOfMatches = listNumber.intersect(listNumberUser)

    val numberOfGuessedNumbers = listOfMatches.size

    println("Мы задумали три числа - ${listNumber[0]}, ${listNumber[1]} и ${listNumber[2]}")

    when (numberOfGuessedNumbers) {
        0 -> println("Вы не угадали ни одного числа.")
        1 -> println("Вы угадали $numberOfGuessedNumbers число и получаете утешительный приз.")
        2 -> println("Вы угадали $numberOfGuessedNumbers числа и получаете крупный приз.")
        3 -> println("Вы угадали все $numberOfGuessedNumbers числа и получаете джекпот.")
    }

}
