package com.senmu.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 业务名称
 *
 * @author dsh
 * @date 2023-04-03 14:55
 */
@Configuration
public class RibbonRuleConfig {

    @Bean
    // 替换Ribbon中默认的负载均衡算法
    public IRule myRule(){
        return new RandomRule();
    }

}
