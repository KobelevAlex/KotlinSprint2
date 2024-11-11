package lesson_13

import java.lang.IllegalArgumentException

class InfoData5(
    val name: String,
    var numberPhone: Long?,
    var company: String?,
) {
    fun printObjects() {
        if (Companion.listOfObjects.isNotEmpty()) {
            Companion.listOfObjects.forEach {
                println("Имя: ${it.name}, тел.: ${it.numberPhone}, компания: ${it.company ?: "не указано."} ")
            }
        } else println("Пока нет записей!")
    }

    companion object {
        val listOfObjects: MutableList<InfoData5> = mutableListOf()
    }
}

fun main() {
    println("Введите номер телефона:")
    val enterNumberPhone = readln()
    try {
        val number: Long = enterNumberPhone.toLong()
        println("Вы ввели номер - $number")
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.javaClass.simpleName} - ${e.message}")
    }
}

