package com.linked.app.model.response

data class ResponseProduct (
    var id: Int? = null,
    var bodyId: Int? = null,
    var title: String? = null,
    var origin: String? = null,
    var company: String? = null,
    var efficacy: String? = null,
    var volume: String? = null,
    var price: Int? = null,
    var thumb: String? = null,
    var isActive: Boolean? = null,
    var type: String? = null,
    var info: String? = null,
    var body: ResponseBody? = null,
    var likeProductId: Int? = null
)