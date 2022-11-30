package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val id: String,
    val payload: String,
    val senderId: String,
    val receiverId: String,
    val moment: String,
    val consumed: Boolean,
    val consumedAt: String
)
