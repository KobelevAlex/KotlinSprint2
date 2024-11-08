package lesson_13

class InfoData2(val name: String, var numberPhone: Long, var company: String?)

fun main() {
    val person = InfoData2("Александр", 89376581835, null)
    println(
        "- Имя: ${person.name}\n" +
                "- Номер: ${person.numberPhone}\n" +
                "- Компания: ${
                    if (person.company == null)
                        "не указано" else person.company
                }"
    )
}