package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var numberSeconds = readln().toInt()

    while (numberSeconds > 0) {
        println("Осталось секунд: ${numberSeconds--} ")
        Thread.sleep(1000)
    }
    println("Время вышло")

}