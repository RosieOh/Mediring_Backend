package com.linked.app.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J&\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/linked/app/config/CORSFilter;", "Ljavax/servlet/Filter;", "()V", "destroy", "", "doFilter", "request", "Ljavax/servlet/ServletRequest;", "response", "Ljavax/servlet/ServletResponse;", "chain", "Ljavax/servlet/FilterChain;", "init", "filterConfig", "Ljavax/servlet/FilterConfig;", "mediring-backend"})
@org.springframework.core.annotation.Order(value = org.springframework.core.Ordered.HIGHEST_PRECEDENCE)
@org.springframework.stereotype.Component()
public class CORSFilter implements javax.servlet.Filter {
    
    @java.lang.Override()
    public void doFilter(@org.jetbrains.annotations.Nullable()
    javax.servlet.ServletRequest request, @org.jetbrains.annotations.Nullable()
    javax.servlet.ServletResponse response, @org.jetbrains.annotations.Nullable()
    javax.servlet.FilterChain chain) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    javax.servlet.FilterConfig filterConfig) {
    }
    
    @java.lang.Override()
    public void destroy() {
    }
    
    public CORSFilter() {
        super();
    }
}