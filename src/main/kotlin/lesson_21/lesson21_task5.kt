package lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return this.entries.maxByOrNull { it.value }?.key
}

fun main() {
    val experienceMap = mapOf(
        "Сила" to 150,
        "Ловкость" to 200,
        "Интеллект" to 200,
        "Выносливость" to 100
    )
    val maxSkill = experienceMap.maxCategory()
    println("Навык с максимальным опытом: $maxSkill")
}
