package com.linked.app.service

import com.linked.app.model.BuyListEntity
import com.linked.app.repository.BuyListRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BuyListService(private val buyListRepository: BuyListRepository) {
    fun findAll(): MutableList<BuyListEntity> {
        return buyListRepository.findAll()
    }

    @Transactional
    fun store(buylist: List<BuyListEntity>) {
        buyListRepository.saveAll(buylist)
    }
}