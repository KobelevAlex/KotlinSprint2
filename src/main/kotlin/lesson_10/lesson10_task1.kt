package lesson_10




fun main() {

    val manWalksText = "Кости бросает человек."
    val listManWalks: MutableList<Int> = mutableListOf()
    val carRunningText = "Кости бросает машина."
    val listCarRunning: MutableList<Int> = mutableListOf()
    val numberOfGames = 6
    val minValue = 0.3
    val maxValue =0.6
    var valueFirstBone: Int
    var valueSecondBone: Int
    var sumNumbersBones: Int

    fun throwingBone(): Int {
       val range = 1..<7
        return range.random()
    }

    fun whoWon(numberCycle: Int): String {
        val value: String
        if (listCarRunning[numberCycle] > listManWalks[numberCycle]) {
            value = "Победила машина!"
        }
        else if (listCarRunning[numberCycle] < listManWalks[numberCycle]) {
            value = "Победило человечество!"
        }
        else value = "Ничья!"
        return value
    }

    fun сhooseTheFirstOne(): String {
        val value: String
        val randomNumber = Math.random()
        if (randomNumber <= minValue || randomNumber > maxValue) value = carRunningText
        else value = manWalksText
        return value
    }

    for (i in 1..numberOfGames) {
        val first = сhooseTheFirstOne()
        println("Начнём $i игру!")
        println()

        if (first == manWalksText) {
            println(manWalksText)
            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listManWalks.add(sumNumbersBones)

            //printInfo (valueFirstBone, valueSecondBone, sumNumbersBones)

            Thread.sleep(1000)

            println(carRunningText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listCarRunning.add(sumNumbersBones)

            //printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            whoWon(i - 1)
            println(whoWon(i - 1))

        } else {
            println(carRunningText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listCarRunning.add(sumNumbersBones)

            //printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            Thread.sleep(1000)

            println(manWalksText)

            valueFirstBone = throwingBone()
            valueSecondBone = throwingBone()
            sumNumbersBones = valueFirstBone + valueSecondBone
            listManWalks.add(sumNumbersBones)

           // printInfo(valueFirstBone, valueSecondBone, sumNumbersBones)

            println(whoWon(i - 1))

        }
        Thread.sleep(2000)
        println()

    }

    println(
        """
        Список чисел за $numberOfGames игр выпавших у человека - ${listManWalks.joinToString(", ")}
        Список чисел за $numberOfGames игр выпавших у машины - ${listCarRunning.joinToString(", ")}
        
        Game over!!!
    """.trimIndent()
    )
    fun printInfo(valueFirstBone: Int, valueSecondBone: Int, sumNumbersBones: Int) {
        println(
            """
                Число на первой кости - $valueFirstBone
                Число на второй кости - $valueSecondBone
                Сумма чисел на костях - $sumNumbersBones

            """.trimIndent()
        )
    }

}

