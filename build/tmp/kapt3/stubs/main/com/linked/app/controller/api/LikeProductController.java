package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/linked/app/controller/api/LikeProductController;", "", "likeProductService", "Lcom/linked/app/service/LikeProductService;", "(Lcom/linked/app/service/LikeProductService;)V", "getLikeProductService", "()Lcom/linked/app/service/LikeProductService;", "delete", "", "request", "Lcom/linked/app/model/request/RequestLikeProduct;", "getLikes", "", "Lcom/linked/app/model/LikeProductEntity;", "id", "", "like", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/like"})
public class LikeProductController {
    @org.jetbrains.annotations.NotNull()
    private final com.linked.app.service.LikeProductService likeProductService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/list/{id}"})
    public java.util.List<com.linked.app.model.LikeProductEntity> getLikes(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public com.linked.app.model.LikeProductEntity like(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestLikeProduct request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/delete"})
    public boolean delete(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestLikeProduct request) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.service.LikeProductService getLikeProductService() {
        return null;
    }
    
    public LikeProductController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.LikeProductService likeProductService) {
        super();
    }
}