package com.linked.app.repository

import com.linked.app.model.ShoppingBasketEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingBasketRepository: CrudRepository<ShoppingBasketEntity, Int>, QuerydslPredicateExecutor<ShoppingBasketEntity>,
    JpaRepository<ShoppingBasketEntity, Int> {
        fun findByUserId(userId: Int): MutableList<ShoppingBasketEntity>
}