package com.example.tournamentinfoandroidapp.model.dto

import java.util.*

data class User(
    val id: Int,
    val username: String,
    val password: String,
    val role_number: Int,
    val role_name: String,
    val login_status: Int,
    val create_time: Date,
    val update_time: Date,
    val last_login_time: Date,
    val email: String,
    val full_name: String
)
