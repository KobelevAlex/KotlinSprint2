package lesson_16

class Cube {
    val randomNumber = randomNumber()
    private fun randomNumber(): Int {
        return (1..6).random()
    }
}

fun main() {
    val cube = Cube()
    val randomNumber = cube.randomNumber
    println("Случайный номер на кубике - $randomNumber")
}