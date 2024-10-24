package lesson_11


class User(val id: Int, val userName: String, var userPassword: String, var userEMail: String) {

    fun printUserInfo() {
        println(
            """
            
            ${userName}, у вас следующие данные:
            ID - $id
            Имя - $userName
            Пароль - $userPassword
            Почтовый адрес - $userEMail
            
        """.trimIndent()
        )
    }

}

fun main() {
    val userFirst = User(123456, "Alexandr", "qwerty", "alex@mail.ru")
    val userSecond = User(654321, "Maxim", "ytrewq", "maxim@mail.ru")
    userFirst.printUserInfo()
    userSecond.printUserInfo()

}