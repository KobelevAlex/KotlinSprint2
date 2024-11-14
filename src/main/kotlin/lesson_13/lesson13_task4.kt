package lesson_13

class InfoData4(
    val name: String,
    var numberPhone: Long?,
    var company: String?,
) {
    fun printObjects(listOfObjects:MutableList<InfoData4>) {
        if (listOfObjects.isNotEmpty()) {
            listOfObjects.forEach {
                println("Имя: ${it.name}, тел.: ${it.numberPhone}, компания: ${it.company ?: "не указано."} ")
            }
        } else println("Пока нет записей!")
    }
}

fun main() {
    val listOfObjects: MutableList<InfoData4> = mutableListOf()
    while (true) {
        println("Введите Имя (или 'exit' для выхода):")
        val enterName = readln()
        if (enterName.lowercase() == "exit") break
        var enterNumberPhone: Long? = null
        println("Введите номер телефона:")
        do {
            enterNumberPhone = readln().toLongOrNull()
            if (enterNumberPhone == null) println("Введите номер телефона ещё раз")
        } while (enterNumberPhone == null)
        println("Введите компанию:")
        val enterCompany = readln().takeIf { it.isNotBlank() }
        val contact = InfoData4(enterName, enterNumberPhone, enterCompany)
        listOfObjects.add(contact)
        contact.printObjects(listOfObjects)
    }
}



