package lesson_6

fun main() {
    var cheeck = true
    val userlist: MutableList<String> = mutableListOf()
    val userCheecklist: MutableList<String> = mutableListOf()

    println("Регистрация")

    println("Придумате ваш логин:")
    userlist.add(readln())
    println("Придумате ваш пароль:")
    userlist.add(readln())

    println(
        """
        Ваш логин - ${userlist[0]}
        Ваш пароль - ${userlist[1]}
    """.trimIndent()
    )

    println("Авторизация")

    while (cheeck) {
        println("Введите ваш логин:")
        userCheecklist.add(readln())
        println("Введите ваш пароль:")
        userCheecklist.add(readln())

        if ((userCheecklist[0] == userlist[0]) && (userCheecklist[1] == userlist[1])) {
            cheeck = false
        } else println("Введите логин и пароль ещё раз!")
        userCheecklist.clear()
    }
    println("Авторизация прошла успешно!")
}
