package com.springtest.spring_shop.services;

import com.springtest.spring_shop.entities.Category;
import com.springtest.spring_shop.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository rep;

    public List<Category> findAll(){
        return rep.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = rep.findById(id);
        return obj.get();
    }

}
