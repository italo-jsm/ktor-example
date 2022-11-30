package com.example.repository

interface MessageRepository{
    fun findAll()
}

class MessageRepositoryImpl : MessageRepository{
    override fun findAll() {
    }
}
