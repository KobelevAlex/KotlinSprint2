package lesson_20

fun main() {
    val userName = "Анатолий"
    val textPrint: (String) -> String = { it -> "С наступающим Новым Годом, $it!" }
    println(textPrint(userName))
}

