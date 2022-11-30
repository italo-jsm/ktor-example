package com.example

import com.example.config.configureSerialization
import com.example.config.installDependencyInjection
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.example.plugins.configureRouting


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        installDependencyInjection()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}

