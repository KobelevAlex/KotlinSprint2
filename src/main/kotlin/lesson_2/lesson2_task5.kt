package lesson_2

fun main() {
    val amount: Double = 70_000.0
    val annualInterestRate: Double = 0.167
    val years: Int = 20

    val amountOfTheDeposit: Double = amount * Math.pow(1 + annualInterestRate, years.toDouble())

    println("Размер вклада через $years лет - ${String.format("%.3f", amountOfTheDeposit)}")
}