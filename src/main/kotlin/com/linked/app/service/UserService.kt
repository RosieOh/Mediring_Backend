package com.linked.app.service

import com.linked.app.model.UserEntity
import com.linked.app.repository.UserRepository
import com.querydsl.core.BooleanBuilder
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findByPage(pageable: Pageable): Page<UserEntity> {
        return userRepository.findAll(pageable)
    }

    fun findAll(): MutableIterable<UserEntity> {
        val predicate = BooleanBuilder()
        return userRepository.findAll(predicate)
    }

    fun findByEmail(email: String): UserEntity? {
        return userRepository.findByEmail(email)
    }

    fun get(id: Int): UserEntity? {
        return userRepository.findById(id).orElse(null)
    }

    fun store(name: String, email: String, password: String, phone: String): UserEntity {
        val user = UserEntity()
        user.name = name
        user.email = email
        user.phone = phone
        user.userRole = "ROLE_USER"
        user.isActive = true
        user.password = BCryptPasswordEncoder().encode(password)
        return userRepository.save(user)
    }

    fun update(id: Int, name: String?, password: String?, phone: String?): UserEntity? {
        userRepository.findById(id).orElse(null)?.let { user ->
            name?.let {
                user.name = it
            }
            password?.let {
                user.password = BCryptPasswordEncoder().encode(it)
            }
            phone?.let {
                user.phone = it
            }
            return userRepository.save(user)
        } ?: run {
            return null
        }
    }

    fun delete(userId: Int): Boolean {
        userRepository.findById(userId).orElse(null)?.let {
            userRepository.delete(it)
            return true
        }
        return false
    }
}