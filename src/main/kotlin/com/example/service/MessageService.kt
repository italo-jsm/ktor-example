package com.example.service

import com.example.database.getConnection
import com.example.model.Message

interface MessageService {
    fun getMessages(): MutableList<Message>
}

class MessageServiceImpl(): MessageService {
    override fun getMessages(): MutableList<Message> {
        val messages = mutableListOf<Message>()
        val result = getConnection().prepareStatement("SELECT * FROM message").executeQuery()
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