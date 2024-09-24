package com.example.library_springboot.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    @Column(nullable = false)
    private Float price;

    @Column(name="number_of_books",nullable = false)
    private int numberOfBooks;

    @Column(name="total_money",nullable = false)
    private Float totalMoney;

}
