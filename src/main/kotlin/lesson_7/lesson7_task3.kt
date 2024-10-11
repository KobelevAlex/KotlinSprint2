package lesson_7

fun main() {

    println("Введите ваше число:")

    val interNumberUser = readln().toInt()

    for (i in 0 until interNumberUser step 2) {
        println(i)
    }


}