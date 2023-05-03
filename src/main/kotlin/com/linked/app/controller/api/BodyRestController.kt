package com.linked.app.controller.api

import com.linked.app.model.BodyEntity
import com.linked.app.model.ProductEntity
import com.linked.app.model.response.ResponseBody
import com.linked.app.model.response.ResponseProduct
import com.linked.app.service.BodyService
import com.linked.app.service.ProductService
import org.apache.commons.io.IOUtils
import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.FileInputStream
import java.io.InputStream
import javax.servlet.http.HttpServletRequest

@RequestMapping("/api/body")
@RestController
class BodyRestController(
    val bodyService: BodyService,
    val productService: ProductService
    ) {
    @GetMapping("")
    fun bodyList(): List<BodyEntity> {
        return bodyService.findAll()
    }

    @GetMapping("/part/{id}")
    fun partList(@PathVariable("id") bodyId: Int): List<ResponseProduct> {
        return productService.findByBodyId(bodyId).map {
            it.toResponse()
        }
    }
}