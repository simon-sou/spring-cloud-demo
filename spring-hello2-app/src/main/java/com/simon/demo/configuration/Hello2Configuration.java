package com.simon.demo.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Hello2Configuration
 * @Description TODO
 * @Author Simon
 * @Date 2020/12/1   2:11 下午
 */

@Configuration
public class Hello2Configuration {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
