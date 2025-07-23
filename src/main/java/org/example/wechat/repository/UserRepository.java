package org.example.wechat.repository;

import org.example.wechat.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhone(String phone);
} 