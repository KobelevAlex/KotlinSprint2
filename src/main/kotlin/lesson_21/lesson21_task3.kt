package lesson_21

class Player2(val namePlayer: String, var currentHealth: Int, val maxHealth: Int) {
    fun printInfoPlayer(player: Player2) {
        println("Текущее здоровье у игрока '${player.namePlayer}' - ${player.currentHealth}ед.")
    }

    val restoreHealth: (Player2) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Лечебное зелье востановило здоровье игроку '${player.namePlayer}' до максимума!")
    }
}

fun Player2.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player1 = Player2("Иннокентий", 10, 100)
    player1.printInfoPlayer(player1)
    println(player1.isHealthy())
    player1.restoreHealth(player1)
    println(player1.isHealthy())
    player1.printInfoPlayer(player1)
}