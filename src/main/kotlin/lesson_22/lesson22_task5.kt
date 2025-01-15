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
    val (
        namePlaceOrEvent,
        descriptionPlaceOrEvent,
        dateEvent,
        timeEvent,
        distancePlaceOrEventFromEarth,
    ) = alphaCentauri
    println("Название места - $namePlaceOrEvent")
    println("Описание события - $descriptionPlaceOrEvent")
    println("Дата события - $dateEvent")
    println("Время события - $timeEvent")
    println("Расстояние от Земли до Alpha Centauri - $distancePlaceOrEventFromEarth")
}
