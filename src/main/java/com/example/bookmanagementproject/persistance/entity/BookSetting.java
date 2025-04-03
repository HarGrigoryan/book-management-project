package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book_setting")
@Getter
@Setter
public class BookSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="setting")
    private Setting setting;

}
