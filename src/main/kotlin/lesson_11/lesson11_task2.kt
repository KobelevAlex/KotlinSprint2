package lesson_11

class User2(val id: Int, val userName: String, var userPassword: String, var userEMail: String, var bio: String) {

    fun printUserInfo() {
        println(
            """
            
            ${userName}, у вас следующие данные:
            ID - $id
            Имя - $userName
            Пароль - $userPassword
            Почтовый адрес - $userEMail
            Bio - $bio
            
        """.trimIndent()
        )
    }

    fun changeBio() {
        println("Поменяйте bio:")
        bio = readln()
        println("Теперь bio - $bio")
    }

    fun changePassword() {
        println("Поменяйте пароль:")
        println("Введите правильно старый пароль:")
        var interPassword = readln()
        while (interPassword != userPassword) {
            println("Для замены пароля, необходимо ввести старый пароль:")
            interPassword = readln()
        }

        println("Введите новый пароль:")

        userPassword = readln()

        println("Теперь ваш пароль - $userPassword")
    }

}

fun main() {
    val user = User2(123456, "Alexandr", "qwerty", "alex@mail.ru", "Человек")

    user.printUserInfo()
    user.changeBio()
    user.changePassword()
    user.printUserInfo()
}