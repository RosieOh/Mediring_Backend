package com.linked.app.service

import com.linked.app.model.ReviewEntity
import com.linked.app.repository.ReviewRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ReviewService(private val reviewRepository: ReviewRepository) {
    fun findOne(id: Int): ReviewEntity? {
        return reviewRepository.findById(id).orElse(null)
    }

    fun getReviews(): List<ReviewEntity> {
        return reviewRepository.findAll()
    }

    fun getReviews(productId: Int): List<ReviewEntity> {
        return reviewRepository.findByProductId(productId)
    }

    @Transactional
    fun save(reviewEntity: ReviewEntity): ReviewEntity {
        return reviewRepository.save(reviewEntity)
    }
}