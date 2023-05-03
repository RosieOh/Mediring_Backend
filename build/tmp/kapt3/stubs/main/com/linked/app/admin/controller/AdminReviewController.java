package com.linked.app.admin.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J8\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\"\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017J0\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/linked/app/admin/controller/AdminReviewController;", "", "reviewService", "Lcom/linked/app/service/ReviewService;", "productService", "Lcom/linked/app/service/ProductService;", "userService", "Lcom/linked/app/service/UserService;", "(Lcom/linked/app/service/ReviewService;Lcom/linked/app/service/ProductService;Lcom/linked/app/service/UserService;)V", "edit", "", "id", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "model", "Lorg/springframework/ui/Model;", "editSave", "productId", "userId", "rate", "contents", "index", "pageable", "Lorg/springframework/data/domain/Pageable;", "save", "store", "mediring-backend"})
@org.springframework.stereotype.Controller()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin/review"})
public class AdminReviewController {
    private final com.linked.app.service.ReviewService reviewService = null;
    private final com.linked.app.service.ProductService productService = null;
    private final com.linked.app.service.UserService userService = null;
    
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
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public java.lang.String save(int productId, int userId, int rate, @org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/edit/{id}"})
    public java.lang.String edit(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/edit"})
    public java.lang.String editSave(int id, int productId, int userId, int rate, @org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    public AdminReviewController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.ReviewService reviewService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.UserService userService) {
        super();
    }
}