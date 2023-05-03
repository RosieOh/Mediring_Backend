package com.linked.app.config

import com.linked.app.service.auth.UserAuthenticationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class SecurityConfig: WebSecurityConfigurerAdapter() {
    @Autowired
    private lateinit var userAuthDetailUserService: UserAuthenticationService

    @Throws(Exception::class)
    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.userDetailsService(userAuthDetailUserService)
    }

    @Bean
    @Throws(Exception::class)
    override fun authenticationManagerBean(): AuthenticationManager {
        return super.authenticationManagerBean()
    }

    @Bean
    override fun authenticationManager(): AuthenticationManager {
        return super.authenticationManager()
    }

    @Throws(java.lang.Exception::class)
    override fun configure(web: WebSecurity) {
        web.ignoring()
            .antMatchers("/css/**", "/script/**", "/images/**", "/fonts/**", "lib/**", "/h2-console/**", "img/**", "uploads/**")
    }
}
//@Configuration
//class WebConfig: WebMvcConfigurer {
//    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
//        registry.addResourceHandler("/uploads/**")
//            .addResourceLocations("classpath:/uploads/")
//    }
//}