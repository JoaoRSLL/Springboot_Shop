package com.springtest.spring_shop.repositories;

import com.springtest.spring_shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
