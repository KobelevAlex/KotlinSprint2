package lesson_7

const val MIN_LENGTH_PASSWORD = 6
fun main() {
    val randomPassowrd: MutableList<Char> = mutableListOf()
    val rangeOfCapitalLetters = 65..90
    val rangeOfSmallLetters = 97..122
    val rangeOfDigits = 48..57


    println("Введите длину пароля! Не менее 6 символов:")
    var lengthPassowrd = readln().toInt()
    while (lengthPassowrd < MIN_LENGTH_PASSWORD) {
        println("Введите длину пароля! Не менее 6 символов:")
        lengthPassowrd = readln().toInt()
    }
    for (i in 1..lengthPassowrd) {
        val randomNumber = if (i % 2 == 0) {
            rangeOfCapitalLetters.random()
        } else if ((Math.random() < 0.5)) {
            rangeOfSmallLetters.random()
        } else rangeOfDigits.random()

        randomPassowrd.add(randomNumber.toChar())

    }

    println("Ваш новый пароль - ${randomPassowrd.joinToString("")}")


}