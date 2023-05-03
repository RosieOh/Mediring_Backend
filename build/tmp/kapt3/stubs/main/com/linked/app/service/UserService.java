package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J(\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J0\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/linked/app/service/UserService;", "", "userRepository", "Lcom/linked/app/repository/UserRepository;", "(Lcom/linked/app/repository/UserRepository;)V", "delete", "", "userId", "", "findAll", "", "Lcom/linked/app/model/UserEntity;", "findByEmail", "email", "", "findByPage", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "get", "id", "store", "name", "password", "phone", "update", "mediring-backend"})
@org.springframework.stereotype.Service()
public class UserService {
    private final com.linked.app.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.linked.app.model.UserEntity> findByPage(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Iterable<com.linked.app.model.UserEntity> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.UserEntity findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.UserEntity get(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.model.UserEntity store(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.UserEntity update(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String phone) {
        return null;
    }
    
    public boolean delete(int userId) {
        return false;
    }
    
    public UserService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.UserRepository userRepository) {
        super();
    }
}