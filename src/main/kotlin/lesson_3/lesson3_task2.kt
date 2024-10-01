package lesson_3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surname = "Андреева"
    val age = 20
    val newSurname = "Сидорова"
    val newAge = 22

    println(
        """
        $surname $name $patronymic, $age лет.
        $newSurname $name $patronymic. $newAge лет.
    """.trimIndent()
    )

}