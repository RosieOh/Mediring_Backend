package com.linked.app.admin.controller

import com.linked.app.model.BodyEntity
import com.linked.app.model.ProductEntity
import com.linked.app.model.session.UserInfo
import com.linked.app.service.BodyService
import com.linked.app.service.FileStoreService
import com.linked.app.service.ProductService
import com.querydsl.core.BooleanBuilder
import com.querydsl.core.types.Predicate
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import javax.servlet.http.HttpServletRequest

@RequestMapping("/admin/product")
@Controller
class AdminProductController(
    private val fileStoreService: FileStoreService,
    private val productService: ProductService,
    private val bodyService: BodyService
) {
    @GetMapping("")
    fun index(request: HttpServletRequest, model: Model, @PageableDefault(page = 1, size = 10) pageable: Pageable): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val paging = PageRequest.of(pageable.pageNumber - 1, pageable.pageSize)
                    val predicate = BooleanBuilder()
                    model.addAttribute("products", productService.findAll(predicate, paging))
                    return "admin/product/index"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/store")
    fun store(request: HttpServletRequest, model: Model): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("bodys", bodyService.findAll())
                    return "admin/product/store"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/edit/{id}")
    fun edit(request: HttpServletRequest, @PathVariable("id") id: Int, model: Model): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("bodys", bodyService.findAll())
                    model.addAttribute("product", productService.findById(id))
                    return "admin/product/edit"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/store")
    fun storeItem(
        request: HttpServletRequest,
        bodyId: Int, title: String, origin: String,
        company: String, efficacy: String, volume: String,
        type: String, info: String,
        price: Int, @RequestParam("thumb") thumb: MultipartFile
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val savedPath = fileStoreService.storeImage("product", thumb)
                    val product = ProductEntity()
                    product.bodyId = bodyId
                    product.title = title
                    product.company = company
                    product.efficacy = efficacy
                    product.origin = origin
                    product.volume = volume
                    product.price = price
                    product.type = type
                    product.info = info
                    product.thumb = savedPath
                    product.isActive = true
                    productService.store(product)
                    return "redirect:/admin/product"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/edit")
    fun editItem(
        request: HttpServletRequest,
        id: Int,
        bodyId: Int, title: String, origin: String,
        company: String, efficacy: String, volume: String,
        type: String, info: String,
        price: Int, @RequestParam("thumb") thumb: MultipartFile?
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    productService.findById(id)?.let {
                        it.bodyId = bodyId
                        it.title = title
                        it.origin = origin
                        it.company = company
                        it.efficacy = efficacy
                        it.volume = volume
                        it.price = price

                        it.type = type
                        it.info = info

                        thumb?.let { thumb ->
                            if (thumb.size > 0) {
                                val savedPath = fileStoreService.storeImage("product", thumb)
                                it.thumb = savedPath
                            }
                        }
                        productService.store(it)
                    }
                    return "redirect:/admin/product"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/delete/{id}")
    fun delete(request: HttpServletRequest, @PathVariable("id") id: Int): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    if (productService.delete(id)) {
                        "redirect:/admin/product"
                    } else {
                        "admin/login/index"
                    }
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }
}