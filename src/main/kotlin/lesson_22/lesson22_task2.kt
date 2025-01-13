package lesson_22

class RegularBook2(val titleBook: String, val authorBook: String)
data class DataBook2(val titleBook: String, val authorBook: String)

fun main() {
    val regularBook1: RegularBook2 = RegularBook2("Малохитовая шкатулка", "Бажов П.П.")
    val dataBook1: DataBook2 = DataBook2("Малохитовая шкатулка", "Бажов П.П.")
    println(regularBook1)
// regularBook1 - это объект обычного класса,тут хранится адрес ячееки памяти,
// где расположен этот объект.
    println(dataBook1)
// dataBook1 - это объект дата класса, где объект  хешируется и переводится в String,
// что позволяет его вывести на печать в читабельном виде. А ещё можно этот объект копировать и сравнивать.
}