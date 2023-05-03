package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/linked/app/service/BodyService;", "", "bodyRepository", "Lcom/linked/app/repository/BodyRepository;", "(Lcom/linked/app/repository/BodyRepository;)V", "delete", "", "id", "", "find", "Lcom/linked/app/model/BodyEntity;", "findAll", "", "store", "bodyEntity", "mediring-backend"})
@org.springframework.stereotype.Service()
public class BodyService {
    private final com.linked.app.repository.BodyRepository bodyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.BodyEntity> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.BodyEntity find(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public com.linked.app.model.BodyEntity store(@org.jetbrains.annotations.NotNull()
    com.linked.app.model.BodyEntity bodyEntity) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public boolean delete(int id) {
        return false;
    }
    
    public BodyService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.BodyRepository bodyRepository) {
        super();
    }
}