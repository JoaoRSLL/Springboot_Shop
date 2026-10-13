package com.springtest.spring_shop.repositories;

import com.springtest.spring_shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
