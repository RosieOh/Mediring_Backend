package com.linked.app.controller.auth

import com.linked.app.model.UserEntity
import com.linked.app.model.request.RequestSessionLogin
import com.linked.app.model.session.UserInfo
import com.linked.app.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/session")
class SessionController {
    @Resource
    private lateinit var userInfo: UserInfo

    @Autowired
    private lateinit var userService: UserService

    @PostMapping("/login")
    fun login(@RequestBody login: RequestSessionLogin): UserEntity? {
        val encoder = BCryptPasswordEncoder()
        userService.findByEmail(login.loginId)?.let { user ->
            if (encoder.matches(login.password, user.password)) {
                userInfo.loginId = user.email
                userInfo.userName = user.name
                userInfo.userRole = user.userRole
                userInfo.userId = user.id
                user.password = null

                return user
            }
            return null
        } ?: run {
            return null
        }
    }

    @GetMapping("/session")
    fun get(): String? {
        return "$userInfo"
    }

    @GetMapping("/logout")
    fun logout(request: HttpServletRequest) {
        request.session.invalidate()
    }
}