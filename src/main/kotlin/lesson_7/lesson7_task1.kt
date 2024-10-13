package lesson_7

import kotlin.random.Random

fun main() {

    val randomPasswordForUser: MutableList<Char> = mutableListOf()
    val digits = ('0'..'9')
    val letters = ('a'..'z')

    for (i in 1..6) {
        if (i % 2 == 0) {
            randomPasswordForUser.add(digits.random())
        } else randomPasswordForUser.add(letters.random())
    }
    val passwordUser = randomPasswordForUser.joinToString("")
    println(
        "Ваш новый пароль: $passwordUser"
    )

}

