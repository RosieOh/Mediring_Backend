package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/linked/app/service/ReviewService;", "", "reviewRepository", "Lcom/linked/app/repository/ReviewRepository;", "(Lcom/linked/app/repository/ReviewRepository;)V", "findOne", "Lcom/linked/app/model/ReviewEntity;", "id", "", "getReviews", "", "productId", "save", "reviewEntity", "mediring-backend"})
@org.springframework.stereotype.Service()
public class ReviewService {
    private final com.linked.app.repository.ReviewRepository reviewRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.ReviewEntity findOne(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.ReviewEntity> getReviews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.ReviewEntity> getReviews(int productId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public com.linked.app.model.ReviewEntity save(@org.jetbrains.annotations.NotNull()
    com.linked.app.model.ReviewEntity reviewEntity) {
        return null;
    }
    
    public ReviewService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.ReviewRepository reviewRepository) {
        super();
    }
}