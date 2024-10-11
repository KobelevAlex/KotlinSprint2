package lesson_7

import kotlin.concurrent.thread

fun main() {

    println("Введите количество секунд:")

    val interNumberSecondsUser = readln().toInt()

    for (i in interNumberSecondsUser downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло!")

}