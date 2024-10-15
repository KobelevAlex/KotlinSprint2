package lesson_9

fun main() {
    println("Введите 5 игредиентов через запятую \",\":")

    val interUser = readln()
    val listInterUser = interUser.split(", ").sorted()

    println(listInterUser)


}