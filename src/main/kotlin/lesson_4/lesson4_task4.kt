package lesson_4

fun main() {

    var day = 1
    var parityCheck = day % 2

    println(
        """
            День - $day
        Упражнения для рук: ${parityCheck != 0}
        Упражнения для ног: ${parityCheck == 0}
        Упражнения для спины: ${parityCheck == 0}
        Упражнения для пресса: ${parityCheck != 0}
    """.trimIndent()
    )
    println()

    day = 5
    parityCheck = day % 2

    println(
        """
            День - $day
        Упражнения для рук: ${parityCheck != 0}
        Упражнения для ног: ${parityCheck == 0}
        Упражнения для спины: ${parityCheck == 0}
        Упражнения для пресса: ${parityCheck != 0}
    """.trimIndent()
    )
    println()

    day = 6
    parityCheck = day % 2

    println(
        """
            День - $day
        Упражнения для рук: ${parityCheck != 0}
        Упражнения для ног: ${parityCheck == 0}
        Упражнения для спины: ${parityCheck == 0}
        Упражнения для пресса: ${parityCheck != 0}
    """.trimIndent()
    )

}