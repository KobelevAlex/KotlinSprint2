package lesson_11

class MemberOfTheForum(var userId: String, val userName: String)
class ForumMessage(val authorId: String, val message: String)
class Forum() {
    private val listMessages: MutableList<ForumMessage> = mutableListOf()
    private val listOfForumUsers: MutableList<MemberOfTheForum> = mutableListOf()
    private val initialUserId = 99999
    private val listId: MutableList<Int> = mutableListOf(initialUserId)
    private fun generateUniqueId(): String {
        var userId = listId.last()
        userId++
        listId.add(userId)
        return userId.toString()
    }

    fun createNewUser(userName: String): MemberOfTheForum {
        val forumUser = MemberOfTheForum(generateUniqueId(), userName)
        listOfForumUsers.add(forumUser)
        return forumUser
    }

    fun displayUsers() {
        if (listOfForumUsers.isEmpty()) {
            println("Нет пользователей на форуме.")
        } else {
            println("Пользователи на форуме:")
            listOfForumUsers.forEach { println("${it.userId} - ${it.userName}") }
        }
    }

    fun createNewMessage(userId: String) {
        val author = listOfForumUsers.find { it.userId == userId }
        if (author != null) {
            println("${author.userName} напишите своё сообщение тут:")
            val enterMessage = readln()
            val message = ForumMessage(authorId = userId, message = enterMessage)
            listMessages.add(message)
        } else println("Пользователя с Id - $userId нет на форуме. Вы не можете написать сообщение.")
    }

    fun printThread() {
        if (listMessages.isEmpty()) {
            println("Нет сообщений на форуме.")
        } else {
            println("Сообщения на форуме:")
            for (message in listMessages) {
                val author = listOfForumUsers.find { it.userId == message.authorId }
                println("${author?.userName}: ${message.message}")
            }
        }
    }
}

fun main() {
    val forum = Forum()
    forum.displayUsers()
    val user1 = forum.createNewUser("Алексей")
    forum.displayUsers()
    val user2 = forum.createNewUser("Алекcандр")
    forum.displayUsers()
    forum.printThread()
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)
    forum.printThread()
}
