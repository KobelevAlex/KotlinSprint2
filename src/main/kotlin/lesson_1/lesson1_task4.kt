package lesson_1

fun main() {
    val length: Long = 40868600000
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000
    println(
        """
      Расстояние полёта, мм - $length
      Возраст, лет - $age
      Часть дня - $partOfDay
      Секунды - $seconds
      Часть года - $partOfYear
      Апогей орбиты - $apogee      
    """.trimIndent()
    )

}
