package com.linked.app.service.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/linked/app/service/auth/AuthenticationService;", "", "()V", "tokenStore", "Lorg/springframework/security/oauth2/provider/token/TokenStore;", "filterToken", "", "token", "revokeToken", "Lcom/nia/app/model/auth/AuthenticationRevocation;", "request", "Ljavax/servlet/http/HttpServletRequest;", "mediring-backend"})
@org.springframework.stereotype.Service()
public class AuthenticationService {
    @org.springframework.beans.factory.annotation.Autowired()
    private org.springframework.security.oauth2.provider.token.TokenStore tokenStore;
    
    @org.jetbrains.annotations.NotNull()
    public com.nia.app.model.auth.AuthenticationRevocation revokeToken(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String filterToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    public AuthenticationService() {
        super();
    }
}