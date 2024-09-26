package lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buff: Double = 0.2

    println("""
        У вас сейчас в запасах:
         - кристаллической руды $crystalOre ед., ещё бонусом + 20% - ${(crystalOre * buff).toInt()} ед.
         - железной руды $ironOre ед, ещё бонусом + 20% - ${(ironOre * buff).toInt()} ед.
                 
    """.trimIndent())
}