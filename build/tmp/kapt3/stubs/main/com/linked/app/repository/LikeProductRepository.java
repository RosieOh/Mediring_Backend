package com.linked.app.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/linked/app/repository/LikeProductRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/linked/app/model/LikeProductEntity;", "", "Lorg/springframework/data/querydsl/QuerydslPredicateExecutor;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "findByProductIdAndUserId", "productId", "userId", "mediring-backend"})
@org.springframework.stereotype.Repository()
public abstract interface LikeProductRepository extends org.springframework.data.repository.CrudRepository<com.linked.app.model.LikeProductEntity, java.lang.Integer>, org.springframework.data.querydsl.QuerydslPredicateExecutor<com.linked.app.model.LikeProductEntity>, org.springframework.data.jpa.repository.JpaRepository<com.linked.app.model.LikeProductEntity, java.lang.Integer> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.linked.app.model.LikeProductEntity findByProductIdAndUserId(int productId, int userId);
}