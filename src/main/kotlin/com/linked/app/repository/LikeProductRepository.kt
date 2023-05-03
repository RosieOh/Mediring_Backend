package com.linked.app.repository

import com.linked.app.model.LikeProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LikeProductRepository: CrudRepository<LikeProductEntity, Int>, QuerydslPredicateExecutor<LikeProductEntity>,
    JpaRepository<LikeProductEntity, Int> {
        fun findByProductIdAndUserId(productId:Int, userId: Int): LikeProductEntity?
}