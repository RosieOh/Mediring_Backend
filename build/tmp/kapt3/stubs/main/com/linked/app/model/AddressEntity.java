package com.linked.app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b\u00a8\u0006#"}, d2 = {"Lcom/linked/app/model/AddressEntity;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "postCode", "", "getPostCode", "()Ljava/lang/String;", "setPostCode", "(Ljava/lang/String;)V", "postDetail", "getPostDetail", "setPostDetail", "postText", "getPostText", "setPostText", "userId", "getUserId", "setUserId", "equals", "other", "hashCode", "toString", "mediring-backend"})
@javax.persistence.Table(name = "address", schema = "mediring", catalog = "")
@javax.persistence.Entity()
public class AddressEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id", nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "user_id", nullable = true)
    private java.lang.Integer userId;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "post_code", nullable = true)
    private java.lang.String postCode;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "post_text", nullable = true)
    private java.lang.String postText;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "post_detail", nullable = true)
    private java.lang.String postDetail;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "is_active", nullable = false)
    private java.lang.Boolean isActive;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
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
    public java.lang.String getPostCode() {
        return null;
    }
    
    public void setPostCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPostText() {
        return null;
    }
    
    public void setPostText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPostDetail() {
        return null;
    }
    
    public void setPostDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Boolean isActive() {
        return null;
    }
    
    public void setActive(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
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
    
    public AddressEntity() {
        super();
    }
}