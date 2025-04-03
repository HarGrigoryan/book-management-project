package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book_award")
@Setter
@Getter
public class BookAward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="award")
    private Award award;
}
