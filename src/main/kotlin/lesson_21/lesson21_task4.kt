package lesson_21

import java.io.File

fun File.writeToFileAtStart(text: String) {
    if (!this.exists()) {
        this.createNewFile()
    }
    val currentContent = this.readText()
    val lowerCaseText = text.lowercase()
    this.writeText("$lowerCaseText\n$currentContent")
}

fun main() {
    val file = File("pop.txt")
    file.writeToFileAtStart("Он её убил.")
    file.writeToFileAtStart("Она съела кусок мяса.")
    file.writeToFileAtStart("Он её любил.")
    file.writeToFileAtStart("У попа была собака.")
    println(file.readText())
}
