package com.nia.app.model.auth

data class AuthenticationRevocation (
        val token: String,
        var isRevoke: Boolean
)