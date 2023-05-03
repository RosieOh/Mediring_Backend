package com.linked.app.controller.api

import com.linked.app.model.UserEntity
import com.linked.app.model.request.RequestUser
import com.linked.app.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/user")
@RestController
class UserController(val userService: UserService) {
    @GetMapping("/list")
    fun users(): MutableIterable<UserEntity> {
        return userService.findAll()
    }

    @GetMapping("/{id}")
    fun user(@PathVariable(name = "id") id: Int): UserEntity? {
        return userService.get(id)
    }

    @PostMapping("/store")
    fun store(@RequestBody body: RequestUser): UserEntity {
        return userService.store(name = body.name!!, email = body.email!!, password = body.password!!, phone = body.phone!!)
    }

    @PostMapping("/update")
    fun update(@RequestBody body: RequestUser): UserEntity? {
        return userService.update(id = body.id!!, name = body.name, password = body.password, phone = body.phone)
    }

    @PostMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Int): Boolean {
        return userService.delete(id)
    }
}