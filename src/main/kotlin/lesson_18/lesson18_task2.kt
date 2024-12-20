package lesson_18

open class Dice(private val numberOfFaces: Int) {
    fun throwBone() {
        println("Бросок игральной костью с $numberOfFaces гранями")
    }
}

class Dice4faces(numberOfFaces: Int = 4) : Dice(numberOfFaces)
class Dice6faces(numberOfFaces: Int = 6) : Dice(numberOfFaces)
class Dice8faces(numberOfFaces: Int = 8) : Dice(numberOfFaces)

fun main() {
    val listOfObjects: MutableList<Dice> = mutableListOf()
    val dice4faces = Dice4faces()
    val dice6faces = Dice6faces()
    val dice8faces = Dice8faces()
    listOfObjects.add(dice4faces)
    listOfObjects.add(dice6faces)
    listOfObjects.add(dice8faces)
    for (listItem in listOfObjects) {
        listItem.throwBone()
    }
}