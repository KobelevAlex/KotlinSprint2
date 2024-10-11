package lesson_7

fun main() {
    val codeEnteredNotCorrectly = true
    val numbersForTheSMS = (1000..9999)
    var numberFromTheSMS: Int
    var interNumberUser: Int

    while (codeEnteredNotCorrectly) {
        numberFromTheSMS = numbersForTheSMS.random()
        println("Ваш код авторизации: $numberFromTheSMS")
        println("Введите код:")
        interNumberUser = readln().toInt()
        if (numberFromTheSMS == interNumberUser) {
            println("Добро пожаловать!")
            break
        } else println("Попробуйте ввести новый код!")

    }


}