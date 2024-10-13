package lesson_8

fun main() {

    val numberOfViewsByDay = IntArray(7)

    numberOfViewsByDay[0] = 20
    numberOfViewsByDay[1] = 34
    numberOfViewsByDay[2] = 41
    numberOfViewsByDay[3] = 36
    numberOfViewsByDay[4] = 55
    numberOfViewsByDay[5] = 29
    numberOfViewsByDay[6] = 19

    val numberOfViewsPerWeek = numberOfViewsByDay.sum()

    println("Количество просмотров за неделю - $numberOfViewsPerWeek")

}