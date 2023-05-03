package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0017J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/linked/app/service/ShoppingBasketService;", "", "shoppingBasketRepository", "Lcom/linked/app/repository/ShoppingBasketRepository;", "(Lcom/linked/app/repository/ShoppingBasketRepository;)V", "delete", "", "Lcom/linked/app/model/ShoppingBasketEntity;", "id", "", "deleteAll", "", "baskets", "", "findAll", "store", "basket", "mediring-backend"})
@org.springframework.stereotype.Service()
public class ShoppingBasketService {
    private final com.linked.app.repository.ShoppingBasketRepository shoppingBasketRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.ShoppingBasketEntity> findAll(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public com.linked.app.model.ShoppingBasketEntity store(@org.jetbrains.annotations.NotNull()
    com.linked.app.model.ShoppingBasketEntity basket) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public java.util.List<com.linked.app.model.ShoppingBasketEntity> delete(int id) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.linked.app.model.ShoppingBasketEntity> baskets) {
    }
    
    public ShoppingBasketService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.ShoppingBasketRepository shoppingBasketRepository) {
        super();
    }
}