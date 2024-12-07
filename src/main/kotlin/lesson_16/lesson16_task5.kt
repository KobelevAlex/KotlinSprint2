package lesson_16

class Player(val name: String, private var health: Int, private var impactForce: Int) {
    fun takeHealth(): Int {
        return if (health > 0) {
            val minimumSampleValue = 20
            val averageSampleValue = 21
            val maximumSampleValue = 60
            val valueAddedHealth1 = 1
            val valueAddedHealth2 = 5
            val valueAddedHealth3 = 10
            val valueAddedHealth4 = 0
            val range = 0..100
            val randomValue = range.random()
            val addHealth = when {
                (randomValue <= minimumSampleValue) -> valueAddedHealth1
                (randomValue > averageSampleValue) && (randomValue <= maximumSampleValue) -> valueAddedHealth2
                (randomValue > maximumSampleValue) -> valueAddedHealth3
                else -> valueAddedHealth4
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
    player1.takeDamage(100)
    player1.takeHealth()
    player1.takeDamage(30)
    player1.takeHealth()
    player1.takeDamage(50)
    player1.takeHealth()
    player1.takeHealth()
    player1.takeHealth()
}