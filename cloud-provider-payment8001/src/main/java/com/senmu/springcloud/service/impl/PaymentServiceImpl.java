package com.senmu.springcloud.service.impl;

import com.senmu.springcloud.entities.Payment;
import com.senmu.springcloud.mapper.PaymentMapper;
import com.senmu.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-02-27 15:38
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    public int insert(Payment payment){
        return paymentMapper.insert(payment);
    }

    public  Payment getPaymentById(Long id){
        return paymentMapper.getPaymentById(id);
    }
}
