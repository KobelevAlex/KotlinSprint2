package lesson_18

abstract class Animal(val name: String) {
    fun sleep() {
        println("$name - лёг спать!")
    }

    abstract fun eat()
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест ягоды!")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест кости!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест рыбу!!")
    }
}

fun main() {
    val listOfObjects: MutableList<Animal> = mutableListOf()
    val fox = Fox("Вук")
    val dog = Dog("Барбос")
    val cat = Cat("Васька")
    listOfObjects.add(fox)
    listOfObjects.add(dog)
    listOfObjects.add(cat)
    for (listItem in listOfObjects) {
        listItem.eat()
        listItem.sleep()
    }
}