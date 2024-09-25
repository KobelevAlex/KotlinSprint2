package lesson_1

const val secondsInTheClock: Short = 3600
const val secondsInOneHour: Byte = 60
fun main() {

    val seconds: Short = 6480
    val timeString: String = сonvertingSecondsToTimeString(seconds)
    println(timeString)
}

fun сonvertingSecondsToTimeString(meaning: Short): String {
    val hours = meaning / secondsInTheClock
    val minutes = (meaning % secondsInTheClock) / secondsInOneHour
    val secondsRemaining = meaning % secondsInOneHour
    return String.format("%02d:%02d:%02d", hours, minutes, secondsRemaining)
}
