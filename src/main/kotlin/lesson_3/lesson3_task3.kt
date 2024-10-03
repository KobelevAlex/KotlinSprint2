package lesson_3

fun main() {
    var meaning = 7

    println(
        """
        $meaning x 1 = ${meaning * 1}
        $meaning x 2 = ${meaning * 2}
        $meaning x 3 = ${meaning * 3}
        $meaning x 4 = ${meaning * 4}
        $meaning x 5 = ${meaning * 5}
        $meaning x 6 = ${meaning * 6}
        $meaning x 7 = ${meaning * 7}
        $meaning x 8 = ${meaning * 8}
        $meaning x 9 = ${meaning * 9}
        """.trimIndent()
    )

    meaning = 8
    println()
    println(
        """
        $meaning x 1 = ${meaning * 1}
        $meaning x 2 = ${meaning * 2}
        $meaning x 3 = ${meaning * 3}
        $meaning x 4 = ${meaning * 4}
        $meaning x 5 = ${meaning * 5}
        $meaning x 6 = ${meaning * 6}
        $meaning x 7 = ${meaning * 7}
        $meaning x 8 = ${meaning * 8}
        $meaning x 9 = ${meaning * 9}
        """.trimIndent()
    )
}