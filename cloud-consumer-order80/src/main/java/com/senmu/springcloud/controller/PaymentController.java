package com.senmu.springcloud.controller;

import com.senmu.springcloud.entities.CommonResult;
import com.senmu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-02-27 15:49
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class PaymentController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping()
    public CommonResult add(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, CommonResult.class);
    }

    @GetMapping("/{id}")
    public CommonResult detail(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
    }

}
