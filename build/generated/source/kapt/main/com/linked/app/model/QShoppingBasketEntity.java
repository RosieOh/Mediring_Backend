package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShoppingBasketEntity is a Querydsl query type for ShoppingBasketEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShoppingBasketEntity extends EntityPathBase<ShoppingBasketEntity> {

    private static final long serialVersionUID = -1554076597L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShoppingBasketEntity shoppingBasketEntity = new QShoppingBasketEntity("shoppingBasketEntity");

    public final DateTimePath<java.time.LocalDateTime> addedAt = createDateTime("addedAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final NumberPath<Integer> qty = createNumber("qty", Integer.class);

    public final QProductEntity refProductEntity;

    public final QUserEntity refUserEntity;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QShoppingBasketEntity(String variable) {
        this(ShoppingBasketEntity.class, forVariable(variable), INITS);
    }

    public QShoppingBasketEntity(Path<? extends ShoppingBasketEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShoppingBasketEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShoppingBasketEntity(PathMetadata metadata, PathInits inits) {
        this(ShoppingBasketEntity.class, metadata, inits);
    }

    public QShoppingBasketEntity(Class<? extends ShoppingBasketEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refProductEntity = inits.isInitialized("refProductEntity") ? new QProductEntity(forProperty("refProductEntity"), inits.get("refProductEntity")) : null;
        this.refUserEntity = inits.isInitialized("refUserEntity") ? new QUserEntity(forProperty("refUserEntity")) : null;
    }

}

