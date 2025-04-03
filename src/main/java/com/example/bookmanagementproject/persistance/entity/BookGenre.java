package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="book_genre")
@Getter
@Setter
public class BookGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="genre")
    private Genre genre;


}
