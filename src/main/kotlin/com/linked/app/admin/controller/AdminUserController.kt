package com.linked.app.admin.controller

import com.linked.app.model.UserEntity
import com.linked.app.model.session.UserInfo
import com.linked.app.service.UserService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@RequestMapping("/admin/user")
@Controller
class AdminUserController(private val userService: UserService) {
    @GetMapping("")
    fun index(
        request: HttpServletRequest,
        model: Model,
        @PageableDefault(page = 1, size = 10) pageable: Pageable
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val paging = PageRequest.of(pageable.pageNumber - 1, pageable.pageSize)
                    model.addAttribute("users", userService.findByPage(paging))
                    return "admin/user/index"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/edit/{id}")
    fun edit(
        request: HttpServletRequest,
        model: Model,
        @PathVariable("id") id: Int
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("user", userService.get(id))
                    return "admin/user/edit"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/edit")
    fun editUser(
        request: HttpServletRequest,
        userEntity: UserEntity
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    userService.update(id = userEntity.id!!, name = userEntity.name, phone = userEntity.phone, password = null)
                    return "redirect:/admin/user"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }
}