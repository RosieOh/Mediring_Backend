package com.linked.app.predicate

import com.linked.app.model.QProductEntity
import com.querydsl.core.BooleanBuilder
import com.querydsl.core.types.Predicate

data class ProductSearchOption(val title: String?) {
    fun predicate(): Predicate {
        val predicate = BooleanBuilder()

        title?.let {
            predicate.and(QProductEntity.productEntity.title.contains(title))
        }

        return predicate
    }
}