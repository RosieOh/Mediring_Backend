package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/linked/app/service/LikeProductService;", "", "likeProductRepository", "Lcom/linked/app/repository/LikeProductRepository;", "(Lcom/linked/app/repository/LikeProductRepository;)V", "changeLike", "", "userId", "", "productId", "findAll", "", "Lcom/linked/app/model/LikeProductEntity;", "storeLikeProduct", "mediring-backend"})
@org.springframework.stereotype.Service()
public class LikeProductService {
    private final com.linked.app.repository.LikeProductRepository likeProductRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.LikeProductEntity> findAll(int userId) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public boolean changeLike(int userId, int productId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public com.linked.app.model.LikeProductEntity storeLikeProduct(int userId, int productId) {
        return null;
    }
    
    public LikeProductService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.LikeProductRepository likeProductRepository) {
        super();
    }
}