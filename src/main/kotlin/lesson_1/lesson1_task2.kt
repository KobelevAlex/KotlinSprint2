package lesson_1

fun main() {
    var numberOfProducts: Int = 75
    var textWithThanks: String = """
        Спасибо Вам за выбор нашего интернет-магазина!
         Будем рады, если Вы посетите нас ещё!!!
           До встречи!
    """.trimIndent()
    var numberOfEmployees: Int = 2000
    println("Количество работников -  $numberOfEmployees человек.")
    println("Количество продуктов -  $numberOfProducts единиц.")
    println("-Текст благодарности за покупку-\n $textWithThanks")
    numberOfEmployees = 1999
    println("Уволился один работник.")
    println("Количество работников -  $numberOfEmployees человек.")
}