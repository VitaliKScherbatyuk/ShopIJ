package com.scherbatyuk.internet_shop.dao;

import com.scherbatyuk.internet_shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail (String email);
}
