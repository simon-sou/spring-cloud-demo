package com.simon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringCloudConfigApplication
 * @Description configserver 的启动类
 * @Author Simon
 * @Date 2019/11/7   8:44 下午
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }
}
