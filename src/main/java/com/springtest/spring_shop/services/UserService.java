package com.springtest.spring_shop.services;

import com.springtest.spring_shop.entities.User;
import com.springtest.spring_shop.repositories.UserRepository;
import com.springtest.spring_shop.services.exceptions.DatabaseException;
import com.springtest.spring_shop.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        return rep.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = rep.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return rep.save(obj);
    }

    public void delete(Long id){
        try {
            rep.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        try {
            User entity = rep.getReferenceById(id);
            updateData(entity, obj);
            return rep.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
