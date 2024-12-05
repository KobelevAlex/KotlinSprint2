package lesson_16

class Player(val name: String, private var health: Int, private var impactForce: Int) {
    fun takeHealth(): Int {
        return if (health > 0) {
            val value1 = 20
            val value2 = 21
            val value3 = 60
            val addHealth1 = 1
            val addHealth2 = 5
            val addHealth3 = 10
            val addHealth4 = 0
            val range = 0..100
            val randomValue = range.random()
            val addHealth = when {
                (randomValue <= value1) -> addHealth1
                (randomValue > value2) && (randomValue <= value3) -> addHealth2
                (randomValue > value3) -> addHealth3
                else -> addHealth4
            }
            health += addHealth
            println("Игрок '$name' получил лечение - ${addHealth} ед.")
            println("Текущий уровень здоровья стал - ${health} ед.")
            return health
        } else {
            death()
            health
        }
    }

    fun takeDamage(damage: Int): Int {
        val takeDamage = impactForce + damage
        health -= takeDamage
        println("Игроку '$name' нанесли ущерб - $takeDamage ед.")
        if (health > 0) {
            println("Текущий уровень здоровья - $health ед.")
            return health
        } else
            death()
        return health
    }

    private fun death() {
        health = 0
        impactForce = 0
        println("Игрок $name убит!")
        println("Здоровье - $health ")
        println("Сила удара - $impactForce")
    }
}

fun main() {
    val player1 = Player("Антон", 100, 10)
    player1.takeDamage(20)
    player1.takeHealth()
    player1.takeDamage(30)
    player1.takeHealth()
    player1.takeDamage(50)
    player1.takeHealth()
    player1.takeHealth()
    player1.takeHealth()
}