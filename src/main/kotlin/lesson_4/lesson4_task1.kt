package lesson_4

fun main() {
    val table = 13
    val bookingToday = 13
    val bookingTomorrow = 9
    val availabilityOfTablesToday: Boolean = bookingToday < table
    val availabilityOfTablesTomorrow: Boolean = bookingTomorrow < table

println("Доступность столиков на сегодня: $availabilityOfTablesToday\nДоступность столиков на завтра: $availabilityOfTablesTomorrow")
}