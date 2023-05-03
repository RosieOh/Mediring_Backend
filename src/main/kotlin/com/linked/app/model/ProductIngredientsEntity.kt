package com.linked.app.model

import javax.persistence.*

@Entity
@Table(name = "product_ingredients", schema = "mediring", catalog = "")
open class ProductIngredientsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(name = "product_id", nullable = true)
    var productId: Int? = null

    @Column(name = "column_name", nullable = true)
    var columnName: String? = null

    @Column(name = "column_value", nullable = true)
    var columnValue: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    var refProductEntity: ProductEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "productId = $productId " +
                "columnName = $columnName " +
                "columnValue = $columnValue " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ProductIngredientsEntity

        if (id != other.id) return false
        if (productId != other.productId) return false
        if (columnName != other.columnName) return false
        if (columnValue != other.columnValue) return false

        return true
    }

}

