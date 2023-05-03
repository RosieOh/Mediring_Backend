package com.linked.app.controller.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/")
@Controller
class DashboardController {
    @GetMapping("")
    fun index(): String {
        return "redirect:/admin"
    }
}