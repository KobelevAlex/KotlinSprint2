package lesson_14

open class Message(val text: String, val authorName: String, val id: Int)

class RegularMessage(text: String, authorName: String, id: Int) : Message(text, authorName, id)
class ChildMessage(message: String, authorName: String, id: Int, val parentMessageId: Int) :
    Message(message, authorName, id)

class Chat() {
    private fun uniqueId() = listMessages.size + 1
    private val listMessages: MutableList<Message> = mutableListOf()
    fun addMessage(text: String, authorName: String) {
        val message = RegularMessage(text, authorName, uniqueId())
        listMessages.add(message)
    }

    fun addThreadMessage(text: String, authorName: String, parentMessageId: Int) {
        val threadMessage = ChildMessage(text, authorName, uniqueId(), parentMessageId)
        listMessages.add(threadMessage)
    }

    fun printChat() {
        val listSortMessages = listMessages.groupBy {
            when (it) {
                is ChildMessage -> it.parentMessageId
                else -> it.id
            }
        }
        for ((parentId, listMessages) in listSortMessages) {
            for (message in listMessages) {
                when (message) {
                    is ChildMessage -> println("\t ${message.parentMessageId} - ${message.authorName}: ${message.text}")
                    else -> println("${message.id} - ${message.authorName}: ${message.text}")

                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Привет, как дела?", "Лена")
    chat.addMessage("Нормально!", "Дима")
    chat.addThreadMessage("Пойдём гулять?", "Лена", 3)
    chat.addThreadMessage("Давай! Зайду через час!", "Дима", 4)
    chat.printChat()
}


