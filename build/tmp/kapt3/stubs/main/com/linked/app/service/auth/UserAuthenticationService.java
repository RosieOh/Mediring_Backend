package com.linked.app.service.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0012J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/linked/app/service/auth/UserAuthenticationService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "()V", "userRepository", "Lcom/linked/app/repository/UserRepository;", "getUserDetailAccount", "Lcom/linked/app/service/auth/UserAuthenticationService$SimpleUserDetails;", "account", "", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "usid", "SimpleUserDetails", "mediring-backend"})
@org.springframework.stereotype.Service()
public class UserAuthenticationService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.linked.app.repository.UserRepository userRepository;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String usid) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
        return null;
    }
    
    private com.linked.app.service.auth.UserAuthenticationService.SimpleUserDetails getUserDetailAccount(java.lang.String account) {
        return null;
    }
    
    public UserAuthenticationService() {
        super();
    }
    
    @java.lang.SuppressWarnings(value = {"serial"})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/linked/app/service/auth/UserAuthenticationService$SimpleUserDetails;", "Lorg/springframework/security/core/userdetails/UserDetails;", "loginId", "", "password", "extraRole", "userId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "authorities", "Ljava/util/HashSet;", "Lorg/springframework/security/core/GrantedAuthority;", "enabled", "", "getAuthorities", "", "getPassword", "getUsername", "isAccountNonExpired", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "toString", "mediring-backend"})
    public static final class SimpleUserDetails implements org.springframework.security.core.userdetails.UserDetails {
        private boolean enabled = true;
        private final java.util.HashSet<org.springframework.security.core.GrantedAuthority> authorities = null;
        private java.lang.String loginId;
        private java.lang.String password;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getUsername() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isCredentialsNonExpired() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getPassword() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isAccountNonExpired() {
            return false;
        }
        
        @java.lang.Override()
        public boolean isAccountNonLocked() {
            return false;
        }
        
        public SimpleUserDetails(@org.jetbrains.annotations.NotNull()
        java.lang.String loginId, @org.jetbrains.annotations.NotNull()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        java.lang.String extraRole, int userId) {
            super();
        }
    }
}