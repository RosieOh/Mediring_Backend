package com.linked.app.repository

import com.linked.app.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<UserEntity, Int>, QuerydslPredicateExecutor<UserEntity>,
    JpaRepository<UserEntity, Int> {
        override fun findAll(): MutableList<UserEntity>
        fun findByEmail(email: String): UserEntity?
}