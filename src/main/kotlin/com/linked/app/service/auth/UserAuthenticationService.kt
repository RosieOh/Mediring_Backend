package com.linked.app.service.auth

import com.linked.app.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserAuthenticationService: UserDetailsService {
    @Autowired
    private lateinit var userRepository: UserRepository

    @SuppressWarnings("serial")
    class SimpleUserDetails(private var loginId: String, private var password: String, extraRole: String, userId: Int): UserDetails {
        private var enabled = true
        private val authorities = HashSet<GrantedAuthority>()

        init {
            authorities.add(SimpleGrantedAuthority(extraRole))
        }

        override fun toString(): String {
            return "{enabled: '${isEnabled}', usid: '${loginId}', password: '${password}}'"
        }

        override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
            return this.authorities
        }

        override fun isEnabled(): Boolean {
            return this.enabled
        }

        override fun getUsername(): String {
            return this.loginId
        }

        override fun isCredentialsNonExpired(): Boolean {
            return this.enabled
        }

        override fun getPassword(): String {
            return this.password
        }

        override fun isAccountNonExpired(): Boolean {
            return this.enabled
        }

        override fun isAccountNonLocked(): Boolean {
            return this.enabled
        }

    }

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(usid: String?): UserDetails {
        return this.getUserDetailAccount(usid!!)
    }

    private fun getUserDetailAccount(account: String): SimpleUserDetails {
        this.userRepository.findByEmail(account)?.let { u ->
            return SimpleUserDetails(u.email!!, u.password!!, u.userRole!!, u.id!!)
        } ?: run {
            throw UsernameNotFoundException(account)
        }
    }
}