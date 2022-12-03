package com.example.config

import com.example.database.DatabaseConnection
import com.example.repository.MessageRepository
import com.example.repository.MessageRepositoryImpl
import com.example.service.MessageService
import io.ktor.server.application.*
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun propertiesModule() = module {
    single { EnvironmentPropertiesLoader.getEnvironmentConf() }
}
fun postgresModule() = module {
    single { DatabaseConnection(get()) }
}

fun messageRepositoryModule() = module {
    single<MessageRepository> { MessageRepositoryImpl(get()) }
}

fun messageServiceModule() = module {
    single { MessageService(get()) }
}

fun Application.installDependencyInjection() = install(Koin){
    slf4jLogger()
    modules(
        postgresModule(),
        messageRepositoryModule(),
        messageServiceModule(),
        propertiesModule()
    )
}