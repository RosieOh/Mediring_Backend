package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviewEntity is a Querydsl query type for ReviewEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewEntity extends EntityPathBase<ReviewEntity> {

    private static final long serialVersionUID = 445097173L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviewEntity reviewEntity = new QReviewEntity("reviewEntity");

    public final DateTimePath<java.time.LocalDateTime> addedAt = createDateTime("addedAt", java.time.LocalDateTime.class);

    public final StringPath content = createString("content");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final NumberPath<Integer> rate = createNumber("rate", Integer.class);

    public final QProductEntity refProductEntity;

    public final QUserEntity refUserEntity;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QReviewEntity(String variable) {
        this(ReviewEntity.class, forVariable(variable), INITS);
    }

    public QReviewEntity(Path<? extends ReviewEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviewEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviewEntity(PathMetadata metadata, PathInits inits) {
        this(ReviewEntity.class, metadata, inits);
    }

    public QReviewEntity(Class<? extends ReviewEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refProductEntity = inits.isInitialized("refProductEntity") ? new QProductEntity(forProperty("refProductEntity"), inits.get("refProductEntity")) : null;
        this.refUserEntity = inits.isInitialized("refUserEntity") ? new QUserEntity(forProperty("refUserEntity")) : null;
    }

}

