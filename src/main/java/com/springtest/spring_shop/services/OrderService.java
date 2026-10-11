package com.springtest.spring_shop.services;

import com.springtest.spring_shop.entities.Order;
import com.springtest.spring_shop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository rep;

    public List<Order> findAll(){
        return rep.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = rep.findById(id);
        return obj.get();
    }

}
