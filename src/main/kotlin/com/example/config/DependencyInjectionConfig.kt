package com.example.config

import com.example.database.getConnection
import io.ktor.server.application.*
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun postgresModule() = module {
    single(named("connection")) { getConnection() }
}

fun Application.installDependencyInjection() = install(Koin){
    slf4jLogger()
    modules(
        postgresModule()
    )
}