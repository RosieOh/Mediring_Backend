package com.linked.app.config

import com.linked.app.service.auth.UserAuthenticationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer
import org.springframework.security.oauth2.provider.token.DefaultTokenServices
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore

@Configuration
class OAuth2Configuration {
    companion object {
        const val resourceId = "mediring-resource"
    }

    @Configuration
    @EnableResourceServer
    protected class ResourceServerConfiguration: ResourceServerConfigurerAdapter() {
        override fun configure(resources: ResourceServerSecurityConfigurer?) {
            resources?.resourceId(resourceId)
        }

        override fun configure(http: HttpSecurity?) {
            http?.headers()?.frameOptions()?.disable()
            http?.sessionManagement()?.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//            http?.authorizeRequests()?.anyRequest()?.permitAll()
            http?.authorizeRequests()?.antMatchers("/admin/login/**", "/session/login", "/session/logout", "/api/user/store")?.permitAll()
            http?.authorizeRequests()?.antMatchers("/auth/**", "/api/**")?.authenticated()
//            http?.authorizeRequests()?.antMatchers("/auth/**", "/user/**")?.authenticated()
//            http?.authorizeRequests()?.antMatchers("/auth/**", "/user/**")?.authenticated()
        }
    }

    @Configuration
    @EnableAuthorizationServer
    protected class AuthorizationServerConfiguration: AuthorizationServerConfigurerAdapter() {
        private val tokenStore = InMemoryTokenStore()

        @Autowired
        @Qualifier("authenticationManagerBean")
        private lateinit var authenticationManager: AuthenticationManager

        @Autowired
        private lateinit var userDetailsService: UserAuthenticationService

        @Throws(Exception::class)
        override fun configure(endpoints: AuthorizationServerEndpointsConfigurer?) {
            endpoints?.tokenStore(this.tokenStore)
                    ?.authenticationManager(this.authenticationManager)
                    ?.pathMapping("/oauth/token", "/oauth/token")
                    ?.pathMapping("/auth/revoke", "/auth/revoke")
                    ?.userDetailsService(userDetailsService)
                    ?.reuseRefreshTokens(true)
        }

        @Throws(Exception::class)
        override fun configure(security: AuthorizationServerSecurityConfigurer?) {
            security?.allowFormAuthenticationForClients()
        }

        @Throws(Exception::class)
        override fun configure(clients: ClientDetailsServiceConfigurer?) {
            clients?.inMemory()
                    ?.withClient("mediring-client")
                    ?.authorizedGrantTypes("refresh_token", "password")
                    ?.authorities("admin", "user")
                    ?.scopes("read", "write")
                    ?.secret(passwordEncoder().encode("mediring-secret"))
                    ?.accessTokenValiditySeconds(604800)
                    ?.refreshTokenValiditySeconds(604800)
        }

        @Bean
        @Primary
        fun tokenService(): DefaultTokenServices {
            val tokenService = DefaultTokenServices()
            tokenService.setSupportRefreshToken(true)
            tokenService.setTokenStore(this.tokenStore)
            return tokenService
        }

        @Bean
        @Primary
        fun tokenStore(): InMemoryTokenStore {
            return this.tokenStore
        }

        @Bean
        fun passwordEncoder(): PasswordEncoder {
            return BCryptPasswordEncoder()
        }
    }
}