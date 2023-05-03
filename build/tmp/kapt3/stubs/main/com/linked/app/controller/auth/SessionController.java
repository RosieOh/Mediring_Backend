package com.linked.app.controller.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\t\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/linked/app/controller/auth/SessionController;", "", "()V", "userInfo", "Lcom/linked/app/model/session/UserInfo;", "userService", "Lcom/linked/app/service/UserService;", "get", "", "login", "Lcom/linked/app/model/UserEntity;", "Lcom/linked/app/model/request/RequestSessionLogin;", "logout", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "mediring-backend"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/session"})
@org.springframework.web.bind.annotation.RestController()
public class SessionController {
    @javax.annotation.Resource()
    private com.linked.app.model.session.UserInfo userInfo;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.linked.app.service.UserService userService;
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    public com.linked.app.model.UserEntity login(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestSessionLogin login) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/session"})
    public java.lang.String get() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/logout"})
    public void logout(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
    }
    
    public SessionController() {
        super();
    }
}