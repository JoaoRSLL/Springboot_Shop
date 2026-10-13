package com.springtest.spring_shop.services;

import com.springtest.spring_shop.entities.Product;
import com.springtest.spring_shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository rep;

    public List<Product> findAll(){
        return rep.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = rep.findById(id);
        return obj.get();
    }

}
