package com.simon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName Hello2Application
 * @Description TODO
 * @Author Simon
 * @Date 2020/12/1   2:09 下午
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Hello2Application {
    public static void main(String[] args) {
        SpringApplication.run(Hello2Application.class,args);
    }
}
