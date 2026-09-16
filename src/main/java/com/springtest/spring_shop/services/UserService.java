package com.springtest.spring_shop.services;

import com.springtest.spring_shop.entities.User;
import com.springtest.spring_shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        return rep.findAll();
    }

}
