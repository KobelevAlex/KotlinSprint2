package lesson_16

class Player(val name: String, private var health: Int, var impactForce: Int) {
    fun takeHealth(): Int {
        return if (health > 0) {
            val randomValue = (0..100).random()
            val addHealth = when {
                (randomValue <= 20) -> 1
                (randomValue > 21) && (randomValue <= 40) -> 2
                (randomValue >= 60) -> 3
                else -> 0
            }
            health += addHealth
            println("Игрок '$name' получил лечение - ${addHealth} ед.")
            println("Текущий уровень здоровья стал - ${health} ед.")
            return health
        } else {
            death()
            0
        }
    }

    fun takeDamage(): Int {
        return if (health > 0) {
            val randomValue = (0..100).random()
            val damage = when {
                (randomValue <= 20) -> 4
                (randomValue > 21) && (randomValue <= 40) -> 5
                (randomValue >= 60) -> 6
                else -> 0
            }
            val takeDamage = impactForce + damage
            health -= takeDamage
            println("Игроку '$name' нанесли ущерб - $takeDamage ед.")
            println("Текущий уровень здоровья - $health ед.")
            health
        } else {
            death()
            0
        }
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
    val player1 = Player("Антон", 10, 1)
    player1.takeDamage()
    player1.takeHealth()
    player1.takeDamage()
    player1.takeHealth()
    player1.takeDamage()
    player1.takeHealth()
}