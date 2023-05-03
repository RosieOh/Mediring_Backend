package com.linked.app.admin.controller

import com.linked.app.model.session.UserInfo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@RequestMapping("/admin")
@Controller
class AdminDashboardController {
    @GetMapping("")
    fun index(request: HttpServletRequest): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    return "admin/dashboard/index"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }
}