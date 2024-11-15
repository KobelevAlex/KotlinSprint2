package lesson_14

abstract class Figure() {
    abstract val color: String
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    val radius: Double,
    val pi: Double = 3.14,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Double {
        return pi * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * pi * radius
    }
}

class Rectangle(
    val width: Double,
    val height: Double,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val listFigures = mutableListOf(
        Circle(10.6, color = "black"),
        Rectangle(100.2, 100.2, "black"),
        Circle(10.6, color = "white"),
        Rectangle(100.2, 100.2, "white"),
        Circle(10.6, color = "white"),
        Rectangle(100.2, 100.2, "black"),
    )
    val sumPerimetersBlackFigures =
        ((listFigures.filter { it -> it.color == "black" }).map { it.calculatePerimeter() }).sum()
    val sumRectanglesWhiteFigures =
        ((listFigures.filter { it -> it.color == "white" }).map { it.calculateArea() }).sum()
    println(
        """
        Сумма периметров всех черных фигур: ${
            String.format("%.2f", sumPerimetersBlackFigures)
        }
        Сумма площадей всех белых фигур: ${
            String.format("%.2f", sumRectanglesWhiteFigures)
        }
        """.trimIndent()
    )

}