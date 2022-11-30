package com.example.config

import com.example.plugins.configureRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun ktorServer() = embeddedServer(Netty, port = 8080){
    installDependencyInjection()
    configureSerialization()
    configureRouting()
}