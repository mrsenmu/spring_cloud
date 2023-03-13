package com.senmu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-03-13 16:26
 */
@SpringBootApplication
@EnableDiscoveryClient // 用于向使用consul或zookeeper走位服务注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
