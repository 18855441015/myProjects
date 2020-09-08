package com.pay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: 刘爽
 * @Date: 2020/9/7 15:53
 **/
@RestController
public class PayController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/pay")
    public String paymentInfo(){
        return restTemplate.getForObject(serverURL + "/test/order/",String.class);
    }
}
