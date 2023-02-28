package com.senmu.springcloud.service;

import com.senmu.springcloud.entities.Payment;
import com.senmu.springcloud.mapper.PaymentMapper;

import javax.annotation.Resource;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-02-27 15:37
 */
public interface IPaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    public int insert(Payment payment);

    /**
     * 查询
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
