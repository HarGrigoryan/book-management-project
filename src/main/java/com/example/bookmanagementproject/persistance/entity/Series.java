package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "series")
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "series",cascade = CascadeType.MERGE)
    private List<Book> books;

}
