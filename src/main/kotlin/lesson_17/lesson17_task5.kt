package lesson_17

class User(login: String,  password: String) {
    private var _password = password
    var userLogin: String = login
        set(value) {
            val oldUserLogin = userLogin
            field = value
            println("Вы успешно сменили свой логин $oldUserLogin на $userLogin!")
        }
    var userPassword: String
        get() = "*".repeat(_password.length)
        set(value) = println("Вы не можете изменить пароль!")
}

fun main() {
    val user = User("user1", "1234567890")
    user.userLogin = "user2"
    println(user.userPassword)
    user.userPassword = "1234"
}