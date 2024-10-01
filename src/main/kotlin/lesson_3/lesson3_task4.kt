package lesson_3

fun main() {


    fun printOutput(whereFrom: String, where: String, numberTurn: Int) {
        println("$whereFrom - $where: $numberTurn")
    }

    printOutput("E2", "E4", 1)
    printOutput("D2", "D3", 2)
    printOutput("E7", "E5", 3)

}