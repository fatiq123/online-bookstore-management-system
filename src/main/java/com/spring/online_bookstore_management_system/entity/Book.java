package com.spring.online_bookstore_management_system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String title;

    @NotNull
    @Size(min = 2, max = 100)
    private String author;

    @NotNull
    @Min(1)
    private Double price;

    @NotNull
    @Min(0)
    private Integer stock;

    @ManyToMany(mappedBy = "books")
    private List<Cart> carts;

    @ManyToMany(mappedBy = "bookList")
    private List<Order> orders;

}
