package lesson_6

const val MILLI_SECONDS_IN_SECOND = 1000
fun main() {
    val numberSeconds: Int
    val numberInMilliSeconds: Long

    println("Введите количество секунд, которые нужно засечь:")

    numberSeconds = readln().toInt()
    numberInMilliSeconds = (MILLI_SECONDS_IN_SECOND * numberSeconds).toLong()
    Thread.sleep(numberInMilliSeconds)
    println("Прошло $numberSeconds секунд.")

}