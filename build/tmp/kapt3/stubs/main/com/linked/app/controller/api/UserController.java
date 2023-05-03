package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/linked/app/controller/api/UserController;", "", "userService", "Lcom/linked/app/service/UserService;", "(Lcom/linked/app/service/UserService;)V", "getUserService", "()Lcom/linked/app/service/UserService;", "delete", "", "id", "", "store", "Lcom/linked/app/model/UserEntity;", "body", "Lcom/linked/app/model/request/RequestUser;", "update", "user", "users", "", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/user"})
public class UserController {
    @org.jetbrains.annotations.NotNull()
    private final com.linked.app.service.UserService userService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/list"})
    public java.lang.Iterable<com.linked.app.model.UserEntity> users() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public com.linked.app.model.UserEntity user(@org.springframework.web.bind.annotation.PathVariable(name = "id")
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public com.linked.app.model.UserEntity store(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestUser body) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/update"})
    public com.linked.app.model.UserEntity update(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestUser body) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/delete/{id}"})
    public boolean delete(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.service.UserService getUserService() {
        return null;
    }
    
    public UserController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.UserService userService) {
        super();
    }
}