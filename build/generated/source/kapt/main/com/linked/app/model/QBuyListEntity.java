package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBuyListEntity is a Querydsl query type for BuyListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBuyListEntity extends EntityPathBase<BuyListEntity> {

    private static final long serialVersionUID = -46224115L;

    public static final QBuyListEntity buyListEntity = new QBuyListEntity("buyListEntity");

    public final DateTimePath<java.time.LocalDateTime> boughtAt = createDateTime("boughtAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QBuyListEntity(String variable) {
        super(BuyListEntity.class, forVariable(variable));
    }

    public QBuyListEntity(Path<? extends BuyListEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBuyListEntity(PathMetadata metadata) {
        super(BuyListEntity.class, metadata);
    }

}

