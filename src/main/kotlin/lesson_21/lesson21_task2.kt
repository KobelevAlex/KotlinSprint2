package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this
        .filter { it % 2 == 0 }
        .sum()
}

fun main() {
    val listNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val sumEvenNumbers = listNumbers.evenNumbersSum()
    println("Сумма четных чисел: $sumEvenNumbers")

}