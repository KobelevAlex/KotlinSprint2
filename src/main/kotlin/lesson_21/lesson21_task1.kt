package lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOUаеиоуюяАЕИОУЮЯ"
    return count { it in vowels }
}

fun main() {
    val line = "hello"
    val numberOfVowelLetters = line.vowelCount()
    println("Количество гласных букв в строке - $numberOfVowelLetters")
}