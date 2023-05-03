package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAddressEntity is a Querydsl query type for AddressEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAddressEntity extends EntityPathBase<AddressEntity> {

    private static final long serialVersionUID = 303813821L;

    public static final QAddressEntity addressEntity = new QAddressEntity("addressEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath postCode = createString("postCode");

    public final StringPath postDetail = createString("postDetail");

    public final StringPath postText = createString("postText");

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QAddressEntity(String variable) {
        super(AddressEntity.class, forVariable(variable));
    }

    public QAddressEntity(Path<? extends AddressEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddressEntity(PathMetadata metadata) {
        super(AddressEntity.class, metadata);
    }

}

