package com.qhit.ordersInfo.controller;

import com.qhit.ordersInfo.pojo.OrdersInfo;
import com.qhit.ordersInfo.service.IOrdersInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/** 
* Created by GeneratorCode on 2018/05/07
*/ 

@RestController 
@RequestMapping("/ordersInfo")
public class OrdersInfoController { 

    @Resource
    IOrdersInfoService ordersInfoService;

    @RequestMapping("/insert") 
    public void insert(OrdersInfo ordersInfo) {
        ordersInfoService.insert(ordersInfo); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer oid) { 
        ordersInfoService.delete(oid); 
    } 

    @RequestMapping("/update") 
    public void update(OrdersInfo ordersInfo) {
        ordersInfoService.update(ordersInfo); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(OrdersInfo ordersInfo) {
        ordersInfoService.updateSelective(ordersInfo); 
    } 

    @RequestMapping("/load") 
    public OrdersInfo load(Integer oid) {
        OrdersInfo ordersInfo = ordersInfoService.findById(oid);
        return ordersInfo; 
    } 

    @RequestMapping("/list") 
    public List<OrdersInfo> list()  {
        List<OrdersInfo> list = ordersInfoService.findAll();
        return list; 
    } 

    @RequestMapping("/search") 
    public List<OrdersInfo> search(OrdersInfo ordersInfo) {
        List<OrdersInfo> list = ordersInfoService.search(ordersInfo);
        return list; 
    }
    /**
     * 接收参数 创建订单
     */
    @RequestMapping("/found")
    public void found(OrdersInfo ordersInfo, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ordersInfoService.found(ordersInfo,request,response);
    }
    /**
     *验证通知 处理自己的业务
     */
    @RequestMapping("/execute")
    public void execute(OrdersInfo ordersInfo, HttpServletRequest request, HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
        ordersInfoService.execute(ordersInfo,request,response);
    }



} 
