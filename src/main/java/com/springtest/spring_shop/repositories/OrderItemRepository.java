package com.springtest.spring_shop.repositories;

import com.springtest.spring_shop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
