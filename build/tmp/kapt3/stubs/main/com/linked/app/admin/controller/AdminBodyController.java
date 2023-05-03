package com.linked.app.admin.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\"\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J*\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/linked/app/admin/controller/AdminBodyController;", "", "bodyService", "Lcom/linked/app/service/BodyService;", "fileStoreService", "Lcom/linked/app/service/FileStoreService;", "(Lcom/linked/app/service/BodyService;Lcom/linked/app/service/FileStoreService;)V", "delete", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "id", "", "edit", "model", "Lorg/springframework/ui/Model;", "index", "store", "storeItem", "name", "line", "icon", "Lorg/springframework/web/multipart/MultipartFile;", "mediring-backend"})
@org.springframework.stereotype.Controller()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin/body"})
public class AdminBodyController {
    private final com.linked.app.service.BodyService bodyService = null;
    private final com.linked.app.service.FileStoreService fileStoreService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    public java.lang.String index(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/store"})
    public java.lang.String store(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/edit/{id}"})
    public java.lang.String edit(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public java.lang.String storeItem(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int line, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "icon")
    org.springframework.web.multipart.MultipartFile icon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/delete/{id}"})
    public java.lang.String delete(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    public AdminBodyController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.BodyService bodyService, @org.jetbrains.annotations.NotNull()
    com.linked.app.service.FileStoreService fileStoreService) {
        super();
    }
}