package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductEntity is a Querydsl query type for ProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductEntity extends EntityPathBase<ProductEntity> {

    private static final long serialVersionUID = 2087329144L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductEntity productEntity = new QProductEntity("productEntity");

    public final QBodyEntity body;

    public final NumberPath<Integer> bodyId = createNumber("bodyId", Integer.class);

    public final StringPath company = createString("company");

    public final StringPath efficacy = createString("efficacy");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath info = createString("info");

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath origin = createString("origin");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath thumb = createString("thumb");

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public final StringPath volume = createString("volume");

    public QProductEntity(String variable) {
        this(ProductEntity.class, forVariable(variable), INITS);
    }

    public QProductEntity(Path<? extends ProductEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductEntity(PathMetadata metadata, PathInits inits) {
        this(ProductEntity.class, metadata, inits);
    }

    public QProductEntity(Class<? extends ProductEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.body = inits.isInitialized("body") ? new QBodyEntity(forProperty("body")) : null;
    }

}

