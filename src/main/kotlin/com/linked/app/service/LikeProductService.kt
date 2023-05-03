package com.linked.app.service

import com.linked.app.model.LikeProductEntity
import com.linked.app.repository.LikeProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LikeProductService(private val likeProductRepository: LikeProductRepository) {
    fun findAll(userId: Int): MutableList<LikeProductEntity> {
        return likeProductRepository.findAll()
    }

    @Transactional
    fun changeLike(userId: Int, productId: Int): Boolean {
        likeProductRepository.findByProductIdAndUserId(productId = productId, userId = userId)?.let {
            likeProductRepository.delete(it)
            return true
        }
//        likeProductRepository.findById(likeProductId).orElse(null)?.let {
//            likeProductRepository.delete(it)
//            return true
//        }
        return false
    }

    @Transactional
    fun storeLikeProduct(userId: Int, productId: Int): LikeProductEntity {
        val likeProduct = LikeProductEntity()
        likeProduct.productId = productId
        likeProduct.userId = userId
        return likeProductRepository.save(likeProduct)
    }
}