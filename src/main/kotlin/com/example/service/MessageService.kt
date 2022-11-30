package com.example.service

import com.example.database.getConnection
import com.example.model.Message
import com.example.repository.MessageRepository
import org.koin.ktor.ext.inject


class MessageService(private val messageRepository: MessageRepository) {
    fun getMessages(): MutableList<Message> {
        return messageRepository.findAll()
    }
}