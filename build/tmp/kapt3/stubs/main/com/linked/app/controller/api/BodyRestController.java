package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/linked/app/controller/api/BodyRestController;", "", "bodyService", "Lcom/linked/app/service/BodyService;", "productService", "Lcom/linked/app/service/ProductService;", "(Lcom/linked/app/service/BodyService;Lcom/linked/app/service/ProductService;)V", "getBodyService", "()Lcom/linked/app/service/BodyService;", "getProductService", "()Lcom/linked/app/service/ProductService;", "bodyList", "", "Lcom/linked/app/model/BodyEntity;", "partList", "Lcom/linked/app/model/response/ResponseProduct;", "bodyId", "", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/body"})
public class BodyRestController {
    @org.jetbrains.annotations.NotNull()
    private final com.linked.app.service.BodyService bodyService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.linked.app.service.ProductService productService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    public java.util.List<com.linked.app.model.BodyEntity> bodyList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/part/{id}"})
    public java.util.List<com.linked.app.model.response.ResponseProduct> partList(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int bodyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.service.BodyService getBodyService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.service.ProductService getProductService() {
        return null;
    }
    
    public BodyRestController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.BodyService bodyService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.ProductService productService) {
        super();
    }
}