package com.linked.app.repository

import com.linked.app.model.ProductIngredientsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductIngredientsRepository: CrudRepository<ProductIngredientsEntity, Int>, QuerydslPredicateExecutor<ProductIngredientsEntity>,
    JpaRepository<ProductIngredientsEntity, Int> {
}