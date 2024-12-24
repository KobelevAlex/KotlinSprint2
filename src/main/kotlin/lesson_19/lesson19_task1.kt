package lesson_19

enum class FishType(val displayName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");
}

fun main() {
    println("Вы можете добавить в свой аквариум следующие виды рыб:")
    FishType.values().forEach { fish ->
        println("- ${fish.displayName}")
    }
}