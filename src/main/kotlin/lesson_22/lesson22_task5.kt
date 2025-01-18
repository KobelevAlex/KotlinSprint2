package lesson_22

data class GalacticGuide(
    val namePlaceOrEvent: String,
    val descriptionPlaceOrEvent: String,
    val dateEvent: String,
    val timeEvent: String,
    val distancePlaceOrEventFromEarth: String,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Слёт всех пилотов!!! На тройной звёздной системе в созвездии Центавра - Alpha Centauri",
        "12.12.4210",
        "15:40",
        "10 св.лет",
    )
    println("Название места - ${alphaCentauri.component1()}")
    println("Описание события - ${alphaCentauri.component2()}")
    println("Дата события - ${alphaCentauri.component3()}")
    println("Время события - ${alphaCentauri.component4()}")
    println("Расстояние от Земли до Alpha Centauri - ${alphaCentauri.component5()}")
}
