package com.testLock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:主启动类
 * @Author: 刘爽
 * @Date: 2020/9/3 17:09
 **/
@SpringBootApplication
@MapperScan("com.testLock.mapper")
@EnableDiscoveryClient
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
