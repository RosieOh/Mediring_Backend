package com.linked.app.controller.api

import com.linked.app.model.ReviewEntity
import com.linked.app.service.ReviewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/review")
@RestController
class ReviewController(private val reviewService: ReviewService) {
    @GetMapping("/product/{id}")
    fun getReviews(@PathVariable("id") productId: Int): List<ReviewEntity> {
        return reviewService.getReviews(productId = productId)
    }
}