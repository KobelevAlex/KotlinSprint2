package lesson_1

fun main() {
    val yearOfFlight: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println(
        """
       Год полёта - $yearOfFlight год.
       Час взлёта - $hour часов.
       Минута взлёта - $minute минут.
       """.trimIndent()
    )
    hour = "10"
    minute = "55"

    print("Время пасадки - $hour:$minute.")
}