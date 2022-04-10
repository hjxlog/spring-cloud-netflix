package com.kuang.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule myRule() {
        return new MyRandomRule();//默认是轮循，现在我们自定义
    }
}
