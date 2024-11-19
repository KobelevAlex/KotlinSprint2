package lesson_15

interface Move {
    fun methodsMovement()
}

class Duck(name: String) : Move {
    override fun methodsMovement() {
        println("Оталкивается лапками от воды.")
    }
}

class CrucianCarp(name: String) : Move {
    override fun methodsMovement() {
        println("Оталкивается плавниками и хвостом от воды.")
    }
}

class Seagull(name: String) : Move {
    override fun methodsMovement() {
        println("Машет крыльями.")
    }
}

fun main() {
    val duck = Duck("Утка")
    val crucianCarp = CrucianCarp("Карась")
    val seagull = Seagull("Чайка")
    duck.methodsMovement()
    crucianCarp.methodsMovement()
    seagull.methodsMovement()

}