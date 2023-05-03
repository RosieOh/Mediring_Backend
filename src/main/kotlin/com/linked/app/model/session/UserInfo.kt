package com.linked.app.model.session

import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Component
import org.springframework.web.context.WebApplicationContext

@Component
@Scope(WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
data class UserInfo(
    var loginId: String? = null,
    var userName: String? = null,
    var userRole: String? = null,
    var userId: Int? = 0
) {
    companion object {
        val serialVersionUID = 1L
    }
}