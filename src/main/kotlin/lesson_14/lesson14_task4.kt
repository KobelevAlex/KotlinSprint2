package lesson_14

abstract class CelestialBodies(
    val name: String, val atmosphere: Boolean, val disembarkation: Boolean,
)

class Planets(name: String, atmosphere: Boolean, disembarkation: Boolean) :
    CelestialBodies(name, atmosphere, disembarkation) {
    private val listSatellites: MutableList<Satellites> = mutableListOf()
    fun addSatellite(satellite: Satellites) {
        listSatellites.add(satellite)
    }

    fun infoPlanets() {
        println("Планета: $name")
        if (listSatellites.isNotEmpty()) {
            println("атмосфера - ${atmosphere}; возможность высадки - ${disembarkation}")
            println("Спутники:")
            for (satellite in listSatellites) {
                println(
                    """
                    - ${satellite.name}
                    атмосфера - ${satellite.atmosphere}; возможность высадки - ${satellite.disembarkation}
                """.trimIndent()
                )
            }
        } else {
            println("У этой планеты нет спутников.")
        }
    }
}

class Satellites(name: String, atmosphere: Boolean, disembarkation: Boolean) :
    CelestialBodies(name, atmosphere, disembarkation)

fun main() {
    val planets1 = Planets("Земля", true, true)
    val planets2 = Planets("Марс", false, true)
    val planets3 = Planets("Плутон", false, true)
    val satellite1 = Satellites("Луна", false, true)
    val satellite2 = Satellites("Фобос", false, true)
    val satellite3 = Satellites("Деймос", true, true)
    val satellite4 = Satellites("Харон", false, true)
    val satellite5 = Satellites("Гидра", true, false)
    val satellite6 = Satellites("Никита", false, true)
    val satellite7 = Satellites("Р4", false, true)
    val satellite8 = Satellites("Р5", true, true)
    planets1.addSatellite(satellite1)
    planets2.addSatellite(satellite2)
    planets2.addSatellite(satellite3)
    planets3.addSatellite(satellite4)
    planets3.addSatellite(satellite5)
    planets3.addSatellite(satellite6)
    planets3.addSatellite(satellite7)
    planets3.addSatellite(satellite8)
    planets1.infoPlanets()
    planets2.infoPlanets()
    planets3.infoPlanets()
}
