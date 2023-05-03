package com.linked.app.controller.api

import com.linked.app.model.AddressEntity
import com.linked.app.model.request.RequestAddress
import com.linked.app.service.AddressService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/address")
@RestController
class AddressController(private val addressService: AddressService) {
    @GetMapping("/{id}")
    fun findAll(@PathVariable("id") userId: Int): MutableList<AddressEntity> {
        return addressService.findAll(userId)
    }

    @PostMapping("/store")
    fun store(@RequestBody address: RequestAddress): AddressEntity {
        return addressService.store(userId = address.userId, address = address.address)
    }
}