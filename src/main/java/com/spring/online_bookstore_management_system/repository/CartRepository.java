package com.spring.online_bookstore_management_system.repository;

import com.spring.online_bookstore_management_system.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
