package lesson_10

fun printInfo(FirstBone: Int, SecondBone: Int, sumBones: Int) {
    println(
        """
                Число на первой кости - $FirstBone
                Число на второй кости - $SecondBone
                Сумма чисел на костях - $sumBones

            """.trimIndent()
    )
}

fun whoWon(
    numberOfGames: Int,
    listCarRunning: MutableList<Int>,
    listManWalks: MutableList<Int>,
    listVictoryOfMan: MutableList<Int>,
): String {
    val value: String
    if (listCarRunning[numberOfGames] > listManWalks[numberOfGames]) {
        value = "Победила машина!"
    } else if (listCarRunning[numberOfGames] < listManWalks[numberOfGames]) {
        listVictoryOfMan.add(1)
        value = "Победило человечество!"
    } else value = "Ничья!"
    return value
}

fun сhooseTheFirstOne(minValue: Double, maxValue: Double, carRunningText: String, manWalksText: String): String {
    val value: String
    val randomNumber = Math.random()
    if (randomNumber <= minValue || randomNumber > maxValue) value = carRunningText
    else value = manWalksText
    return value
}

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
        val range = 1..<7
        return range.random()
    }

    println("Хотите бросить кости? Введите: Да или Нет")

    var gameOver = readln()

    if (gameOver != "Да") {
        println("Game over!!!")
        return
    }

    do {
        val first = сhooseTheFirstOne(minValue, maxValue, carRunningText, manWalksText)
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

            println(whoWon(numberOfGames, listCarRunning, listManWalks, listVictoryOfMan))

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

            println(whoWon(numberOfGames, listCarRunning, listManWalks, listVictoryOfMan))

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


