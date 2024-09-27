package lesson_2

fun main() {
    val amount: Double = 70000.0
    val annualInterestRate: Double = 16.7
    val years: Int = 20

    val amountOfTheDeposit: Double = amount * Math.pow(1 + annualInterestRate/100, years.toDouble())

    println("Размер вклада через $years лет - ${String.format("%.3f", amountOfTheDeposit)}")
}