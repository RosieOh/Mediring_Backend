package com.linked.app.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "buy_list", schema = "mediring", catalog = "")
open class BuyListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "product_id", nullable = true)
    var productId: Int? = null

    @Column(name = "user_id", nullable = true)
    var userId: Int? = null

    @Column(name = "bought_at", nullable = true)
    var boughtAt: LocalDateTime? = null

    @Column(name = "quantity", nullable = true)
    var quantity: Int? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "productId = $productId " +
                "userId = $userId " +
                "boughtAt = $boughtAt " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as BuyListEntity

        if (id != other.id) return false
        if (productId != other.productId) return false
        if (userId != other.userId) return false
        if (boughtAt != other.boughtAt) return false

        return true
    }

}

