package com.linked.app.service

import com.linked.app.model.ProductEntity
import com.linked.app.repository.ProductRepository
import com.querydsl.core.types.Predicate
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun findAll(predicate: Predicate, page: Pageable): Page<ProductEntity> {
        return productRepository.findAll(predicate, page)
    }

    fun findAll(): MutableList<ProductEntity> {
        return productRepository.findAllByIsActiveIsTrue()
    }

    fun findById(id: Int): ProductEntity? {
        return productRepository.findById(id).orElse(null)
    }

    fun findByBodyId(bodyId: Int): List<ProductEntity> {
        return productRepository.findByBodyIdAndIsActiveIsTrue(bodyId)
    }

    @Transactional
    fun store(productEntity: ProductEntity): ProductEntity {
        return productRepository.save(productEntity)
    }

    fun delete(id: Int): Boolean {
        productRepository.findById(id).orElse(null)?.let {
            it.isActive = false
            productRepository.save(it)
            return true
        } ?: run {
            return false
        }
    }
}