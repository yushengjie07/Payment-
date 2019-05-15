package com.qhit.ordersInfo.service;

import com.qhit.ordersInfo.pojo.OrdersInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
* Created by GeneratorCode on 2018/05/07
*/
public interface IOrdersInfoService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    OrdersInfo findById(Object id);

    List<OrdersInfo> search(OrdersInfo ordersInfo);


    void found(OrdersInfo ordersInfo, HttpServletRequest request, HttpServletResponse response) throws IOException;

    void execute(OrdersInfo ordersInfo, HttpServletRequest request, HttpServletResponse response) throws NoSuchAlgorithmException, IOException;


}