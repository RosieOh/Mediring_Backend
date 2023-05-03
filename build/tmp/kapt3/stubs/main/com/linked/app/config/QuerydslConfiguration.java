package com.linked.app.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/linked/app/config/QuerydslConfiguration;", "", "entityManager", "Ljavax/persistence/EntityManager;", "(Ljavax/persistence/EntityManager;)V", "getEntityManager", "()Ljavax/persistence/EntityManager;", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "mediring-backend"})
@com.querydsl.core.annotations.Config()
public final class QuerydslConfiguration {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.PersistenceContext()
    private final javax.persistence.EntityManager entityManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public final com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    public QuerydslConfiguration(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager) {
        super();
    }
}