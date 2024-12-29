package lesson_20

fun main() {
    val listPhrases: List<String> =
        listOf("С добрым утром!", "Добрый день!", "Добрый вечер!", "Кушать подано!", "Спокойной ночи!")
    var modifier: (String) -> String = { it }
    fun say() {
        val phrase = listPhrases.random()
        println(modifier(phrase))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
    say()
    setModifier { phrase ->
        phrase.split(" ").joinToString(" ") { it.reversed() }
    }
    say()
}


