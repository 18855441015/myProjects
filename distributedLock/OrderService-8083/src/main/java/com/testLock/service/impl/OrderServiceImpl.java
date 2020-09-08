package com.testLock.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.testLock.entites.Stock;
import com.testLock.mapper.StockMapper;
import com.testLock.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 刘爽
 * @Date: 2020/9/7 11:22
 **/
@Service
public class OrderServiceImpl extends ServiceImpl<StockMapper, Stock> implements OrderService {

}
