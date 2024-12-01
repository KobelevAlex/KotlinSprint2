package lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14
    fun circumferenceCircle(): Double {
        return 2 * pi * radius
    }

    fun areaCircle(): Double {
        return pi * radius * radius
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