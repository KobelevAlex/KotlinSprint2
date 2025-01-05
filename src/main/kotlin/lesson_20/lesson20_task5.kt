package lesson_20

class Robot {
    private val listPhrases: List<String> =
        listOf("С добрым утром!", "Добрый день!", "Добрый вечер!", "Кушать подано!", "Спокойной ночи!")
    var modifier1: (String) -> String = { it }
    fun say() {
        val phrase = listPhrases.random()
        println(modifier1(phrase))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier1 = newModifier
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { phrase ->
        phrase.split(" ").joinToString(" ") { it.reversed() }
    }
    robot.say()
}


