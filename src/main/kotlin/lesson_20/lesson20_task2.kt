package lesson_20

class Player(val namePlayer: String, var currentHealth: Int, val maxHealth: Int) {
    fun printInfoPlayer(player: Player) {
        println("Текущее здоровье у игрока '${player.namePlayer}' - ${player.currentHealth}ед.")
    }

    val restoreHealth: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Лечебное зелье востановило здоровье игроку '${player.namePlayer}' до максимума!")
    }
}

fun main() {
    val player1 = Player("Иннокентий", 10, 100)
    player1.printInfoPlayer(player1)
    player1.restoreHealth(player1)
    player1.printInfoPlayer(player1)
}