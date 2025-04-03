package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "character")
@Getter
@Setter
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "comment")
    private String comment;

    @JoinColumn(name = "book")
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

}
