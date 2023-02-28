package com.senmu.springcloud.mapper;

import com.senmu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-02-27 14:57
 */
@Mapper
public interface PaymentMapper {

    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
