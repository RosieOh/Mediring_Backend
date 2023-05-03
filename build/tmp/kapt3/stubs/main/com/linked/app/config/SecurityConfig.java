package com.linked.app.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0015J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/linked/app/config/SecurityConfig;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "userAuthDetailUserService", "Lcom/linked/app/service/auth/UserAuthenticationService;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "authenticationManagerBean", "configure", "", "auth", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "web", "Lorg/springframework/security/config/annotation/web/builders/WebSecurity;", "mediring-backend"})
@org.springframework.context.annotation.Configuration()
public class SecurityConfig extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.linked.app.service.auth.UserAuthenticationService userAuthDetailUserService;
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.Nullable()
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.authentication.AuthenticationManager authenticationManagerBean() throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.context.annotation.Bean()
    protected org.springframework.security.authentication.AuthenticationManager authenticationManager() {
        return null;
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.WebSecurity web) throws java.lang.Exception {
    }
    
    public SecurityConfig() {
        super();
    }
}