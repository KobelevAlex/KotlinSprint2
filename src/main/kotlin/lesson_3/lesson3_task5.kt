package lesson_3

fun main() {
    var string = "D2-D4;0"
    var stringByParts = string.split('-', ';')
    var whereFrom = stringByParts[0]
    var where = stringByParts[1]
    var numberTurn = stringByParts[2]

    println("$whereFrom - $where: $numberTurn")
}