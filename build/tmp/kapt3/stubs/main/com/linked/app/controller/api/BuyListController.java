package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/linked/app/controller/api/BuyListController;", "", "shoppingBasketService", "Lcom/linked/app/service/ShoppingBasketService;", "buyListService", "Lcom/linked/app/service/BuyListService;", "(Lcom/linked/app/service/ShoppingBasketService;Lcom/linked/app/service/BuyListService;)V", "store", "", "lists", "", "Lcom/linked/app/model/ShoppingBasketEntity;", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/buy-list"})
public class BuyListController {
    private final com.linked.app.service.ShoppingBasketService shoppingBasketService = null;
    private final com.linked.app.service.BuyListService buyListService = null;
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public boolean store(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    java.util.List<? extends com.linked.app.model.ShoppingBasketEntity> lists) {
        return false;
    }
    
    public BuyListController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.ShoppingBasketService shoppingBasketService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.BuyListService buyListService) {
        super();
    }
}