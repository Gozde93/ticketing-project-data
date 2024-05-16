package com.cydeo.repository;

import com.cydeo.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String username);
    @Transactional
    void deleteByUserName(String username);
}
