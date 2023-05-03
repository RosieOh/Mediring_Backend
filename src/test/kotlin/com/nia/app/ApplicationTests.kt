package com.nia.app

import org.junit.jupiter.api.Test


//@SpringBootTest
class ApplicationTests {
//    private var passwordEncoder: PasswordEncoder = BCryptPasswordEncoder()

    @Test
    fun contextLoads() {
        val b: Byte = 0
        System.out.println("toBoolean : ${b.toBoolean()}")
        val t = true
        System.out.println("toByte : ${t.toByte()}")

//        System.out.println(passwordEncoder.encode("1"))
    }

    fun Byte.toBoolean(): Boolean {
        return when(this) {
            0.toByte() -> true
            else -> false
        }
    }

    fun Boolean.toByte(): Byte = if (this) 0 else 1
}
