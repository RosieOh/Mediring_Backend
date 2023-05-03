package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLikeProductEntity is a Querydsl query type for LikeProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLikeProductEntity extends EntityPathBase<LikeProductEntity> {

    private static final long serialVersionUID = -462186463L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLikeProductEntity likeProductEntity = new QLikeProductEntity("likeProductEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final QProductEntity refProductEntity;

    public final QUserEntity refUserEntity;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QLikeProductEntity(String variable) {
        this(LikeProductEntity.class, forVariable(variable), INITS);
    }

    public QLikeProductEntity(Path<? extends LikeProductEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLikeProductEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLikeProductEntity(PathMetadata metadata, PathInits inits) {
        this(LikeProductEntity.class, metadata, inits);
    }

    public QLikeProductEntity(Class<? extends LikeProductEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refProductEntity = inits.isInitialized("refProductEntity") ? new QProductEntity(forProperty("refProductEntity"), inits.get("refProductEntity")) : null;
        this.refUserEntity = inits.isInitialized("refUserEntity") ? new QUserEntity(forProperty("refUserEntity")) : null;
    }

}

