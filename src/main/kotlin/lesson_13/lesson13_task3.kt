package lesson_13

class InfoData3(val name: String, var numberPhone: Long, var company: String?)

fun main() {
    val listContacts: MutableList<InfoData3> = mutableListOf(
        InfoData3("Александр", 89376581835, "null"),
        InfoData3("Алексей", 89376381836, "Озон"),
        InfoData3("Александр", 89376581565, null),
        InfoData3("Александр", 89373581835, "Магнит"),
        InfoData3("Александр", 89374781835, null)
    )
    val listCompany = listContacts.filter { it.company != null }.map { it.company }
    listCompany.forEach { company ->
        println(company)
    }
}