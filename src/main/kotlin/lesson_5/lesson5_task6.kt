package lesson_5

fun main() {
    val bodyMassIndexMin = 18.5
    val bodyMassIndexMiddle = 25
    val bodyMassIndexMax = 30
    val centimetreToMetre = 0.01
    println("Введите свой вес в кг:")
    val weight: Double = readln().toDoubleOrNull() ?: 0.0
    println("Введите свой рост в см:")
    val height: Double = readln().toDoubleOrNull() ?: 0.0
    val heightToMetre: Double = height * centimetreToMetre
    val bodyMassIndex: Double = weight / (heightToMetre * heightToMetre)
    val checking: String = when {
        bodyMassIndex < bodyMassIndexMin -> "недостаточная масса тела"
        bodyMassIndex >= bodyMassIndexMin && bodyMassIndex < 25 -> "нормальная масса тела"
        bodyMassIndex >= bodyMassIndexMiddle && bodyMassIndex < 30 -> "избыточная масса тела"
        bodyMassIndex > bodyMassIndexMax -> "ожирение"
        else -> "не правильные данные!"
    }
    val correctionOutputBodyMassIndex = String.format("%.2f", bodyMassIndex)
    println("У вас ИМТ - $correctionOutputBodyMassIndex")
    println("А значит, у вас - $checking")
}