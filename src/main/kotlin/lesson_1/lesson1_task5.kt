package lesson_1

const val SECONDS_IN_ONE_MINUTE: Byte = 60
const val MINUTES_ONE_HOUR: Byte = 60

fun main() {

    val seconds: Short = 6480
    val timeString: String = сonvertingSecondsToTimeString(seconds)

    println(timeString)
}

fun сonvertingSecondsToTimeString(meaning: Short): String {
    val secondsInOneHour: Int = SECONDS_IN_ONE_MINUTE * SECONDS_IN_ONE_MINUTE
    val hours = meaning / secondsInOneHour
    val minutes = (meaning % secondsInOneHour) / MINUTES_ONE_HOUR
    val secondsRemaining = meaning % SECONDS_IN_ONE_MINUTE

    return String.format("%02d:%02d:%02d", hours, minutes, secondsRemaining)
}
