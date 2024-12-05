package lesson_17

class QuizItem(private var _question: String, private var _answer: String) {
    val question: String
        get() = _question
    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {
    val quizItem = QuizItem("Что такое арбуз", "Арбуз - это ягода!")
    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answer}")
    quizItem.answer = "Арбуз - очень вкусная ягода"
    println("Обновленный ответ: ${quizItem.answer}")
}

