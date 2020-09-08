package com.testLock.controller;

import com.testLock.entites.Stock;
import com.testLock.service.OrderService;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Description:订单服务
 * @Author: 刘爽
 * @Date: 2020/9/7 10:10
 **/
@RestController()
@RequestMapping("/test")
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/order")
    public void testLock(){

        RLock lock = redissonClient.getLock("lock");
        try {
            lock.tryLock(5,3, TimeUnit.SECONDS);
            System.out.println("当前是线程："+Thread.currentThread().getName() + "获得了锁");
            Stock stock = orderServiceImpl.getById(1);
            System.out.println("当前剩余库存："+stock.getGoods());
            stock.setGoods(stock.getGoods() - 1);
            orderServiceImpl.updateById(stock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            if(lock != null && lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

}
