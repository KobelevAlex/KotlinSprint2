package lesson_8

fun main() {

    val numberOfViewsByDay = intArrayOf(20, 34,41,36,55,29,19)

    val numberOfViewsPerWeek = numberOfViewsByDay.sum()

    println("Количество просмотров за неделю - $numberOfViewsPerWeek")

}