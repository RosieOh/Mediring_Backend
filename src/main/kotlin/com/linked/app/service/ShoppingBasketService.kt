package com.linked.app.service

import com.linked.app.model.ShoppingBasketEntity
import com.linked.app.repository.ShoppingBasketRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ShoppingBasketService(private val shoppingBasketRepository: ShoppingBasketRepository) {
    fun findAll(id: Int): MutableList<ShoppingBasketEntity> {
        return shoppingBasketRepository.findByUserId(userId = id)
    }

    @Transactional
    fun store(basket: ShoppingBasketEntity): ShoppingBasketEntity {
        return shoppingBasketRepository.save(basket)
    }

    @Transactional
    fun delete(id: Int): MutableList<ShoppingBasketEntity> {
        val basket = shoppingBasketRepository.findById(id).orElse(null)
        basket?.let {
            shoppingBasketRepository.delete(basket)
        }
        return shoppingBasketRepository.findByUserId(userId = id)
    }

    @Transactional
    fun deleteAll(baskets: List<ShoppingBasketEntity>) {
        shoppingBasketRepository.deleteAll(baskets)
    }
}