package lesson_2

fun main() {
    val numberOfPeople: Int = 4
    val subjectScores = listOf<Int>(3, 4, 3, 5)
    val averageScore: Double
    var amount: Int = 0

    for (num in subjectScores) {
        amount += num
    }

    averageScore = amount.toDouble() / numberOfPeople

    println("Средний балл по английскому - $averageScore")
}