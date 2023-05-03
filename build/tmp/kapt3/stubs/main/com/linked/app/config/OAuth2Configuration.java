package com.linked.app.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/linked/app/config/OAuth2Configuration;", "", "()V", "AuthorizationServerConfiguration", "Companion", "ResourceServerConfiguration", "mediring-backend"})
@org.springframework.context.annotation.Configuration()
public class OAuth2Configuration {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String resourceId = "mediring-resource";
    public static final com.linked.app.config.OAuth2Configuration.Companion Companion = null;
    
    public OAuth2Configuration() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/linked/app/config/OAuth2Configuration$ResourceServerConfiguration;", "Lorg/springframework/security/oauth2/config/annotation/web/configuration/ResourceServerConfigurerAdapter;", "()V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "resources", "Lorg/springframework/security/oauth2/config/annotation/web/configurers/ResourceServerSecurityConfigurer;", "mediring-backend"})
    @org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer()
    @org.springframework.context.annotation.Configuration()
    public static class ResourceServerConfiguration extends org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter {
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.Nullable()
        org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer resources) {
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.Nullable()
        org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        }
        
        public ResourceServerConfiguration() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\b\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/linked/app/config/OAuth2Configuration$AuthorizationServerConfiguration;", "Lorg/springframework/security/oauth2/config/annotation/web/configuration/AuthorizationServerConfigurerAdapter;", "()V", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "tokenStore", "Lorg/springframework/security/oauth2/provider/token/store/InMemoryTokenStore;", "userDetailsService", "Lcom/linked/app/service/auth/UserAuthenticationService;", "configure", "", "clients", "Lorg/springframework/security/oauth2/config/annotation/configurers/ClientDetailsServiceConfigurer;", "endpoints", "Lorg/springframework/security/oauth2/config/annotation/web/configurers/AuthorizationServerEndpointsConfigurer;", "security", "Lorg/springframework/security/oauth2/config/annotation/web/configurers/AuthorizationServerSecurityConfigurer;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "tokenService", "Lorg/springframework/security/oauth2/provider/token/DefaultTokenServices;", "mediring-backend"})
    @org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer()
    @org.springframework.context.annotation.Configuration()
    public static class AuthorizationServerConfiguration extends org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter {
        private final org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore tokenStore = null;
        @org.springframework.beans.factory.annotation.Qualifier(value = "authenticationManagerBean")
        @org.springframework.beans.factory.annotation.Autowired()
        private org.springframework.security.authentication.AuthenticationManager authenticationManager;
        @org.springframework.beans.factory.annotation.Autowired()
        private com.linked.app.service.auth.UserAuthenticationService userDetailsService;
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.Nullable()
        org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer endpoints) throws java.lang.Exception {
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.Nullable()
        org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer security) throws java.lang.Exception {
        }
        
        @java.lang.Override()
        public void configure(@org.jetbrains.annotations.Nullable()
        org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer clients) throws java.lang.Exception {
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.context.annotation.Primary()
        @org.springframework.context.annotation.Bean()
        public org.springframework.security.oauth2.provider.token.DefaultTokenServices tokenService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.context.annotation.Primary()
        @org.springframework.context.annotation.Bean()
        public org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore tokenStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.context.annotation.Bean()
        public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
            return null;
        }
        
        public AuthorizationServerConfiguration() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/linked/app/config/OAuth2Configuration$Companion;", "", "()V", "resourceId", "", "mediring-backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}