package com.senmu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-03-02 15:02
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
