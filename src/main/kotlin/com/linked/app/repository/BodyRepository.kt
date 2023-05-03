package com.linked.app.repository

import com.linked.app.model.BodyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BodyRepository: CrudRepository<BodyEntity, Int>, QuerydslPredicateExecutor<BodyEntity>,
    JpaRepository<BodyEntity, Int> {
        fun findAllByIsActiveIsTrue(): List<BodyEntity>
}