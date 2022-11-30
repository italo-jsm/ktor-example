package com.example.database

import java.sql.Connection
import java.sql.DriverManager

fun getConnection(): Connection {
    val jdbcUrl = "jdbc:postgresql://localhost:5432/postgres"

    val connection = DriverManager
        .getConnection(jdbcUrl, "postgres", "mysecretpassword")
    println(connection.isValid(0))
    return connection
}