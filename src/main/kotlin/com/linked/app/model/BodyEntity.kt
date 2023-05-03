package com.linked.app.model

import com.linked.app.model.response.ResponseBody
import org.codehaus.jackson.annotate.JsonBackReference
import org.codehaus.jackson.annotate.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "body", schema = "mediring", catalog = "")
open class BodyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "name", nullable = true)
    var name: String? = null

    @Column(name = "is_active", nullable = false)
    var isActive: Boolean? = null

    @Column(name = "icon", nullable = true)
    var icon: String? = null

    @Column(name = "line", nullable = true)
    var line: Int? = null

//    @JsonBackReference
//    @OneToMany(mappedBy = "body")
//    var products: MutableList<ProductEntity>? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "name = $name " +
                "isActive = $isActive " +
                "icon = $icon " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as BodyEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (isActive != other.isActive) return false
        if (icon != other.icon) return false

        return true
    }

    fun toResponse(): ResponseBody {
        return ResponseBody(
            this.id, this.name, this.isActive, this.line
        )
    }
}

