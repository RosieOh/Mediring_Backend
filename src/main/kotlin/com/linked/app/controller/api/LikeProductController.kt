package com.linked.app.controller.api

import com.linked.app.model.LikeProductEntity
import com.linked.app.model.request.RequestLikeProduct
import com.linked.app.service.LikeProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/like")
@RestController
class LikeProductController(val likeProductService: LikeProductService) {
    @GetMapping("/list/{id}")
    fun getLikes(@PathVariable("id") id: Int): MutableList<LikeProductEntity> {
        return likeProductService.findAll(userId = id)
    }

    @PostMapping("/store")
    fun like(@RequestBody request: RequestLikeProduct): LikeProductEntity {
        return likeProductService.storeLikeProduct(request.userId, request.productId)
    }

    @PostMapping("/delete")
    fun delete(@RequestBody request: RequestLikeProduct): Boolean {
        return likeProductService.changeLike(userId = request.userId, productId = request.productId)
    }
}