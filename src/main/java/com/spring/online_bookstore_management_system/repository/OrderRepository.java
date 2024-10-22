package com.spring.online_bookstore_management_system.repository;

import com.spring.online_bookstore_management_system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
