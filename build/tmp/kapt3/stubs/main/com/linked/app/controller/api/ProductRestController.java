package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u0013\u001a\u00020\u0014H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/linked/app/controller/api/ProductRestController;", "", "productService", "Lcom/linked/app/service/ProductService;", "(Lcom/linked/app/service/ProductService;)V", "getProductService", "()Lcom/linked/app/service/ProductService;", "findOne", "Lcom/linked/app/model/ProductEntity;", "id", "", "index", "", "productSearchOption", "Lcom/linked/app/predicate/ProductSearchOption;", "pageable", "Lorg/springframework/data/domain/Pageable;", "partAll", "", "store", "", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/product"})
public class ProductRestController {
    @org.jetbrains.annotations.NotNull()
    private final com.linked.app.service.ProductService productService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    public java.util.List<com.linked.app.model.ProductEntity> index(@org.jetbrains.annotations.NotNull()
    com.linked.app.predicate.ProductSearchOption productSearchOption, @org.jetbrains.annotations.NotNull()
    @org.springframework.data.web.PageableDefault(page = 1, size = 10)
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/part/{id}"})
    public java.util.List<com.linked.app.model.ProductEntity> partAll(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public com.linked.app.model.ProductEntity findOne(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public void store() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.service.ProductService getProductService() {
        return null;
    }
    
    public ProductRestController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.ProductService productService) {
        super();
    }
}