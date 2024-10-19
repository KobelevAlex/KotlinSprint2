package lesson_10

fun main() {
    var userLogin: String
    var userPassword: String
    var checkingForFour: Boolean

    do {
        println("Придумайте логин не менее 4х символов:")

        userLogin = readln()

        checkingForFour = checkingForFourCharacters(userLogin)
        if (checkingForFour == false) println("Вы ввели логин менее 4х символов. Попробуйте снова!")

    } while (checkingForFour != true)

    do {
        println("Придумайте пароль не менее 4х символов:")

        userPassword = readln()

        checkingForFour = checkingForFourCharacters(userPassword)
        if (checkingForFour == false) println("Вы ввели пароль менее 4х символов. Попробуйте снова!")

    } while (checkingForFour != true)

    println(
        """
       Добро пожаловать!     
       Ваш логин - $userLogin
       Ваш пароль - $userPassword
   """.trimIndent()
    )

}

fun checkingForFourCharacters(checkValue: String): Boolean {
    return checkValue.length >= 4
}