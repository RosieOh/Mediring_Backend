package com.linked.app.admin.controller

import com.linked.app.model.BodyEntity
import com.linked.app.model.session.UserInfo
import com.linked.app.service.BodyService
import com.linked.app.service.FileStoreService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile
import javax.servlet.http.HttpServletRequest

@RequestMapping("/admin/body")
@Controller
class AdminBodyController(
    private val bodyService: BodyService,
    private val fileStoreService: FileStoreService
    ) {
    @GetMapping("")
    fun index(request: HttpServletRequest, model: Model): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("body", bodyService.findAll())
                    return "admin/body/index"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/store")
    fun store(request: HttpServletRequest): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    return "admin/body/store"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/edit/{id}")
    fun edit(request: HttpServletRequest, model: Model, @PathVariable("id") id: Int): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("body", bodyService.find(id))
                    return "admin/body/edit"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/store")
    fun storeItem(request: HttpServletRequest, name: String, line: Int, @RequestParam("icon") icon: MultipartFile): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val savedPath = fileStoreService.storeImage("body", icon)
                    val entity = BodyEntity()
                    entity.name = name
                    entity.icon = savedPath
                    entity.line = line
                    entity.isActive = true
                    bodyService.store(entity)
                    return "redirect:/admin/body"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/delete/{id}")
    fun delete(request: HttpServletRequest, @PathVariable("id") id: Int): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                if (user.userRole == "ROLE_ADMIN") {
                    return if (bodyService.delete(id)) {
                        "redirect:/admin/body"
                    } else {
                        "admin/login/index"
                    }
                } else {
                    return "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }
}