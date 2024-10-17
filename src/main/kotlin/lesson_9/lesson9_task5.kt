package lesson_9

fun main() {

    val listInterUser: MutableSet<String> = mutableSetOf()

    println("Вам нужно ввести 5 ингредиентов.")

    for (i in 1..5) {
        println("Введите $i ингредиент:")
        listInterUser.add(readln())
    }

    val listInterUserSorted = listInterUser.sorted()
    val formattedList = listInterUserSorted.toMutableList()
    val uppercaseFirstChar = formattedList[0].replaceFirstChar { char -> char.uppercase() }

    formattedList[0] = uppercaseFirstChar

    println(formattedList.joinToString(", "))

}
