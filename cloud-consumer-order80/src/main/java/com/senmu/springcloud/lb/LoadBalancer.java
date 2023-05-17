package com.senmu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author : duanshaohao
 * @description : 自定义负载均衡算法接口
 * @createTime : 2023/5/17 22:30
 */
public interface LoadBalancer {
   /**
    * @description 返回实例
    * @author duanshaohao
    * @createTime  2023/5/17 22:42
    * @param serviceInstances
    */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
