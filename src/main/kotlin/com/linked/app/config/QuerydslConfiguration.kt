package com.linked.app.config

import com.querydsl.core.annotations.Config
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Config
class QuerydslConfiguration(@PersistenceContext val entityManager: EntityManager) {
    @Bean
    fun jpaQueryFactory() = JPAQueryFactory(entityManager)
}