package lesson_2

fun main() {
    val numberOfPermanentEmployees: Int = 50
    val numberOfInterns: Int = 30
    val salaryOfPermanentEmployees: Int = 30000
    val salaryOfInterns: Int = 20000
    val expensesForPermanentEmployees: Int
    val totalSalaryExpenses: Int
    val averageSalary: Int

    expensesForPermanentEmployees = numberOfPermanentEmployees * salaryOfPermanentEmployees
    totalSalaryExpenses = expensesForPermanentEmployees + numberOfInterns * salaryOfInterns
    averageSalary = totalSalaryExpenses / (numberOfInterns + numberOfPermanentEmployees)


    println(
        """
        Количество постоянных работников - $numberOfPermanentEmployees чел.
        Зарплата постоянных работников - $salaryOfPermanentEmployees руб.
        Количество стажёров - $numberOfInterns чел.
        Зарплата стажёров - $salaryOfInterns руб.
        Расходы на выплату зарплаты постоянным работникам - $expensesForPermanentEmployees руб.
        Общие расходы по зарплате после устройства стажёров - $totalSalaryExpenses руб.
        Средняя зарплата одного сотрудника после устройства стажёров - $averageSalary руб.
        
    """.trimMargin()
    )
}