package lesson_20

class Gamer(private val nameGamer: String, private var availabilityOfKey: Boolean = false) {
    val checkKeyFromPlayer: (Gamer) -> String = { gamer ->
        if (gamer.availabilityOfKey) {
            "У игрока '${gamer.nameGamer}' есть ключ от этой двери!"
        } else "У игрока '${gamer.nameGamer}' нету ключа от этой двери!"
    }
}

fun main() {
    val gamer1 = Gamer("Василий")
    val gamer2 = Gamer("Степан", true)
    println(gamer1.checkKeyFromPlayer(gamer1))
    println(gamer2.checkKeyFromPlayer(gamer2))
}
