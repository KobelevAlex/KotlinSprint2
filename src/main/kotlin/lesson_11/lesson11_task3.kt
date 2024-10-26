package lesson_11

data class Participant(val nameParticipant: String, val profilePictureParticipant: String) {
}

class Rooms(
    val coverRoom: String,
    val nameRoom: String,
) {
    // список участников комнаты
    private val listOfParticipantsRoom: MutableList<Participant> = mutableListOf()

    //При долгом нажатии на аватар подсветится его никнейм.
    fun theAvatarIsPressed(participant: Participant) {
        //логиа отслеживания долгого нажатия на аватарку
        println("Аватарка ${participant.profilePictureParticipant} подсвечена! Показан ник - ${participant.nameParticipant}")
    }

    //– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
    fun addParticipant(participant: Participant) {
        listOfParticipantsRoom.add(participant)
        println(
            """
                Участник с ником - ${participant.nameParticipant}, добавлен в комнату!
                Добро пожаловать!
            """.trimIndent()
        )
    }

    fun greeting() {
        println("Приветствуем Вас в - $nameRoom! (показана обложка - $coverRoom)")
    }

    fun removeParticipant(participant: Participant) {
        listOfParticipantsRoom.remove(participant)
        println(
            """
                Участник с ником - ${participant.nameParticipant}, был удалён из комнаты!
                """.trimIndent()
        )
    }

    //– обновления статуса (принимает имя пользователя и новый статус).
    fun updateTheStatus(participant: Participant, status: String) {
        //статусы участника: “разговаривает”, “микрофон выключен”, “пользователь заглушен”
        if (participant in listOfParticipantsRoom) {
            println("Участник под ником ${participant.nameParticipant}  сейчас имеет статус - $status")
        } else println("Участника под ником ${participant.nameParticipant} - нет в этой комнате!")
    }

    fun displayParticipants() {
        if (listOfParticipantsRoom.isEmpty()) {
            println("Пока в этой комнате нет участников!")
        } else {
            println("Участники в комнате:")
            listOfParticipantsRoom.forEach { participant ->
                println("Аватарка: ${participant.profilePictureParticipant}")
            }
        }

    }
}

fun main() {
    val participant1 = Participant("Фёдор", "Трактор")
    val participant2 = Participant("Алиса", "Ромашка")
    val participant3 = Participant("Кирилл", "Мотоцикл")
    val participant4 = Participant("Марина", "Кошечка")
    val room1 = Rooms("cover_0000.jpg", "Космический зал автостопщиков по Галактикам")
    room1.greeting()
    room1.displayParticipants()
    room1.addParticipant(participant1)
    room1.displayParticipants()
    room1.addParticipant(participant2)
    room1.addParticipant(participant3)
    room1.addParticipant(participant4)
    room1.displayParticipants()
    room1.removeParticipant(participant1)
    room1.displayParticipants()
    room1.theAvatarIsPressed(participant2)
    room1.theAvatarIsPressed(participant4)
    room1.updateTheStatus(participant4, "разговаривает")
    room1.updateTheStatus(participant1, "разговаривает")
    room1.updateTheStatus(participant2, "отключен микрофон")
    room1.updateTheStatus(participant3, "пользователь заглушен")

}
