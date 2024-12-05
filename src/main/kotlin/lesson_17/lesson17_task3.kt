package lesson_17

class Folder(private val _nameFolder: String, private val _quantityFiles: Int, private val _secret: Boolean) {
    val nameFolder: String
        get() =
            if (_secret) "Скрытая папка. Количество файлов - 0"
            else "Папка - $_nameFolder. Количество файлов - $_quantityFiles"
    val quantityFiles: Int
        get() = _quantityFiles
    val secret: Boolean
        get() = _secret
}

fun main() {
    val folder1 = Folder("home", 30, false)
    println(folder1.nameFolder)
    val folder2 = Folder("private", 0, true)
    println(folder2.nameFolder)
}


