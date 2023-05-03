package com.linked.app.controller.api

import com.linked.app.model.ProductEntity
import com.linked.app.predicate.ProductSearchOption
import com.linked.app.service.ProductService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/product")
@RestController
class ProductRestController(val productService: ProductService) {
    @GetMapping("")
    fun index(
        productSearchOption: ProductSearchOption,
        @PageableDefault(page = 1, size = 10) pageable: Pageable
    ): MutableList<ProductEntity> {
//        val paging = PageRequest.of(pageable.pageNumber - 1, pageable.pageSize)
//        return productService.findAll(productSearchOption.predicate(), paging)
        return productService.findAll()
    }
    @GetMapping("/part/{id}")
    fun partAll(@PathVariable("id") id: Int): List<ProductEntity> {
        return productService.findByBodyId(bodyId = id)
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable("id") id: Int): ProductEntity? {
        return productService.findById(id)
    }

    @PostMapping("/store")
    fun store() {

    }
}