package com.linked.app.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/linked/app/repository/ProductRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/linked/app/model/ProductEntity;", "", "Lorg/springframework/data/querydsl/QuerydslPredicateExecutor;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "findAllByIsActiveIsTrue", "", "findByBodyIdAndIsActiveIsTrue", "", "bodyId", "mediring-backend"})
@org.springframework.stereotype.Repository()
public abstract interface ProductRepository extends org.springframework.data.repository.CrudRepository<com.linked.app.model.ProductEntity, java.lang.Integer>, org.springframework.data.querydsl.QuerydslPredicateExecutor<com.linked.app.model.ProductEntity>, org.springframework.data.jpa.repository.JpaRepository<com.linked.app.model.ProductEntity, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.linked.app.model.ProductEntity> findByBodyIdAndIsActiveIsTrue(int bodyId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.linked.app.model.ProductEntity> findAllByIsActiveIsTrue();
}