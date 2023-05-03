package com.linked.app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/linked/app/model/BodyEntity;", "", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "line", "getLine", "setLine", "name", "getName", "setName", "equals", "other", "hashCode", "toResponse", "Lcom/linked/app/model/response/ResponseBody;", "toString", "mediring-backend"})
@javax.persistence.Table(name = "body", schema = "mediring", catalog = "")
@javax.persistence.Entity()
public class BodyEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "id", nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "name", nullable = true)
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "is_active", nullable = false)
    private java.lang.Boolean isActive;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "icon", nullable = true)
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "line", nullable = true)
    private java.lang.Integer line;
    
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
    public java.lang.Boolean isActive() {
        return null;
    }
    
    public void setActive(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getIcon() {
        return null;
    }
    
    public void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getLine() {
        return null;
    }
    
    public void setLine(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.NotNull()
    public com.linked.app.model.response.ResponseBody toResponse() {
        return null;
    }
    
    public BodyEntity() {
        super();
    }
}