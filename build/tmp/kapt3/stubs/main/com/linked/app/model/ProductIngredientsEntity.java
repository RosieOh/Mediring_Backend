package com.linked.app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2 = {"Lcom/linked/app/model/ProductIngredientsEntity;", "", "()V", "columnName", "", "getColumnName", "()Ljava/lang/String;", "setColumnName", "(Ljava/lang/String;)V", "columnValue", "getColumnValue", "setColumnValue", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "productId", "getProductId", "setProductId", "refProductEntity", "Lcom/linked/app/model/ProductEntity;", "getRefProductEntity", "()Lcom/linked/app/model/ProductEntity;", "setRefProductEntity", "(Lcom/linked/app/model/ProductEntity;)V", "equals", "", "other", "hashCode", "toString", "mediring-backend"})
@javax.persistence.Table(name = "product_ingredients", schema = "mediring", catalog = "")
@javax.persistence.Entity()
public class ProductIngredientsEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id", nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "product_id", nullable = true)
    private java.lang.Integer productId;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "column_name", nullable = true)
    private java.lang.String columnName;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "column_value", nullable = true)
    private java.lang.String columnValue;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private com.linked.app.model.ProductEntity refProductEntity;
    
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
    public java.lang.String getColumnName() {
        return null;
    }
    
    public void setColumnName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getColumnValue() {
        return null;
    }
    
    public void setColumnValue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.linked.app.model.ProductEntity getRefProductEntity() {
        return null;
    }
    
    public void setRefProductEntity(@org.jetbrains.annotations.Nullable()
    com.linked.app.model.ProductEntity p0) {
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
    
    public ProductIngredientsEntity() {
        super();
    }
}