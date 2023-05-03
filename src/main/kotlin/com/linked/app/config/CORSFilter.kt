package com.linked.app.config

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class CORSFilter: Filter {
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val res = response as HttpServletResponse
        val req = request as HttpServletRequest
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "*");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "*");

        if ("OPTIONS".equals(req.getMethod(), ignoreCase = true)) {
            res.status = HttpServletResponse.SC_OK
        } else {
            chain?.doFilter(req, res)
        }
    }

    override fun init(filterConfig: FilterConfig?) {
    }

    override fun destroy() {
    }
}