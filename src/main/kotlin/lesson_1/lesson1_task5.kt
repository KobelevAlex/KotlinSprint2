package lesson_1

fun main() {
    val seconds: Short = 6480
    val timeString: String = сonvertingSecondsToTimeString(seconds)
    println(timeString)
}

fun сonvertingSecondsToTimeString(meaning: Short): String {
    val hours = meaning / 3600
    val minutes = (meaning % 3600) / 60
    val secondsRemaining = meaning % 60

    return String.format("%02d:%02d:%02d", hours, minutes, secondsRemaining)
}
