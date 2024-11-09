package lesson_13

class InfoData4(
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
        val listOfObjects: MutableList<InfoData4> = mutableListOf()
    }
}

fun main() {
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
        InfoData4.listOfObjects.add(contact)
        contact.printObjects()
    }

}



