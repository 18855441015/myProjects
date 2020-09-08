package com.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: 刘爽
 * @Date: 2020/9/7 15:51
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PayStart {

    public static void main(String[] args) {
        SpringApplication.run(PayStart.class,args);
    }
}
