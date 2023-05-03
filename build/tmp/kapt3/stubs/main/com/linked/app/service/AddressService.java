package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/linked/app/service/AddressService;", "", "addressRepository", "Lcom/linked/app/repository/AddressRepository;", "(Lcom/linked/app/repository/AddressRepository;)V", "findAll", "", "Lcom/linked/app/model/AddressEntity;", "userId", "", "store", "address", "", "mediring-backend"})
@org.springframework.stereotype.Service()
public class AddressService {
    private final com.linked.app.repository.AddressRepository addressRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.linked.app.model.AddressEntity> findAll(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public com.linked.app.model.AddressEntity store(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public AddressService(@org.jetbrains.annotations.NotNull()
    com.linked.app.repository.AddressRepository addressRepository) {
        super();
    }
}