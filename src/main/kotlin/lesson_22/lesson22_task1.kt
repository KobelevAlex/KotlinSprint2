package lesson_22

class RegularBook(val titleBook: String, val authorBook: String)
data class DataBook(val titleBook: String, val authorBook: String)

fun main() {
    val regularBook1: RegularBook = RegularBook("Малохитовая шкатулка", "Бажов П.П.")
    val regularBook2: RegularBook = RegularBook("Малохитовая шкатулка", "Бажов П.П.")
    val dataBook1: DataBook = DataBook("Малохитовая шкатулка", "Бажов П.П.")
    val dataBook2: DataBook = DataBook("Малохитовая шкатулка", "Бажов П.П.")
    println("regularBook1 = regularBook2 - ${regularBook1 == regularBook2}")
// это объекты обычного класса, поэтому тут сравниваются их адреса ячеек памяти,
// где расположены эти объекты,а они разные.
    println("dataBook1 = dataBook2 - ${dataBook1 == dataBook2}")
// т.к. это объекты дата класса, то тут сравниваются именно значения объектов, а они одинаковые.
}