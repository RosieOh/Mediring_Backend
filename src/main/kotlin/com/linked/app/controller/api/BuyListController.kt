package com.linked.app.controller.api

import com.linked.app.model.BuyListEntity
import com.linked.app.model.ShoppingBasketEntity
import com.linked.app.service.BuyListService
import com.linked.app.service.ShoppingBasketService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/buy-list")
@RestController
class BuyListController(
    private val shoppingBasketService: ShoppingBasketService,
    private val buyListService: BuyListService
) {
    @PostMapping("/store")
    fun store(@RequestBody lists: List<ShoppingBasketEntity>): Boolean {
        val baskets = lists.map { basket ->
            val buyListEntity = BuyListEntity()
            buyListEntity.productId = basket.productId
            buyListEntity.quantity = basket.qty
            buyListEntity.userId = basket.userId
            buyListEntity
        }

        shoppingBasketService.deleteAll(lists)
        buyListService.store(baskets)
        return true
    }
}