package com.linked.app.controller.api

import com.linked.app.model.ShoppingBasketEntity
import com.linked.app.service.ShoppingBasketService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/basket")
@RestController
class ShoppingBasketController(private val shoppingBasketService: ShoppingBasketService) {
    @GetMapping("/find/{id}")
    fun findAll(@PathVariable("id") id: Int): MutableList<ShoppingBasketEntity> {
        return shoppingBasketService.findAll(id)
    }

    @PostMapping("/store")
    fun store(@RequestBody basket: ShoppingBasketEntity): ShoppingBasketEntity {
        return shoppingBasketService.store(basket)
    }

    @GetMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Int): MutableList<ShoppingBasketEntity> {
        return shoppingBasketService.delete(id)
    }
}