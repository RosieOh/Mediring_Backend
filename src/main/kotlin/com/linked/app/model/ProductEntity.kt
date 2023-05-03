package com.linked.app.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.linked.app.model.response.ResponseProduct
import javax.persistence.*

@Entity
@Table(name = "product", schema = "mediring", catalog = "")
open class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    var id: Int? = null

    @Column(name = "body_id", nullable = true)
    var bodyId: Int? = null

    @Column(name = "title", nullable = true)
    var title: String? = null

    @Column(name = "origin", nullable = true)
    var origin: String? = null

    @Column(name = "company", nullable = true)
    var company: String? = null

    @Column(name = "efficacy", nullable = true)
    var efficacy: String? = null

    @Column(name = "volume", nullable = true)
    var volume: String? = null

    @Column(name = "price", nullable = true)
    var price: Int? = null

    @Column(name = "thumb", nullable = true)
    var thumb: String? = null

    @Column(name = "is_active", nullable = false)
    var isActive: Boolean? = null

    @Column(name = "type", nullable = true)
    var type: String? = null

    @Column(name = "info", nullable = true)
    var info: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "body_id", insertable = false, updatable = false)
    var body: BodyEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "bodyId = $bodyId " +
                "title = $title " +
                "origin = $origin " +
                "company = $company " +
                "efficacy = $efficacy " +
                "volume = $volume " +
                "price = $price " +
                "thumb = $thumb " +
                "isActive = $isActive " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ProductEntity

        if (id != other.id) return false
        if (bodyId != other.bodyId) return false
        if (title != other.title) return false
        if (origin != other.origin) return false
        if (company != other.company) return false
        if (efficacy != other.efficacy) return false
        if (volume != other.volume) return false
        if (price != other.price) return false
        if (thumb != other.thumb) return false
        if (isActive != other.isActive) return false

        return true
    }

    fun toResponse(): ResponseProduct {
        return ResponseProduct(
            id, bodyId, title, origin, company, efficacy,
            volume, price, thumb, isActive, type, info, body?.toResponse()
        )
    }
}

