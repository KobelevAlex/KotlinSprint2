package lesson_13

class InfoData(val name: String, var numberPhone: Long, var company: String?)

fun main() {
    val person = InfoData("Александр", 89376581835, null)
    println(person.company)
}