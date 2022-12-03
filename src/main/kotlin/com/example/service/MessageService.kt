package com.example.service

import com.example.model.Message
import com.example.repository.MessageRepository


class MessageService(private val messageRepository: MessageRepository) {
    fun getMessages(): MutableList<Message> {
        return messageRepository.findAll()
    }
}