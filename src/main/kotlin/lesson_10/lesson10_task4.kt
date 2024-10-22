package lesson_10

import kotlin.random.Random

fun main() {

    val minValue = 0.3
    val maxValue = 0.6
    val manWalksText = "Кости бросает человек."
    val listManWalks: MutableList<Int> = mutableListOf()
    val listVictoryOfMan: MutableList<Int> = mutableListOf()
    val carRunningText = "Кости бросает машина."
    val listCarRunning: MutableList<Int> = mutableListOf()
    var numberOfGames = 0
    var valueFirstBone: Int
    var valueSecondBone: Int
    var sumNumbersBones: Int

    fun throwingBone(): Int {
        return Random.nextInt(1, 7)
    }

    fun whoWon(numberCycle: Int): String {
        val value: String
        if (listCarRunning[numberCycle] > listManWalks[numberCycle]) {
            value = "Победила машина!"
        } else if (listCarRunning[numberCycle] < listManWalks[numberCycle]) {
            listVictoryOfMan.add(1)
            value = "Победило человечество!"
        } else value = "Ничья!"
        return value
    }

    fun сhooseTheFirstOne(): String {
        val value: String
        val randomNumber = Math.random()
        if (randomNumber <= minValue || randomNumber > maxValue) value = carRunningText
        else value = manWalksText
        return value
    }

    println("Хотите бросить кости? Введите: Да или Нет")

    var gameOver = readln()

    if (gameOver != "Да") {
        println("Game over!!!")
        return
    }

    do {
        val first = сhooseTheFirstOne()
        println("Начнём ${numberOfGames + 1} игру!")
        println()

        if (first == manWalksText) {
            println(manWalksText)
            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listManWalks.add(sumNumbersBones)

            printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            Thread.sleep(1000)

            println(carRunningText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listCarRunning.add(sumNumbersBones)

            printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            println(whoWon(numberOfGames))

        } else {
            println(carRunningText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listCarRunning.add(sumNumbersBones)

            printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            Thread.sleep(2000)

            println(manWalksText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listManWalks.add(sumNumbersBones)

            printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            println(whoWon(numberOfGames))

        }
        Thread.sleep(2000)
        println()

        numberOfGames++
        println("Хотите бросить кости еще раз? Введите: Да или Нет")
        gameOver = readln()
    } while (gameOver == "Да")


    println(
        """   
                    
        Количество побед у Вас за $numberOfGames игр - ${listVictoryOfMan.size}
               
        Game over!!!
    """.trimIndent()
    )

}

fun printInfo(FirstBone: Int, SecondBone: Int, sumBones: Int) {
    println(
        """
                Число на первой кости - $FirstBone
                Число на второй кости - $SecondBone
                Сумма чисел на костях - $sumBones

            """.trimIndent()
    )
}
