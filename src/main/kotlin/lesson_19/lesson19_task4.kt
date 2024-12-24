package lesson_19

enum class Patron(val namePatron: String, val impactForce: Int) {
    BLUE("Синий", 5),
    GREEN("Зелёный", 10),
    RED("Красный", 20),
    EMPTY("Холостой", 0),
}

class Tank(var typePatron: Patron = Patron.EMPTY) {
    fun changePatronBlue() {
        typePatron = Patron.BLUE
    }

    fun changePatronGreen() {
        typePatron = Patron.GREEN
    }

    fun changePatronRed() {
        typePatron = Patron.RED
    }

    fun shot(tank: Tank) {
        println(
            "Танк произвёл выстрел патороном с маркеровкой - '${tank.typePatron.namePatron}' " +
                    "и нанёс урон - ${tank.typePatron.impactForce} едениц."
        )
    }
}

fun main() {
    val tank = Tank()
    tank.changePatronBlue()
    tank.shot(tank)
    tank.changePatronRed()
    tank.shot(tank)
    tank.changePatronGreen()
    tank.shot(tank)
}