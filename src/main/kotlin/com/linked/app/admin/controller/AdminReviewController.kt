package com.linked.app.admin.controller

import com.linked.app.model.ReviewEntity
import com.linked.app.model.session.UserInfo
import com.linked.app.service.ProductService
import com.linked.app.service.ReviewService
import com.linked.app.service.UserService
import com.querydsl.core.BooleanBuilder
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

@RequestMapping("/admin/review")
@Controller
class AdminReviewController(
    private val reviewService: ReviewService,
    private val productService: ProductService,
    private val userService: UserService
    ) {
    @GetMapping("")
    fun index(request: HttpServletRequest, model: Model, @PageableDefault(page = 1, size = 10) pageable: Pageable): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val paging = PageRequest.of(pageable.pageNumber - 1, pageable.pageSize)
                    val predicate = BooleanBuilder()
                    model.addAttribute("reviews", reviewService.getReviews())
                    return "admin/review/index"
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
                    model.addAttribute("products", productService.findAll())
                    model.addAttribute("users", userService.findAll())
                    "admin/review/store"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/store")
    fun save(
        productId: Int, userId: Int, rate: Int, contents: String,
        request: HttpServletRequest
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    val review = ReviewEntity()
                    review.productId = productId
                    review.userId = userId
                    review.rate = rate
                    review.content = contents
                    review.addedAt = LocalDateTime.now()
                    reviewService.save(review)
                    "redirect:/admin/review"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @GetMapping("/edit/{id}")
    fun edit(@PathVariable("id") id: Int, request: HttpServletRequest, model: Model): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    model.addAttribute("review", reviewService.findOne(id))
                    model.addAttribute("products", productService.findAll())
                    model.addAttribute("users", userService.findAll())
                    "admin/review/edit"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }

    @PostMapping("/edit")
    fun editSave(
        id: Int,
        productId: Int, userId: Int, rate: Int, contents: String,
        request: HttpServletRequest
    ): String {
        request.getSession(false)?.let { session ->
            (session.getAttribute("scopedTarget.userInfo") as UserInfo?)?.let { user ->
                return if (user.userRole == "ROLE_ADMIN") {
                    reviewService.findOne(id)?.let { review ->
                        review.productId = productId
                        review.userId = userId
                        review.rate = rate
                        review.content = contents
                        review.addedAt = LocalDateTime.now()
                        reviewService.save(review)
                    }
                    "redirect:/admin/review"
                } else {
                    "admin/login/index"
                }
            }
        } ?: run {
            return "admin/login/index"
        }
    }
}