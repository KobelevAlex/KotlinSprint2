package lesson_16

fun Double.pow(exponent: Int): Double {
    return Math.pow(this, exponent.toDouble())
}

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun circumferenceCircle(): Double {
        return 2 * PI * radius
    }

    fun areaCircle(): Double {
        return PI * (radius.pow(2))
    }
}

fun main() {
    val circle = Circle(3.8)
    val valueCircumferenceCircle = String.format("%.2f", circle.circumferenceCircle())
    val valueareaCircle = String.format("%.2f", circle.areaCircle())
    println(
        """
       Длина окружности - $valueCircumferenceCircle мм.
       Площадь круга - $valueareaCircle кв.мм.
    """.trimIndent()
    )
}