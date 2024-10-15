package lesson_9

fun main() {
    val onePortionOfOmelet: MutableList<Int> = mutableListOf(2, 50, 15)

    println("Введите количество порций омлета:")

    val numberPortions = readln().toInt()
    val specifiedPortionOfOmeletI = onePortionOfOmelet.map { it * numberPortions }

    println(
        """
           На $numberPortions порций вам понадобится: 
           Яиц – ${specifiedPortionOfOmeletI[0]}шт, молока – ${specifiedPortionOfOmeletI[1]}мл, сливочного масла – ${specifiedPortionOfOmeletI[2]}гр.
       """.trimIndent()
    )
}
