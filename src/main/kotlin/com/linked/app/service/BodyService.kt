package com.linked.app.service

import com.linked.app.model.BodyEntity
import com.linked.app.repository.BodyRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BodyService(private val bodyRepository: BodyRepository) {
    fun findAll(): List<BodyEntity> {
        return bodyRepository.findAllByIsActiveIsTrue()
    }

    fun find(id: Int): BodyEntity? {
        return bodyRepository.findById(id).orElse(null)
    }

    @Transactional
    fun store(bodyEntity: BodyEntity): BodyEntity {
        return bodyRepository.save(bodyEntity)
    }

    @Transactional
    fun delete(id: Int): Boolean {
        return try {
            bodyRepository.findById(id).orElse(null)?.let {
                it.isActive = false;
                bodyRepository.save(it)
                true
            } ?: run {
                false
            }
        } catch (e: Exception) {
            false
        }
    }
}