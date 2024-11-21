package lesson_15

abstract class User {
    abstract fun read()
    abstract fun write()
    val listUsers: MutableList<User> = mutableListOf()
}

class Message {
    val listMessages: MutableList<Message> = mutableListOf()
}

class SimpleUser : User() {
    override fun read() {
        println("User читает сообщения.")
    }

    override fun write() {
        println("User пишет сообщения.")
    }
}

class Admin : User() {
    override fun read() {
        println("Admin читает сообщения.")
    }

    override fun write() {
        println("Admin пишет сообщения.")
    }

    fun removeUser() {
        println("Admin удалил пользователя.")
    }

    fun removeMessage() {
        println("Admin удалил сообщение.")
    }
}

fun main() {
    val user = SimpleUser()
    val admin = Admin()
    user.read()
    user.write()
    admin.read()
    admin.write()
    admin.removeUser()
    admin.removeMessage()
}