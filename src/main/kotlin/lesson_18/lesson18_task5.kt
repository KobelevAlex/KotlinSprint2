package lesson_18

class Screen {
    fun draw(figure: Circle): String {
        return "Нарисовали круг c координатами: (${figure.x}; ${figure.y})."
    }

    fun draw(figure: Square): String {
        return "Нарисовали квадрат c координатами: (${figure.x}; ${figure.y})."
    }

    fun draw(figure: Dot): String {
        return "Нарисовали точку c координатами: (${figure.x}; ${figure.y})."
    }
}

open class Figure
class Circle(val x: Int, val y: Int) : Figure()
class Square(val x: Float, val y: Float) : Figure()
class Dot(val x: Int, val y: Int) : Figure()

fun main() {
    val circle = Circle(2, 3)
    val square = Square(23.0f, 10.4f)
    val dot = Dot(35, 20)
    val screen = Screen()
    println(screen.draw(circle))
    println(screen.draw(square))
    println(screen.draw(dot))
}