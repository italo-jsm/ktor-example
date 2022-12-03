package com.example

import com.example.config.EnvironmentPropertiesLoader
import com.example.config.ktorServer
import com.typesafe.config.ConfigFactory
import io.ktor.server.config.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.slf4j.LoggerFactory

fun main() {
    ktorServer().start(wait = true)
}

