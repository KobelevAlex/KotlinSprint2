package lesson_18

abstract class Animal(name:String) {
    abstract fun eat()
}

class Fox(val name:String): Animal(name) {
    override fun eat() {
        println("$name - ест ягоды!")
    }
}

class Dog(val name: String): Animal(name) {
    override fun eat() {
        println("$name - ест кости!")
    }
}

class Cat(val name: String): Animal(name) {
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
    }
}