package com.example.config

import io.ktor.server.config.*
import io.ktor.server.config.ConfigLoader.Companion.load

object EnvironmentPropertiesLoader {
    private const val DEFAULT_PROPERTY_FILE = "application.conf"

    fun getEnvironmentConf() = ConfigLoader.load(DEFAULT_PROPERTY_FILE)
}