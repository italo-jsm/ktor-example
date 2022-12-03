package com.example.database

import io.ktor.server.config.*
import java.sql.Connection
import java.sql.DriverManager


class DatabaseConnection(private val config: ApplicationConfig){
    fun getConnection(): Connection {
        val username = config.propertyOrNull("database.username")?.getString()
        val password = config.propertyOrNull("database.password")?.getString()
        val url = config.propertyOrNull("database.url")?.getString()

        val connection = DriverManager
            .getConnection(url, username, password)
        println(connection.isValid(0))
        return connection
    }
}