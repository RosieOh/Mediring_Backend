package com.linked.app.model

import javax.persistence.*

@Entity
@Table(name = "address", schema = "mediring", catalog = "")
open class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "user_id", nullable = true)
    var userId: Int? = null

    @Column(name = "post_code", nullable = true)
    var postCode: String? = null

    @Column(name = "post_text", nullable = true)
    var postText: String? = null

    @Column(name = "post_detail", nullable = true)
    var postDetail: String? = null

    @Column(name = "is_active", nullable = false)
    var isActive: Boolean? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "userId = $userId " +
                "postCode = $postCode " +
                "postText = $postText " +
                "postDetail = $postDetail " +
                "isActive = $isActive " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as AddressEntity

        if (id != other.id) return false
        if (userId != other.userId) return false
        if (postCode != other.postCode) return false
        if (postText != other.postText) return false
        if (postDetail != other.postDetail) return false
        if (isActive != other.isActive) return false

        return true
    }

}

