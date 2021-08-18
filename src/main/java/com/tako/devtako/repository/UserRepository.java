package com.tako.devtako.repository;

import com.tako.devtako.domain.Board;
import com.tako.devtako.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
