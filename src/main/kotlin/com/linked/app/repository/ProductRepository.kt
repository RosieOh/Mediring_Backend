package com.linked.app.repository

import com.linked.app.model.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CrudRepository<ProductEntity, Int>, QuerydslPredicateExecutor<ProductEntity>,
    JpaRepository<ProductEntity, Int> {
        fun findByBodyIdAndIsActiveIsTrue(bodyId: Int): List<ProductEntity>
        fun findAllByIsActiveIsTrue(): MutableList<ProductEntity>
}