package com.linked.app.service

import com.linked.app.model.AddressEntity
import com.linked.app.repository.AddressRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AddressService(private val addressRepository: AddressRepository) {
    fun findAll(userId: Int): MutableList<AddressEntity> {
        return addressRepository.findByUserId(userId)
    }

    @Transactional
    fun store(userId: Int, address: String): AddressEntity {
        val addressEntity = AddressEntity()
        addressEntity.userId = userId
        addressEntity.postDetail = address
        addressEntity.isActive = true
        return addressRepository.save(addressEntity)
    }
}