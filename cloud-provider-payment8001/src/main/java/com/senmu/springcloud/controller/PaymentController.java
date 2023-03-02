package com.senmu.springcloud.controller;

import com.senmu.springcloud.entities.CommonResult;
import com.senmu.springcloud.entities.Payment;
import com.senmu.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-02-27 15:49
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private IPaymentService paymentService;

    @PostMapping
    public CommonResult add(Payment payment){
        int result = paymentService.insert(payment);
        log.info("insert:" + result);

        if (result > 0){
            return new CommonResult(200, "新增数据成功");
        }else {
            return new CommonResult(500, "新增数据失败");
        }
    }

    @GetMapping("/{id}")
    public CommonResult<Payment> detail(Long id){
        Payment result = paymentService.getOneById(id);
        log.info("查询成功: " + result);

        if (result != null){
            return new CommonResult(200, "查询成功", result);
        }else {
            return new CommonResult(500, "查询失败");
        }

    }

}
