package com.example.repository

import com.example.database.getConnection
import com.example.model.Message
import java.sql.Connection

interface MessageRepository{
    fun findAll() : MutableList<Message>
}

class MessageRepositoryImpl(private val connection: Connection) : MessageRepository{
    override fun findAll(): MutableList<Message> {
        val messages = mutableListOf<Message>()
        val result = connection.prepareStatement("SELECT * FROM message").executeQuery()
        while(result.next()){
            val message = Message(
                id = result.getString("id"),
                payload = result.getString("payload"),
                senderId = result.getString("senderid"),
                receiverId = result.getString("receiverid"),
                consumed = result.getBoolean("consumed"),
                consumedAt = "",
                moment = result.getString("moment"),
            )
            messages.add(message)
        }
        return messages
    }
}
