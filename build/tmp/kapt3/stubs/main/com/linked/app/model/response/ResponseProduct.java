package com.linked.app.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010;\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010G\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00b6\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001J\t\u0010M\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\r\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!\u00a8\u0006N"}, d2 = {"Lcom/linked/app/model/response/ResponseProduct;", "", "id", "", "bodyId", "title", "", "origin", "company", "efficacy", "volume", "price", "thumb", "isActive", "", "type", "info", "body", "Lcom/linked/app/model/response/ResponseBody;", "likeProductId", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/linked/app/model/response/ResponseBody;Ljava/lang/Integer;)V", "getBody", "()Lcom/linked/app/model/response/ResponseBody;", "setBody", "(Lcom/linked/app/model/response/ResponseBody;)V", "getBodyId", "()Ljava/lang/Integer;", "setBodyId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCompany", "()Ljava/lang/String;", "setCompany", "(Ljava/lang/String;)V", "getEfficacy", "setEfficacy", "getId", "setId", "getInfo", "setInfo", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLikeProductId", "setLikeProductId", "getOrigin", "setOrigin", "getPrice", "setPrice", "getThumb", "setThumb", "getTitle", "setTitle", "getType", "setType", "getVolume", "setVolume", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/linked/app/model/response/ResponseBody;Ljava/lang/Integer;)Lcom/linked/app/model/response/ResponseProduct;", "equals", "other", "hashCode", "toString", "mediring-backend"})
public final class ResponseProduct {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer bodyId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String origin;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String company;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String efficacy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String volume;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thumb;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isActive;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String info;
    @org.jetbrains.annotations.Nullable()
    private com.linked.app.model.response.ResponseBody body;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer likeProductId;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBodyId() {
        return null;
    }
    
    public final void setBodyId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrigin() {
        return null;
    }
    
    public final void setOrigin(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEfficacy() {
        return null;
    }
    
    public final void setEfficacy(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVolume() {
        return null;
    }
    
    public final void setVolume(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumb() {
        return null;
    }
    
    public final void setThumb(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isActive() {
        return null;
    }
    
    public final void setActive(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.linked.app.model.response.ResponseBody getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    com.linked.app.model.response.ResponseBody p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLikeProductId() {
        return null;
    }
    
    public final void setLikeProductId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public ResponseProduct(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bodyId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String origin, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.lang.String efficacy, @org.jetbrains.annotations.Nullable()
    java.lang.String volume, @org.jetbrains.annotations.Nullable()
    java.lang.Integer price, @org.jetbrains.annotations.Nullable()
    java.lang.String thumb, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isActive, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String info, @org.jetbrains.annotations.Nullable()
    com.linked.app.model.response.ResponseBody body, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeProductId) {
        super();
    }
    
    public ResponseProduct() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.linked.app.model.response.ResponseBody component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.linked.app.model.response.ResponseProduct copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bodyId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String origin, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.lang.String efficacy, @org.jetbrains.annotations.Nullable()
    java.lang.String volume, @org.jetbrains.annotations.Nullable()
    java.lang.Integer price, @org.jetbrains.annotations.Nullable()
    java.lang.String thumb, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isActive, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String info, @org.jetbrains.annotations.Nullable()
    com.linked.app.model.response.ResponseBody body, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeProductId) {
        return null;
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
    java.lang.Object p0) {
        return false;
    }
}