package lesson_10

import kotlin.random.Random

fun main() {
    val charRangeSpecialCharacters = '!'..'/'
    val numberRange = '0'..'9'
    var userPassword: String
    var listOfRandomCharacters: MutableList<Char> = mutableListOf()

    println("Введите длину пароля:")
    val passwordLength = readln().toInt()
    fun createPassword(value: Int) {
        for (i in 1..value) {
            val random = Math.random()
            println(random)
            if (random <= 0.466) {
                listOfRandomCharacters.add(charRangeSpecialCharacters.random())
            } else if ((random > 0.466) && (random <= 0.895)) {
                listOfRandomCharacters.add(numberRange.random())
            } else listOfRandomCharacters.add(' ')
        }
    }
    createPassword(passwordLength)
    userPassword = listOfRandomCharacters.joinToString("")
    println("Ваш пароль из $passwordLength символов- $userPassword")

}