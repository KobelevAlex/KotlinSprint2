package lesson_10

private const val USERNAME = "alex123"
private const val PASSWORD = "alex123"
private val cart = listOf("Велосипед", "Мопед", "Самокат")

private fun generateToken(): String {
    val firstRange = ('A'..'Z')
    val secondRange = ('a'..'z')
    val numbersRange = ('0'..'9')
    val characters = firstRange + secondRange + numbersRange

    return (1..32).map { characters.random() }.joinToString("")
}

fun authorize(username: String, password: String): String? {
    return if (username == USERNAME && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): List<String>? {
    return if (token != null) {
        cart
    } else {
        null
    }
}

fun main() {
    val username = "alex123"
    val password = "alex123"
    val token = authorize(username, password)
    val cartItems = getCart(token)

    if (cartItems != null) {
        println("Содержимое корзины: ${cartItems.joinToString()}")
    } else {
        println("Неудачная авторизация.")
    }
}

