package lesson_19

class Person(val name: String, val gender: Gender)
enum class Gender(val valueGender: String) {
    MAN("Мужчина"),
    WOMAN("Женщина"),
    IT("Оно"),
}

fun main() {
    val listPerson: MutableList<Person> = mutableListOf()
    var numberIterations = 5
    do {
        println("Введите имя:")
        val name = readln()
        println("Введите ваш пол: мужчина - 'м'/ женщина - 'ж'. Если ещё не определились, жмите клавишу 'ENTER':")
        val genderInput = readln()
        val gender: Gender = when (genderInput) {
            "м" -> Gender.MAN
            "ж" -> Gender.WOMAN
            else -> Gender.IT
        }
        val person = Person(name, gender)
        listPerson.add(person)
        numberIterations -= 1
    } while (numberIterations != 0)
    listPerson.forEach { person -> println("${person.name} - ${person.gender.valueGender}") }
}