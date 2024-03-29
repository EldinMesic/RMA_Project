package com.example.pokopy.database

import java.time.LocalDateTime

data class User(
    val username: String? = null,
    val email: String? = null,
    val canExplore: Boolean = false,
    val lastUpdate: String = LocalDateTime.now().toString()
)
