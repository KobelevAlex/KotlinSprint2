package lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buff: Double = 20.0
    val numberOfPercent: Int = 100

    println(
        """
        У вас сейчас в запасах:
         - кристаллической руды $crystalOre ед., ещё бонусом + $buff% - ${(crystalOre * buff / numberOfPercent).toInt()} ед.
         - железной руды $ironOre ед, ещё бонусом + $buff% - ${(ironOre * buff / numberOfPercent).toInt()} ед.
                 
    """.trimIndent()
    )
}