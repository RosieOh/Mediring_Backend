package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/linked/app/service/BuyListService;", "", "buyListRepository", "Lcom/linked/app/repository/BuyListRepository;", "(Lcom/linked/app/repository/BuyListRepository;)V", "findAll", "", "Lcom/linked/app/model/BuyListEntity;", "store", "", "buylist", "", "mediring-backend"})
@org.springframework.stereotype.Service()
public class BuyListService {
    private final com.linked.app.repository.BuyListRepository buyListRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.BuyListEntity> findAll() {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void store(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.linked.app.model.BuyListEntity> buylist) {
    }
    
    public BuyListService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.BuyListRepository buyListRepository) {
        super();
    }
}