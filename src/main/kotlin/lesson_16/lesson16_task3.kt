package lesson_16

class User(private val login: String, private val password: String) {
    fun validationPassword(value: String): Boolean {
        return value == password
    }
}

fun main() {
    val user = User("user1", "qwerty")
    val inputPassword = "qwerty"
    val isCorrectInputPassword = user.validationPassword(inputPassword)
    if (isCorrectInputPassword) println("Пароль верный!")
    else println("Пароль не верный!")
}
