package com.linked.app.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBodyEntity is a Querydsl query type for BodyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBodyEntity extends EntityPathBase<BodyEntity> {

    private static final long serialVersionUID = 1287134751L;

    public static final QBodyEntity bodyEntity = new QBodyEntity("bodyEntity");

    public final StringPath icon = createString("icon");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final NumberPath<Integer> line = createNumber("line", Integer.class);

    public final StringPath name = createString("name");

    public QBodyEntity(String variable) {
        super(BodyEntity.class, forVariable(variable));
    }

    public QBodyEntity(Path<? extends BodyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBodyEntity(PathMetadata metadata) {
        super(BodyEntity.class, metadata);
    }

}

