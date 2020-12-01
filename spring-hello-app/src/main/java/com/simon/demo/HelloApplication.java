package com.simon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName HelloApplication
 * @Description TODO
 * @Author Simon
 * @Date 2020/12/1   9:52 上午
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
