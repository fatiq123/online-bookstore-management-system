package com.spring.online_bookstore_management_system.repository;

import com.spring.online_bookstore_management_system.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
