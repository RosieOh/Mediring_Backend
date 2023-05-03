package com.linked.app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020\u000bH\u0016R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR \u0010 \u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR \u0010#\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR \u0010&\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\r\"\u0004\b(\u0010\u000f\u00a8\u0006-"}, d2 = {"Lcom/linked/app/model/UserEntity;", "", "()V", "addresses", "", "Lcom/linked/app/model/AddressEntity;", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "name", "getName", "setName", "password", "getPassword", "setPassword", "phone", "getPhone", "setPhone", "userRole", "getUserRole", "setUserRole", "equals", "other", "hashCode", "toString", "mediring-backend"})
@javax.persistence.Table(name = "user", schema = "mediring", catalog = "")
@javax.persistence.Entity()
public class UserEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id", nullable = false, insertable = false, updatable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "name", nullable = false)
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "email", nullable = false)
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "password", nullable = false)
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "phone", nullable = true)
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "user_role", nullable = false)
    private java.lang.String userRole;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "is_active", nullable = false)
    private java.lang.Boolean isActive;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @javax.persistence.OneToMany()
    private java.util.List<com.linked.app.model.AddressEntity> addresses;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPassword() {
        return null;
    }
    
    public void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPhone() {
        return null;
    }
    
    public void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUserRole() {
        return null;
    }
    
    public void setUserRole(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Boolean isActive() {
        return null;
    }
    
    public void setActive(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<com.linked.app.model.AddressEntity> getAddresses() {
        return null;
    }
    
    public void setAddresses(@org.jetbrains.annotations.Nullable()
    java.util.List<com.linked.app.model.AddressEntity> p0) {
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
    
    public UserEntity() {
        super();
    }
}