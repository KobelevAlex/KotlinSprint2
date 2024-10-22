package lesson_10

import kotlin.random.Random

fun main() {
    val minValue = 0.466
    val maxValue = 0.895
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
            if (random <= minValue) {
                listOfRandomCharacters.add(charRangeSpecialCharacters.random())
            } else if ((random > minValue) && (random <= maxValue)) {
                listOfRandomCharacters.add(numberRange.random())
            } else listOfRandomCharacters.add(' ')
        }
    }
    createPassword(passwordLength)
    userPassword = listOfRandomCharacters.joinToString("")
    println("Ваш пароль из $passwordLength символов- $userPassword")

}