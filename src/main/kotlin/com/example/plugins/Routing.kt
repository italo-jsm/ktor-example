package com.example.plugins

import com.example.service.MessageService
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {

    val messageService by inject<MessageService>()
    routing {
        get("/messages") {
            call.respond(messageService.getMessages())
        }
    }
}
