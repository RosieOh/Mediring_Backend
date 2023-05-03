package com.nia.app.model.auth

data class AuthenticationToken (
        val id: String,
        val token: String,
        val roles: Map<String, Boolean>
)