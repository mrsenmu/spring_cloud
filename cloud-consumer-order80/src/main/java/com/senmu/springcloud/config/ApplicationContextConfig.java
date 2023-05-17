package com.senmu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-03-02 17:43
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced // 使用 @LoadBalanced 注解服务RestTemplate负载均衡的能力。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
