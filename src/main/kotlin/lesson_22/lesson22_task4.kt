package lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()
    fun loadData() {
        var loadedData = "Отсутствие данных"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Текущее состояние: $mainScreenState")
        loadedData = "Загрузка данных"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = true)
        println("Текущее состояние: $mainScreenState")
        loadedData = "Наличие загруженных данных"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Текущее состояние: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}