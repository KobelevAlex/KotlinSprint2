package lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    var numberSeconds = readln().toInt()

    for (i in numberSeconds downTo 1) {

        println("Осталось - $i сек.")
        Thread.sleep(1000)
    }
    println("Прошло $numberSeconds секунд.")

}