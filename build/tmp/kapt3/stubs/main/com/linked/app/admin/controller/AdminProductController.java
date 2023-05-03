package com.linked.app.admin.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017Jl\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000e2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017J\"\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u001f\u001a\u00020 H\u0017J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017Jb\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/linked/app/admin/controller/AdminProductController;", "", "fileStoreService", "Lcom/linked/app/service/FileStoreService;", "productService", "Lcom/linked/app/service/ProductService;", "bodyService", "Lcom/linked/app/service/BodyService;", "(Lcom/linked/app/service/FileStoreService;Lcom/linked/app/service/ProductService;Lcom/linked/app/service/BodyService;)V", "delete", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "id", "", "edit", "model", "Lorg/springframework/ui/Model;", "editItem", "bodyId", "title", "origin", "company", "efficacy", "volume", "type", "info", "price", "thumb", "Lorg/springframework/web/multipart/MultipartFile;", "index", "pageable", "Lorg/springframework/data/domain/Pageable;", "store", "storeItem", "mediring-backend"})
@org.springframework.stereotype.Controller()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin/product"})
public class AdminProductController {
    private final com.linked.app.service.FileStoreService fileStoreService = null;
    private final com.linked.app.service.ProductService productService = null;
    private final com.linked.app.service.BodyService bodyService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    public java.lang.String index(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model, @org.jetbrains.annotations.NotNull()
    @org.springframework.data.web.PageableDefault(page = 1, size = 10)
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/store"})
    public java.lang.String store(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/edit/{id}"})
    public java.lang.String edit(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public java.lang.String storeItem(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, int bodyId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String origin, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String efficacy, @org.jetbrains.annotations.NotNull()
    java.lang.String volume, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String info, int price, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "thumb")
    org.springframework.web.multipart.MultipartFile thumb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/edit"})
    public java.lang.String editItem(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, int id, int bodyId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String origin, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String efficacy, @org.jetbrains.annotations.NotNull()
    java.lang.String volume, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String info, int price, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "thumb")
    org.springframework.web.multipart.MultipartFile thumb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/delete/{id}"})
    public java.lang.String delete(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    public AdminProductController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.FileStoreService fileStoreService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.BodyService bodyService) {
        super();
    }
}