package com.ws.sidecar.ingress.filter

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.cloud.gateway.filter.GlobalFilter
import org.springframework.core.Ordered
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Component
class CustomGlobalFilter : GlobalFilter, Ordered {
    val log: Logger = LoggerFactory.getLogger(CustomGlobalFilter::class.java)

    override fun filter(exchange: ServerWebExchange, chain: GatewayFilterChain): Mono<Void> {
        log.info("Request ID:${exchange.request.id}, ${exchange.request.method} - ${exchange.request.path}")
        return chain.filter(exchange)
    }

    override fun getOrder(): Int {
        return -1
    }
}