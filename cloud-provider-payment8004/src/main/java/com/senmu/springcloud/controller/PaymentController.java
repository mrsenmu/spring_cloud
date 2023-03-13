package com.senmu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-03-13 16:28
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String servletPort;

    @GetMapping("/zk")
    public String getServletPort(){
        return servletPort + ":" + UUID.randomUUID();
    }
}
