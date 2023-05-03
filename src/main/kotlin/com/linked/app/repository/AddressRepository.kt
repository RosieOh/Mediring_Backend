package com.linked.app.repository

import com.linked.app.model.AddressEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository: CrudRepository<AddressEntity, Int>, QuerydslPredicateExecutor<AddressEntity>,
    JpaRepository<AddressEntity, Int> {
        fun findByUserId(userId: Int): MutableList<AddressEntity>
}