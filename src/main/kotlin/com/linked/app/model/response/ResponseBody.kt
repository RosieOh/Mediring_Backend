package com.linked.app.model.response

data class ResponseBody(
    val id: Int?,
    val name: String?,
    val isActive: Boolean?,
    val line: Int?
) {
    var icon: ByteArray? = null
}
