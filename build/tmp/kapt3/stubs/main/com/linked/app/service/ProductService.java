package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/linked/app/service/ProductService;", "", "productRepository", "Lcom/linked/app/repository/ProductRepository;", "(Lcom/linked/app/repository/ProductRepository;)V", "delete", "", "id", "", "findAll", "", "Lcom/linked/app/model/ProductEntity;", "Lorg/springframework/data/domain/Page;", "predicate", "Lcom/querydsl/core/types/Predicate;", "page", "Lorg/springframework/data/domain/Pageable;", "findByBodyId", "", "bodyId", "findById", "store", "productEntity", "mediring-backend"})
@org.springframework.stereotype.Service()
public class ProductService {
    private final com.linked.app.repository.ProductRepository productRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.linked.app.model.ProductEntity> findAll(@org.jetbrains.annotations.NotNull()
    com.querydsl.core.types.Predicate predicate, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.ProductEntity> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.ProductEntity findById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.ProductEntity> findByBodyId(int bodyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public com.linked.app.model.ProductEntity store(@org.jetbrains.annotations.NotNull()
    com.linked.app.model.ProductEntity productEntity) {
        return null;
    }
    
    public boolean delete(int id) {
        return false;
    }
    
    public ProductService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.ProductRepository productRepository) {
        super();
    }
}