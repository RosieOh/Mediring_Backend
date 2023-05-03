package com.linked.app.repository

import com.linked.app.model.ReviewEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository: CrudRepository<ReviewEntity, Int>, QuerydslPredicateExecutor<ReviewEntity>,
    JpaRepository<ReviewEntity, Int> {
        fun findByProductId(productId: Int): List<ReviewEntity>
}