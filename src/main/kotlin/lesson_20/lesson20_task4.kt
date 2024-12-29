package lesson_20

fun main() {
    val listItems: List<String> =
        listOf("Элемент №1", "Элемент №2", "Элемент №3", "Элемент №4", "Элемент №5", "Элемент №6")
    val listLambds: List<() -> Unit> = listItems.map { item -> { println("Нажат элемент $item") } }
    listLambds.forEachIndexed { index, lambda ->
        if (index % 2 == 1) {
            lambda()
        }
    }
}