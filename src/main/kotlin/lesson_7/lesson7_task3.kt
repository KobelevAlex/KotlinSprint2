package lesson_7

fun main() {

    println("Введите ваше число:")

    val interNumberUser = readln().toInt()

    for (i in 0 until interNumberUser) {
        if (i % 2 == 0) println(i)
    }


}