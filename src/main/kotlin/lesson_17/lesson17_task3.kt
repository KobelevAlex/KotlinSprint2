package lesson_17

class Folder(
    val name: String,
    val quantityFiles: Int,
    val isSecret: Boolean,
) {
    val nameFolder: String
        get() = if (isSecret) "Скрытая папка. Количество файлов - 0"
    else "Папка - $name. Количество файлов - $quantityFiles"
}

fun main() {
    val folder1 = Folder("home", 30, false)
    println(folder1.nameFolder)
    val folder2 = Folder("private", 0, true)
    println(folder2.nameFolder)
}


