package com.linked.app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/linked/app/model/BuyListEntity;", "", "()V", "boughtAt", "Ljava/time/LocalDateTime;", "getBoughtAt", "()Ljava/time/LocalDateTime;", "setBoughtAt", "(Ljava/time/LocalDateTime;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "productId", "getProductId", "setProductId", "quantity", "getQuantity", "setQuantity", "userId", "getUserId", "setUserId", "equals", "", "other", "hashCode", "toString", "", "mediring-backend"})
@javax.persistence.Table(name = "buy_list", schema = "mediring", catalog = "")
@javax.persistence.Entity()
public class BuyListEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id", nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "product_id", nullable = true)
    private java.lang.Integer productId;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "user_id", nullable = true)
    private java.lang.Integer userId;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "bought_at", nullable = true)
    private java.time.LocalDateTime boughtAt;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "quantity", nullable = true)
    private java.lang.Integer quantity;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getProductId() {
        return null;
    }
    
    public void setProductId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getUserId() {
        return null;
    }
    
    public void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getBoughtAt() {
        return null;
    }
    
    public void setBoughtAt(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getQuantity() {
        return null;
    }
    
    public void setQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    public BuyListEntity() {
        super();
    }
}