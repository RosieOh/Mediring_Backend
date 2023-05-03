package com.linked.app.admin.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/linked/app/admin/controller/AdminUserController;", "", "userService", "Lcom/linked/app/service/UserService;", "(Lcom/linked/app/service/UserService;)V", "edit", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "model", "Lorg/springframework/ui/Model;", "id", "", "editUser", "userEntity", "Lcom/linked/app/model/UserEntity;", "index", "pageable", "Lorg/springframework/data/domain/Pageable;", "mediring-backend"})
@org.springframework.stereotype.Controller()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin/user"})
public class AdminUserController {
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
    @org.springframework.web.bind.annotation.GetMapping(value = {"/edit/{id}"})
    public java.lang.String edit(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/edit"})
    public java.lang.String editUser(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    com.linked.app.model.UserEntity userEntity) {
        return null;
    }
    
    public AdminUserController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.UserService userService) {
        super();
    }
}