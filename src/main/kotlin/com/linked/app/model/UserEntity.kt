package com.linked.app.model

import javax.persistence.*

@Entity
@Table(name = "user", schema = "mediring", catalog = "")
open class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    var id: Int? = null

    @Column(name = "name", nullable = false)
    var name: String? = null

    @Column(name = "email", nullable = false)
    var email: String? = null

    @Column(name = "password", nullable = false)
    var password: String? = null

    @Column(name = "phone", nullable = true)
    var phone: String? = null

    @Column(name = "user_role", nullable = false)
    var userRole: String? = null

    @Column(name = "is_active", nullable = false)
    var isActive: Boolean? = null

    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    var addresses: MutableList<AddressEntity>? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "name = $name " +
                "email = $email " +
                "password = $password " +
                "phone = $phone " +
                "userRole = $userRole " +
                "isActive = $isActive " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UserEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (email != other.email) return false
        if (password != other.password) return false
        if (phone != other.phone) return false
        if (userRole != other.userRole) return false
        if (isActive != other.isActive) return false

        return true
    }

}

