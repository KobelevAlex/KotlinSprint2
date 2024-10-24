package lesson_10

import kotlin.random.Random

fun createPassword(
    passwordLength: Int, minValue: Double, maxValue: Double, numberRange: CharRange,
    charRangeSpecialCharacters: CharRange
): String {
    val listOfRandomCharacters = mutableListOf<Char>()

    for (i in 1..passwordLength) {
        val random = Math.random()
        if (random <= minValue) {
            listOfRandomCharacters.add(charRangeSpecialCharacters.random())
        } else if ((random > minValue) && (random <= maxValue)) {
            listOfRandomCharacters.add(numberRange.random())
        } else listOfRandomCharacters.add(' ')
    }

    return listOfRandomCharacters.joinToString("")
}

fun main() {
    val minValue = 0.466
    val maxValue = 0.895
    val charRangeSpecialCharacters = '!'..'/'
    val numberRange = '0'..'9'
    val userPassword: String

    println("Введите длину пароля:")

    val passwordLength = readln().toInt()

    userPassword = createPassword(passwordLength, minValue, maxValue, numberRange, charRangeSpecialCharacters)

    println("Ваш пароль из $passwordLength символов- $userPassword")

}

