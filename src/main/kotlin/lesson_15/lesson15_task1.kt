package lesson_15

interface Swim {
    fun swim()
}

interface Walk {
    fun walk()
}

interface Fly {
    fun fly()
}

class Duck(name: String) : Swim, Walk, Fly {
    override fun walk() {
        println("Утка ходит.")
    }

    override fun fly() {
        println("Утка летает.")
    }

    override fun swim() {
        println("Утка плавает.")
    }

}

class CrucianCarp(name: String) : Swim {
    override fun swim() {
        println("Карась плавает.")
    }
}

class Seagull(name: String) : Swim, Fly, Walk {
    override fun walk() {
        println("Чайка ходит.")
    }

    override fun fly() {
        println("Чайка летает.")
    }

    override fun swim() {
        println("Чайка плавает.")
    }
}

fun main() {
    val duck = Duck("Утка")
    val crucianCarp = CrucianCarp("Карась")
    val seagull = Seagull("Чайка")
    duck.fly()
    duck.swim()
    duck.walk()
    crucianCarp.swim()
    seagull.fly()
    seagull.swim()
    seagull.walk()
}