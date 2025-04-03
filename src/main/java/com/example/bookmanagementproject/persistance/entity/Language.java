package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "language")
@Getter
@Setter
public class Language {
    @Id
    private Long id;

    @Column(name ="language")
    private String language;
}
