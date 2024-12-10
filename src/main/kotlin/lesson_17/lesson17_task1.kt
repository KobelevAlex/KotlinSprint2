package lesson_17

class QuizItem(
    question: String,
    answer: String
) {
   var _question = question
    var _answer = answer
    var question: String
        get() = _question
        set(value) {}

    var answer: String
        get()= _answer
        set(value) {
            _answer = value
        }
}

fun main() {
    val quizItem = QuizItem("Что такое арбуз?", "Арбуз - это ягода!")
    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answer}")
    quizItem.answer = "Арбуз - очень большая и вкусная ягода!"
    println("Обновленный ответ: ${quizItem.answer}")
}

