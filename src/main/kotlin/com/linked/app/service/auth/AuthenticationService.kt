package com.linked.app.service.auth

import com.google.common.base.Strings
import com.nia.app.model.auth.AuthenticationRevocation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.oauth2.provider.token.TokenStore
import org.springframework.stereotype.Service
import javax.servlet.http.HttpServletRequest

@Service
class AuthenticationService {
    @Autowired
    private lateinit var tokenStore: TokenStore

    fun revokeToken(request: HttpServletRequest): AuthenticationRevocation {
        val token = this.filterToken(request.getHeader("Authorization"))
        tokenStore.readAccessToken(token)?.let { accessToken ->
            accessToken.refreshToken?.let { tokenStore.removeRefreshToken(accessToken.refreshToken) }
            tokenStore.removeAccessToken(accessToken)
            return AuthenticationRevocation(token, true)
        } ?: run {
            return AuthenticationRevocation(token, false)
        }
    }

    fun filterToken(token: String): String {
        return Strings.nullToEmpty(token).replace("Bearer", "").trim()
    }
}