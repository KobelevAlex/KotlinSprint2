package lesson_18

abstract class Dice {
    abstract val numberOfFaces: Int
    abstract fun throwBone()
}

class Dice4faces() : Dice() {
    override val numberOfFaces = 4
    override fun throwBone() {
        println("Бросок игральной костью с 4 гранями")
    }
}

class Dice6faces() : Dice() {
    override val numberOfFaces = 6
    override fun throwBone() {
        println("Бросок игральной костью с 6 гранями")
    }
}

class Dice8faces() : Dice() {
    override val numberOfFaces = 8
    override fun throwBone() {
        println("Бросок игральной костью с 8 гранями")
    }
}

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