package com.example.plugins

import com.example.service.MessageServiceImpl
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    val messageService = MessageServiceImpl()
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/messages") {
            call.respond(messageService.getMessages())
        }
    }
    routing {
    }
}
