package com.linked.app.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/linked/app/controller/api/AddressController;", "", "addressService", "Lcom/linked/app/service/AddressService;", "(Lcom/linked/app/service/AddressService;)V", "findAll", "", "Lcom/linked/app/model/AddressEntity;", "userId", "", "store", "address", "Lcom/linked/app/model/request/RequestAddress;", "mediring-backend"})
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/address"})
public class AddressController {
    private final com.linked.app.service.AddressService addressService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public java.util.List<com.linked.app.model.AddressEntity> findAll(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/store"})
    public com.linked.app.model.AddressEntity store(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.linked.app.model.request.RequestAddress address) {
        return null;
    }
    
    public AddressController(@org.jetbrains.annotations.NotNull()
    com.linked.app.service.AddressService addressService) {
        super();
    }
}