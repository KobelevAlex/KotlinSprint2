package lesson_11

data class Participant(
    val nameParticipant: String,
    val profilePictureParticipant: String,
    var status: String = "",
)

class Room(
    val coverRoom: String,
    val nameRoom: String,
    private val listOfParticipantsRoom: MutableList<Participant> = mutableListOf(),
) {
    fun theAvatarIsPressed(participant: Participant) {
        println("Аватарка ${participant.profilePictureParticipant} подсвечена! Показан ник - ${participant.nameParticipant}")
    }

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

    fun updateTheStatus(participant: Participant) {
        if (participant in listOfParticipantsRoom) {
            val minValue = 30
            val maxValue = 60
            val range = 0..100
            val randomValue = range.random()

            when {
                randomValue <= minValue -> participant.status = "разговаривает"
                randomValue in (minValue + 1)..maxValue -> participant.status = "микрофон выключен"
                else -> participant.status = "пользователь заглушен"
            }
            println("Участник под ником ${participant.nameParticipant} сейчас имеет статус - ${participant.status}")
        } else {
            println("Участника под ником ${participant.nameParticipant} - нет в этой комнате!")
        }
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
    val room1 = Room("cover_0000.jpg", "Космический зал автостопщиков по Галактикам")
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
    room1.updateTheStatus(participant4)
    room1.updateTheStatus(participant1)
    room1.updateTheStatus(participant2)
    room1.updateTheStatus(participant3)

}
