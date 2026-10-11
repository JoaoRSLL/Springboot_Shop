package com.springtest.spring_shop.repositories;

import com.springtest.spring_shop.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
