package com.geekster.e_commerce.controller;

import com.geekster.e_commerce.model.Order;
import com.geekster.e_commerce.service.orderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class orderController {
    @Autowired
    orderService orderService;

    @PostMapping("order")
    public String addOrder(@RequestBody List<Order> newOrder){
        return orderService.addOrder(newOrder);
    }

    @GetMapping("order/id/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderByID(id);
    }
}
