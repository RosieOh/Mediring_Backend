package com.linked.app.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "review", schema = "mediring", catalog = "")
open class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "product_id", nullable = true)
    var productId: Int? = null

    @Column(name = "user_id", nullable = true)
    var userId: Int? = null

    @Column(name = "content", nullable = true)
    var content: String? = null

    @Column(name = "rate", nullable = true)
    var rate: Int? = null

    @Column(name = "added_at", nullable = true)
    var addedAt: LocalDateTime? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    var refProductEntity: ProductEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    var refUserEntity: UserEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "productId = $productId " +
                "userId = $userId " +
                "content = $content " +
                "rate = $rate " +
                "addedAt = $addedAt " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ReviewEntity

        if (id != other.id) return false
        if (productId != other.productId) return false
        if (userId != other.userId) return false
        if (content != other.content) return false
        if (rate != other.rate) return false
        if (addedAt != other.addedAt) return false

        return true
    }

}

