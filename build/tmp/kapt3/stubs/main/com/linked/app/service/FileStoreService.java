package com.linked.app.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017\u00a8\u0006\t"}, d2 = {"Lcom/linked/app/service/FileStoreService;", "", "()V", "storeImage", "", "categoryType", "file", "Lorg/springframework/web/multipart/MultipartFile;", "Companion", "mediring-backend"})
@org.springframework.stereotype.Service()
public class FileStoreService {
    public static final int maxSize = 2200;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String targetPath = "./src/main/resources/uploads";
    public static final com.linked.app.service.FileStoreService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.transaction.annotation.Transactional()
    public java.lang.String storeImage(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    org.springframework.web.multipart.MultipartFile file) {
        return null;
    }
    
    public FileStoreService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/linked/app/service/FileStoreService$Companion;", "", "()V", "maxSize", "", "targetPath", "", "mediring-backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}