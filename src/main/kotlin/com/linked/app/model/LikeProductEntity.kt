package com.linked.app.model

import javax.persistence.*

@Entity
@Table(name = "like_product", schema = "mediring", catalog = "")
open class LikeProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "user_id", nullable = true)
    var userId: Int? = null

    @Column(name = "product_id", nullable = true)
    var productId: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    var refUserEntity: UserEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    var refProductEntity: ProductEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "userId = $userId " +
                "productId = $productId " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as LikeProductEntity

        if (id != other.id) return false
        if (userId != other.userId) return false
        if (productId != other.productId) return false

        return true
    }

}

