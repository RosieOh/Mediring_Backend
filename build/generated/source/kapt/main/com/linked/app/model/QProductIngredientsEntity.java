package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductIngredientsEntity is a Querydsl query type for ProductIngredientsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductIngredientsEntity extends EntityPathBase<ProductIngredientsEntity> {

    private static final long serialVersionUID = -1173559664L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductIngredientsEntity productIngredientsEntity = new QProductIngredientsEntity("productIngredientsEntity");

    public final StringPath columnName = createString("columnName");

    public final StringPath columnValue = createString("columnValue");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final QProductEntity refProductEntity;

    public QProductIngredientsEntity(String variable) {
        this(ProductIngredientsEntity.class, forVariable(variable), INITS);
    }

    public QProductIngredientsEntity(Path<? extends ProductIngredientsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductIngredientsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductIngredientsEntity(PathMetadata metadata, PathInits inits) {
        this(ProductIngredientsEntity.class, metadata, inits);
    }

    public QProductIngredientsEntity(Class<? extends ProductIngredientsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refProductEntity = inits.isInitialized("refProductEntity") ? new QProductEntity(forProperty("refProductEntity"), inits.get("refProductEntity")) : null;
    }

}

