package lesson_17

class QuizItem(
    question: String,
    answer: String
) {
    var question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value: String) {
            field = value
        }
}

fun main() {
    val quizItem = QuizItem("Что такое арбуз?", "Арбуз - это ягода!")
    println("Вопрос: ${quizItem.question}")
    println("Ответ: ${quizItem.answer}")
    quizItem.answer = "Арбуз - очень большая и вкусная ягода!"
    println("Обновленный ответ: ${quizItem.answer}")
}

