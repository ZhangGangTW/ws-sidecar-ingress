package com.ws.sidecar.ingress

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WsSidecarIngressApplication

fun main(args: Array<String>) {
    runApplication<WsSidecarIngressApplication>(*args)
}
