package lesson_5

fun main() {
    val testDistance = 100
    println("Введите протяжённости поездки в км:")
    val distance = readln().toDoubleOrNull() ?: 0.0
    println("Введите расход топлива в л/100км:")
    val costFuel100km = readln().toDoubleOrNull() ?: 0.0
    println("Введите текущую цену за литр топлива в руб:")
    val currentPricePerLiterFuel = readln().toDoubleOrNull() ?: 0.0
    val quantityLitersFuelForTrip: Double = (distance * costFuel100km) / testDistance
    val totalCostFuel = quantityLitersFuelForTrip * currentPricePerLiterFuel
    val correctionTotalCostFuel = String.format("%.2f", totalCostFuel)
    val correctionQuantityLitersFuelForTrip = String.format("%.2f", quantityLitersFuelForTrip)
    println("Общее количество необходимого топлива за поездку - $correctionQuantityLitersFuelForTrip л")
    println("Итоговая стоимость поездки- $correctionTotalCostFuel руб")
}