package lesson_6

import kotlin.random.Random

fun main() {
    val numberHidden = Random.nextInt(0, 10)
    var numberUser: Int
    var numberOfGuessedNumbers = 1
    val numberOfAttempts = 5

    println(
        """
        Угадайте число в промежутке от 1 до 9. 
        У вас есть 5 попыток, чтобы угадать это число. 
        И так, мы загадали число. Угадывайте!
    """.trimIndent()
    )

    for (i in 1..numberOfAttempts) {
        numberOfGuessedNumbers = i
        println("Введите $i число:")
        numberUser = readln().toInt()
        if (numberUser == numberHidden) break
    }
    println("Было загадано число $numberHidden.")

    when (numberOfGuessedNumbers) {
        1 -> println(
            """Вы использовали всего лишь $numberOfGuessedNumbers попытку и сразу угадали число - $numberHidden. 
        |Это была великолепная игра!""".trimMargin()
        )

        2 -> println("Вы использовали $numberOfGuessedNumbers попытки и угадали число - $numberHidden. Хорошая работа!")
        3 -> println("Вы использовали $numberOfGuessedNumbers попытки и угадали число - $numberHidden. Не плохая работа!")
        4 -> println("Вы использовали $numberOfGuessedNumbers попытки и всё-таки угадали число - $numberHidden. Не плохо!")
        5 -> println("Вы использовали все $numberOfGuessedNumbers попыток, но не угадали число - $numberHidden. Очень жаль!")
    }


}